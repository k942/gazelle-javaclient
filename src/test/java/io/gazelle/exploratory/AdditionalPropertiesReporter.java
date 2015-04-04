package io.gazelle.exploratory;

import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.reflections.ReflectionUtils;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

public class AdditionalPropertiesReporter {

	private static Table<String, String, Set<Object>> props = HashBasedTable.create();

	public static void report(List<Object> objects) throws NoSuchFieldException, SecurityException,
			IllegalArgumentException, IllegalAccessException {
		for (Object object : objects) {
			reportAdditionalProperties(object);
		}
		// System.out.println(props);
		props.rowKeySet().forEach(k -> System.out.println(k + ":" + props.row(k)));
	}

	private static <R, C, V> V safeGet(Table<R, C, V> table, R rowKey, C columnKey, V value) {
		V originalValue = table.get(rowKey, columnKey);
		if (originalValue == null) {
			originalValue = value;
			table.put(rowKey, columnKey, originalValue);
		}
		return originalValue;
	}

	private static void addProp(String clazz, Map<String, Object> additionalProperties) {
		additionalProperties.forEach((k, v) -> safeGet(props, clazz, k, new HashSet<>()).add(v));
	}

	@SuppressWarnings("unchecked")
	private static void reportAdditionalProperties(Object object) throws NoSuchFieldException, SecurityException,
			IllegalArgumentException, IllegalAccessException {
		Field field = object.getClass().getDeclaredField("additionalProperties");
		field.setAccessible(true);
		Map<String, Object> additionalProperties = (Map<String, Object>) field.get(object);

		if (!additionalProperties.isEmpty()) {
			addProp(object.getClass().getName(), additionalProperties);
		}

		for (Field f : ReflectionUtils.getAllFields(object.getClass())) {
			f.setAccessible(true);
			if (f.getType().getPackage().getName().equals("io.gazelle.dto")) {
				reportAdditionalProperties(f.get(object));
			}
		}
	}

}

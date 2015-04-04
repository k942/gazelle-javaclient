package io.gazelle.apimock.utils;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

public enum DTOProvider {
	INSTANCE;

	private Map<Class<?>, Object> repository = Collections.synchronizedMap(new HashMap<>());
	private Map<Type, Object> repositoryList = Collections.synchronizedMap(new HashMap<>());
	private PodamFactory factory = new PodamFactoryImpl();

	public <T> T setInstance(Class<T> T) {
		T dto = factory.manufacturePojo(T);
		repository.put(T, dto);
		return dto;
	}

	@SuppressWarnings("unchecked")
	public <T> T getInstance(Class<T> T) {
		return (T) repository.get(T);
	}

	public Object setInstanceList(Type type) {
		@SuppressWarnings("rawtypes")
		List dto = factory.manufacturePojo(ArrayList.class, type);
		repositoryList.put(type, dto);
		return dto;
	}

	public Object getInstanceList(Type genericType) {
		return repositoryList.get(genericType);
	}

}

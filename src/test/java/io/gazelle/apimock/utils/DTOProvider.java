package io.gazelle.apimock.utils;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

public enum DTOProvider {
	INSTANCE;

	private Map<Class<?>, Object> repository = Collections.synchronizedMap(new HashMap<>());
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

}

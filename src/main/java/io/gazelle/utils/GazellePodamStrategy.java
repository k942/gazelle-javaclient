package io.gazelle.utils;

import org.apache.commons.lang3.RandomStringUtils;

import uk.co.jemos.podam.common.AttributeStrategy;

public class GazellePodamStrategy implements AttributeStrategy<Object> {

	@Override
	public Object getValue() {
		return RandomStringUtils.randomAlphanumeric(20);
	}

}
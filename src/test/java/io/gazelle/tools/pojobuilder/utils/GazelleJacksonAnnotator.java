package io.gazelle.tools.pojobuilder.utils;

import org.jsonschema2pojo.Jackson2Annotator;

public class GazelleJacksonAnnotator extends Jackson2Annotator {

	@Override
	public boolean isAdditionalPropertiesSupported() {
		return true;
	}
}

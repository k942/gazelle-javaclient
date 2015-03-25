package io.gazelle.tools.pojobuilder;

import org.jsonschema2pojo.Jackson2Annotator;

public class GazelleJacksonAnnotator extends Jackson2Annotator {

	@Override
	public boolean isAdditionalPropertiesSupported() {
		return false;
	}

}

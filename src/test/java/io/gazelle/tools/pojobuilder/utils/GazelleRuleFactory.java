package io.gazelle.tools.pojobuilder.utils;

import org.jsonschema2pojo.SchemaStore;
import org.jsonschema2pojo.rules.Rule;
import org.jsonschema2pojo.rules.RuleFactory;

import com.sun.codemodel.JDefinedClass;
import com.sun.codemodel.JPackage;
import com.sun.codemodel.JType;

public class GazelleRuleFactory extends RuleFactory {

	public GazelleRuleFactory(GazelleGenerationConfig gazelleGenerationConfig,
			GazelleJacksonAnnotator gazelleJacksonAnnotator, SchemaStore schemaStore) {
		super(gazelleGenerationConfig, gazelleJacksonAnnotator, schemaStore);
	}

	@Override
	public Rule<JPackage, JType> getObjectRule() {
		return new GazelleObjectRule(this);
	}

	@Override
	public Rule<JDefinedClass, JDefinedClass> getAdditionalPropertiesRule() {
		return new GazelleAdditionalPropertiesRule(this);
	}
}

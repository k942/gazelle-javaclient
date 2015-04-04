package io.gazelle.exploratory;

import io.gazelle.GazelleClient;
import io.gazelle.GazelleResources;
import io.gazelle.exploratory.explorers.ResourceExplorer;
import io.gazelle.exploratory.explorers.UserProfileExplorer;
import io.gazelle.policies.WhatcdRequestPolicy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class ExploratoryRunner {

	static List<ResourceExplorer> explorers = new ArrayList<>();
	static List<Object> dtos = new ArrayList<>();

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException,
			IllegalAccessException, JsonParseException, JsonMappingException, IOException {

		String gazelleUrl = args[0];
		String username = args[1];
		String password = args[2];

		GazelleClient gClient = GazelleClient.newInstance(gazelleUrl, username, password);
		gClient.enforce(WhatcdRequestPolicy.INSTANCE);

		GazelleResources gazelleResources = gClient.getResources();

		ExploratoryModule module = new ExploratoryModule(gazelleResources, ExploratoryConfig.load());

		Injector i = Guice.createInjector(module);
		explorers.add(i.getInstance(UserProfileExplorer.class));

		explorers.forEach(e -> dtos.addAll(e.build()));

		AdditionalPropertiesReporter.report(dtos);
	}

}

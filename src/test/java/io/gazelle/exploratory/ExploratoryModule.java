package io.gazelle.exploratory;

import io.gazelle.GazelleResources;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;

public class ExploratoryModule extends AbstractModule {

	private GazelleResources gazelleResources;
	private ExploratoryConfig config;

	public ExploratoryModule(GazelleResources gazelleResources, ExploratoryConfig config) {
		this.gazelleResources = gazelleResources;
		this.config = config;
	}

	@Provides
	GazelleResources getGazelleResources() {
		return gazelleResources;
	}

	@Provides
	ExploratoryConfig getExploratoryModule() {
		return config;
	}

	@Override
	protected void configure() {

	}

}

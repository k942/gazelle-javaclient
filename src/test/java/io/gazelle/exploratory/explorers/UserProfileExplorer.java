package io.gazelle.exploratory.explorers;

import io.gazelle.APIException;
import io.gazelle.GazelleResources;
import io.gazelle.dto.Userprofile;
import io.gazelle.exploratory.ExploratoryConfig;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.google.inject.Inject;

public class UserProfileExplorer implements ResourceExplorer {

	@Inject
	GazelleResources gazlRsrc;

	@Inject
	ExploratoryConfig config;
	
	Random rnd = new Random();

	@Override
	public List<Object> build() {
		List<Object> dtos = new ArrayList<>();
		dtos.addAll(randomUsers());
		return dtos;
	}
	
	private List<Object> randomUsers() {
		List<Object> dtos = new ArrayList<>();
		int nbUser = 0;
		while (nbUser < config.getNumberOfRandomUsers()) {
			try {
				Userprofile user = gazlRsrc.userProfile().get(Long.valueOf(rnd.nextInt(200000)));
				dtos.add(user);
				nbUser++;
			} catch (APIException e) {
				// ignore missing user
			}
		}
		return dtos;
	}

}

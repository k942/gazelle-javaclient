package io.gazelle.exploratory;

import java.io.File;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

public class ExploratoryConfig {

	@JsonIgnore
	static ObjectMapper mapper = new ObjectMapper(new YAMLFactory());

	private int numberOfRandomUsers;

	public static ExploratoryConfig load() {
		try {
			File configFile = new File(ExploratoryRunner.class.getResource("/exploratory.yaml").getPath());
			return mapper.readValue(configFile, ExploratoryConfig.class);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	/**
	 * @return the numberOfRandomUsers
	 */
	public int getNumberOfRandomUsers() {
		return numberOfRandomUsers;
	}

	/**
	 * @param numberOfRandomUsers
	 *            the numberOfRandomUsers to set
	 */
	public void setNumberOfRandomUsers(int numberOfRandomUsers) {
		this.numberOfRandomUsers = numberOfRandomUsers;
	}

}

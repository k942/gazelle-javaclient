package io.gazelle.jerseytest.ajaxapi;

import java.io.IOException;
import java.io.InputStream;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ResourceLoader {

	static ObjectMapper mapper = new ObjectMapper();

	public static String readJsonStringValueOf(InputStream stream) throws IOException {
		return mapper.readTree(stream).toString();
	}

}

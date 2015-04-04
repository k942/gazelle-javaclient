package io.gazelle;

import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;

public interface RESTClient {
	
	public <T> T get(WebTarget target, Class<T> responseType) throws APIException;
	public <T> T get(WebTarget target, GenericType<T> responseType) throws APIException;

}

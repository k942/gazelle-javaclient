package io.gazelle;

import javax.ws.rs.client.WebTarget;

public interface RESTClient {
	
	public <T> T get(WebTarget target, Class<T> responseType);

}

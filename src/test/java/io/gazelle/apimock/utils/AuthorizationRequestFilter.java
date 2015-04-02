package io.gazelle.apimock.utils;

import io.gazelle.apimock.resources.LoginResource;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;

@Secured
@Provider
public class AuthorizationRequestFilter implements ContainerRequestFilter {

	@Override
	public void filter(ContainerRequestContext requestContext) throws IOException {
		if (!requestContext.getCookies().get("session").getValue().equals(LoginResource.SESSION_COOKIE)) {
			requestContext.abortWith(Response.status(Response.Status.UNAUTHORIZED).build());
		}

	}
}
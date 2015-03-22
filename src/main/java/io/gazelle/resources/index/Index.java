package io.gazelle.resources.index;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Index {

	private String status;
	private Response response;

	/**
	 * 
	 * @return The status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * 
	 * @param status
	 *            The status
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * 
	 * @return The response
	 */
	public Response getResponse() {
		return response;
	}

	/**
	 * 
	 * @param response
	 *            The response
	 */
	public void setResponse(Response response) {
		this.response = response;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}

}

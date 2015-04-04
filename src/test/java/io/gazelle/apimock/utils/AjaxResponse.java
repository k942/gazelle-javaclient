package io.gazelle.apimock.utils;

public class AjaxResponse {

	private String status;
	private Object response;
	
	public AjaxResponse(String status, Object response) {
		this.status = status;
		this.response = response;
	}

	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Object getResponse() {
		return response;
	}
	public void setResponse(Object response) {
		this.response = response;
	}

}

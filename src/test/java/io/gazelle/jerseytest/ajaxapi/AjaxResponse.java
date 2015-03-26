package io.gazelle.jerseytest.ajaxapi;

import com.fasterxml.jackson.annotation.JsonRawValue;

public class AjaxResponse {
	
	String status;
	Object response;
	
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

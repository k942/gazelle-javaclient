package io.gazelle.jerseytest.ajaxapi;

import com.fasterxml.jackson.annotation.JsonRawValue;

public class AjaxResponse {
	
	String status;
	@JsonRawValue 
	String response;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getResponse() {
		return response;
	}
	public void setResponse(String response) {
		this.response = response;
	}
	
	

}

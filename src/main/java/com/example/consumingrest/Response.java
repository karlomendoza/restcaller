package com.example.consumingrest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Response {

	private String response;

	public Response() {
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	@Override
	public String toString() {
		return "Response{" +
				"response='" + response +
				'}';
	}
}
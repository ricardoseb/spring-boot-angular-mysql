package com.proyecto.tienda.util;
//lo que devuelve el backend
public class RestRespuesta {

	private Integer responseCode;
	private String message;
	
	public RestRespuesta (Integer responseCode, String message) {
		super();
		this.responseCode = responseCode;
		this.message = message;
	}
	public RestRespuesta (Integer responseCode) {
		super();
		this.responseCode = responseCode;
		
	}
	
	
	public Integer getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(Integer responseCode) {
		this.responseCode = responseCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
	
}

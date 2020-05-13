package com.walmart.dto;

public class ResponseDTO {
	
	private String imageReponse;

	public String getImageReponse() {
		return imageReponse;
	}

	public void setImageReponse(String imageReponse) {
		this.imageReponse = imageReponse;
	}

	@Override
	public String toString() {
		return "ResponseDTO [imageReponse=" + imageReponse + "]";
	}
}

package com.walmart.dto;

public class RequestDTO {
	
	private String image;

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "RequestDTO [image=" + image + "]";
	}	

}

package com.masai.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class ImageDTO {
    private Integer imageId;
    private String imageURL;
	public Integer getImageId() {
		return imageId;
	}
	
	public ImageDTO(Integer imageId, String imageURL) {
		super();
		this.imageId = imageId;
		this.imageURL = imageURL;
	}

	public void setImageId(Integer imageId) {
		this.imageId = imageId;
	}
	public String getImageURL() {
		return imageURL;
	}
	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}
}

package com.masai.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;


@AllArgsConstructor
@Data
@NoArgsConstructor
@ToString
public class MyError {

    private LocalDate localDate;
    private String message;
    private String description;
	public LocalDate getLocalDate() {
		return localDate;
	}
	public void setLocalDate(LocalDate localDate) {
		this.localDate = localDate;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public MyError() {
		super();
	}
	@Override
	public String toString() {
		return "MyError [localDate=" + localDate + ", message=" + message + ", description=" + description + "]";
	}
	
	

}

package com.personnel.springmvc.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FeedBack {

	private String name;
	@Id
	private String email;
	private String reading;
	private String code;
	private String rating;
	private String message;

	public FeedBack() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getReading() {
		return reading;
	}

	public void setReading(String reading) {
		this.reading = reading;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "FeedBack [name=" + name + ", email=" + email + ", reading=" + reading + ", code=" + code + ", rating="
				+ rating + ", message=" + message + "]";
	}

}

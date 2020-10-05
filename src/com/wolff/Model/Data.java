package com.wolff.Model;

import javafx.scene.control.CheckBox;

public class Data {

	private String name;
	
	private String createdOn;
	
	private String phone;
	
	private long id;
	
	private String email;
	
	private CheckBox check;
	
	public Data() {
		
	}

	public Data(String name, String createdOn, String phone, String email) {
		
		this.name = name;
		this.createdOn = createdOn;
		this.phone = phone;
		this.id = id;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public CheckBox getCheck() {
		return check;
	}

	public void setCheck(CheckBox check) {
		this.check = check;
	}

	@Override
	public String toString() {
		return "Data [name=" + name + ", createdOn=" + createdOn + ", phone=" + phone + ", id=" + id + ", email="
				+ email + ", check=" + check + "]";
	}
	
	
}

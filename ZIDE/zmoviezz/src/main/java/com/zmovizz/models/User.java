//$Id$
package com.zmovizz.models;

public class User {
	private int id;
	private String password;
	private String name;
	private int role;
	private long phoneNumber;
	private int location;
	private long createdAt;
	public User() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRole() {
		return role;
	}
	public void setRole(Integer role) {
		this.role = role;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getLocation() {
		return location;
	}
	public void setLocation(Integer location) {
		this.location = location;
	}
	public long getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Long createdAt) {
		this.createdAt = createdAt;
	}
	
	

}

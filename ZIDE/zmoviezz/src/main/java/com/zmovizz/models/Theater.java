//$Id$
package com.zmovizz.models;

public class Theater {
	private int id;
	private String name;
	private int manager ;
	private int location;
	private String address;
	public int getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getManager() {
		return manager;
	}
	public void setManager(Integer manager) {
		this.manager = manager;
	}
	public int getLocation() {
		return location;
	}
	public void setLocation(Integer locationId) {
		this.location = locationId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}

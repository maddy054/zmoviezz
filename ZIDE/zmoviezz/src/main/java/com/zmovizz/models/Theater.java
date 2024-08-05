//$Id$
package com.zmovizz.models;

public class Theater extends Show{
	private int theaterId;
	private String theaterName;
	private int manager ;
	private int location;
	private String address;
	public int getTheaterId() {
		return theaterId;
	}
	public void setTheaterId(int id) {
		this.theaterId = id;
	}
	public String getTheaterName() {
		return theaterName;
	}
	public void setTheaterName(String name) {
		this.theaterName = name;
	}
	public int getManager() {
		return manager;
	}
	public void setManager(int manager) {
		this.manager = manager;
	}
	public int getLocation() {
		return location;
	}
	public void setLocation(int locationId) {
		this.location = locationId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}

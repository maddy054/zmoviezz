//$Id$
package com.zmovizz.models;

import com.zmovizz.models.Constants.Status;

public class Ticket extends Payment{
	
	private int id;
	private int show;
	private int userId;
	private String seat;
	private Status status;
	private long bookingTime;
	private int payment;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getShow() {
		return show;
	}
	public void setShow(int show) {
		this.show = show;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getSeat() {
		return seat;
	}
	public void setSeat(String seat) {
		this.seat = seat;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public long getBookingTime() {
		return bookingTime;
	}
	public void setBookingTime(long time) {
		this.bookingTime = time;
	}
	public int getPayment() {
		return payment;
	}
	public void setPayment(int paymentId) {
		this.payment = paymentId;
	}
		
	

}

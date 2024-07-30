//$Id$
package com.zmovizz.models;

public class Ticket extends Show{
	private int id;
	private int show;
	private int userId;
	private String seat;
	private int status;
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
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
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

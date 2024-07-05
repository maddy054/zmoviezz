//$Id$
package com.zmovizz.models;

public class Ticket extends Payment{
	private int id;
	private int show;
	private int userId;
	private String seat;
	private int status;
	private long bookingTime;
	private int paymentId;
	
	public int getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getShow() {
		return show;
	}
	public void setShow(Integer show) {
		this.show = show;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
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
	public void setStatus(Integer status) {
		this.status = status;
	}
	public long getBookingTime() {
		return bookingTime;
	}
	public void setBookingTime(Long time) {
		this.bookingTime = time;
	}
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(Integer paymentId) {
		this.paymentId = paymentId;
	}
		
	

}

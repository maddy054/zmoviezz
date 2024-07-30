//$Id$
package com.zmovizz.models;

public class Payment extends Ticket {
	private int paymentId;
	private int mode;
	private int ticketAmount;
	private int payableAmount;
	private int paymentStatus;
	
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int PaymentId) {
		this.paymentId = PaymentId;
	}
	public int getMode() {
		return mode;
	}
	public void setMode(int mode) {
		this.mode = mode;
	}
	public int getTicketAmount() {
		return ticketAmount;
	}
	public void setTicketAmount(int ticketAmount) {
		this.ticketAmount = ticketAmount;
	}
	public int getPayableAmount() {
		return payableAmount;
	}
	public void setPayableAmount(int payaleAmount) {
		this.payableAmount = payaleAmount;
	}
	public int getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(int status) {
		this.paymentStatus = status;
	}
	
}

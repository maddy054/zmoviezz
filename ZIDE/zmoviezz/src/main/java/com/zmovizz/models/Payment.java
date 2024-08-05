//$Id$
package com.zmovizz.models;

import com.zmovizz.models.Constants.PaymentMode;
import com.zmovizz.models.Constants.Status;

public class Payment {
	private int paymentId;
	private PaymentMode mode;
	
	private int payableAmount;
	private Status paymentStatus;
	private long paymentTime;
	
	public long getPaymentTime() {
		return paymentTime;
	}
	public void setPaymentTime(long paymentTime) {
		this.paymentTime = paymentTime;
	}
	
	
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int PaymentId) {
		this.paymentId = PaymentId;
	}
	public PaymentMode getMode() {
		return mode;
	}
	public void setMode(PaymentMode mode) {
		this.mode = mode;
	}

	public int getPayableAmount() {
		return payableAmount;
	}
	public void setPayableAmount(int payaleAmount) {
		this.payableAmount = payaleAmount;
	}
	public Status getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(Status status) {
		this.paymentStatus = status;
	}
	
}

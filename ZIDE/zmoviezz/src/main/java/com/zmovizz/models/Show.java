//$Id$
package com.zmovizz.models;

public class Show extends Movie {
	private int showId;
	private long time;
	private int ticketPrice;
	private int movie;
	private int status = 0;
	private int offer = 0;
	private int theater;
	
	
	public int getTheater() {
		return theater;
	}
	public void setTheater(int theater) {
		this.theater = theater;
	}
	
	public int getShowId() {
		return showId;
	}
	public void setShowId(int id) {
		this.showId = id;
	}
	public long getTime() {
		return time;
	}
	public void setTime(long time) {
		this.time = time;
	}
	public int getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(int ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	
	public int getMovie() {
		return movie;
	}
	public void setMovie(int movie) {
		this.movie = movie;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getOffer() {
		return offer;
	}
	public void setOffer(int offer) {
		this.offer = offer;
	}
	

}

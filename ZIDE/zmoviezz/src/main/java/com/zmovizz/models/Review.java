//$Id$
package com.zmovizz.models;

public class Review {
	private int id;
	private int target;
	private int userId;
	private String description;
	private int rating;
	private int reviewFor;
	private long time;
	public int getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getTarget() {
		return target;
	}
	public void setTarget(Integer target) {
		this.target = target;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}
	public int getReviewFor() {
		return reviewFor;
	}
	public void setReviewFor(Integer reviewfor) {
		this.reviewFor = reviewfor;
	}
	public long getTime() {
		return time;
	}
	public void setTime(Long time) {
		this.time = time;
	}
	

}

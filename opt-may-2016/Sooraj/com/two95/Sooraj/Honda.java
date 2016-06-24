package com.two95.Sooraj;

public class Honda extends Car{
	private int mileage;
	private String cost;
	private String engineNo;
	private Showroom showroom;
	
	public Showroom getShowroom() {
		return showroom;
	}
	public void setShowroom(Showroom showroom) {
		this.showroom = showroom;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	public Honda(){
		
	}
	public Honda(int mileage, String cost) {
		
		this.mileage = mileage;
		this.cost = cost;
	}
	
	public Honda(int mileage, String cost, String engineNo, Showroom showroom) {
		super();
		this.mileage = mileage;
		this.cost = cost;
		this.engineNo = engineNo;
		this.showroom = showroom;
	}
	public String getEngineNo() {
		return engineNo;
	}
	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}
	@Override
	public String toString() {
		return "Honda [mileage=" + mileage + ", cost=" + cost + ", engineNo=" + engineNo + "]";
	}
	

}

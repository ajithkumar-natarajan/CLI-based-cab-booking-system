package com.zoho.cabbookingsystemv2;

public class Location{  
	private int locationX;
	private int locationY;
	
	public void setLocation(int locX, int locY){
		this.locationX = locX;
		this.locationY = locY;
	}
	
	public int readLocationX(Location object) {
		return object.locationX;
	}
	
	public int readLocationX() {
		return this.locationX;
	}
	
	public int readLocationY(Location object) {
		return object.locationY;
	}
	
	public int readLocationY() {
		return this.locationY;
	}
}
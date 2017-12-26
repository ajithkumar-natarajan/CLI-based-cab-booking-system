package com.zoho.cabbookingsystemv2;

public class Cab{

	private Location cabLocation = new Location();

	public void setCabLocation(int locX, int locY){
		cabLocation.setLocation(locX, locY);
	}
	
	public Location readLocation(Cab Object) {
		return Object.cabLocation;
	}
}
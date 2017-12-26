package com.zoho.cabbookingsystemv2;

public class Estimate {
	private double closestCab = Double.MAX_VALUE;
	private Location customerPickupLocation = new Location();
	private Location customerDropLocation = new Location();
	
	public void setCustomerPickupDetails(Location pickUp) {
		customerPickupLocation.setLocation(pickUp.readLocationX(), pickUp.readLocationY());
	}
	
	public void setCustomerDropDetails(Location drop) {
		customerDropLocation.setLocation(drop.readLocationX(), drop.readLocationY());
	}
	
	public String findNearestCab(int valueX, int valueY) {
		double distance = Math.sqrt((customerPickupLocation.readLocationX()-valueX)*(customerPickupLocation.readLocationX()-valueX) + (customerPickupLocation.readLocationY()-valueY)*(customerPickupLocation.readLocationY()-valueY));
		if (closestCab>distance) {
			closestCab = distance;
			return "Flag";
		}
		return "No flag";
	}
	
	public int findNearestCabDistance() {
		return (int) closestCab;
	}
	
	public int totalCost(int cost) {
		double travelDist = Math.sqrt((customerPickupLocation.readLocationX()-customerDropLocation.readLocationX())*(customerPickupLocation.readLocationX()-customerDropLocation.readLocationX()) + (customerPickupLocation.readLocationY()-customerDropLocation.readLocationY())*(customerPickupLocation.readLocationY()-customerDropLocation.readLocationY()));
		return (int) travelDist*cost;
	}
	
	public int totalTime(int speed) {
		double travelDist = Math.sqrt((customerPickupLocation.readLocationX()-customerDropLocation.readLocationX())*(customerPickupLocation.readLocationX()-customerDropLocation.readLocationX()) + (customerPickupLocation.readLocationY()-customerDropLocation.readLocationY())*(customerPickupLocation.readLocationY()-customerDropLocation.readLocationY()));
		return (int) travelDist*60/speed;
	}
}
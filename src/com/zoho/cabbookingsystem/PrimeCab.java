package com.zoho.cabbookingsystemv2;

import java.util.HashMap;

public class PrimeCab extends Cab{

	private int noOfSeats = 6;
	private int ratePerKM = 10;
	private int averageKMpH = 60;
	private int noOfDriversAvailable = 3;
	private HashMap<Integer,Cab> driverIndex = new HashMap<Integer,Cab>();
	private Cab Driver_1 = new Cab();
	private Cab Driver_2 = new Cab();
	private Cab Driver_3 = new Cab();
	
	public PrimeCab() {
//		Driver_1.setCabLocation(16, 26);
		Driver_1.setCabLocation(10, 15);
		driverIndex.put(driverIndex.size()+1, Driver_1);
		Driver_2.setCabLocation(15, 1);
		driverIndex.put(driverIndex.size()+1, Driver_2);
		Driver_3.setCabLocation(20, 20);
		driverIndex.put(driverIndex.size()+1, Driver_3);
	}
	
	public Location readPrimeCabLocations(int index) {
		Cab value = driverIndex.get(index);
		return value.readLocation(value);
	}
	
	public int readLocationX(Location obj) {
		return obj.readLocationX(obj);
	}
	
	public int readLocationY(Location obj) {
		return obj.readLocationY(obj);
	}
	
	public int getDriverCount() {
		return noOfDriversAvailable;
	}
	
	public int readSeatAvailability() {
		return noOfSeats;
	}
	
	public int getRatePerKM() {
		return ratePerKM;
	}
	
	public int getAverageSpeed() {
		return averageKMpH;
	}
}
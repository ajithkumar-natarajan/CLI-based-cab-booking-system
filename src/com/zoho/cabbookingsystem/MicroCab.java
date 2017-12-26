package com.zoho.cabbookingsystemv2;

import java.util.HashMap;

public class MicroCab extends Cab{

	private int noOfSeats = 3;
	private int ratePerKM = 6;
	private int averageKMpH = 30;
	private int noOfDriversAvailable = 5;
	private HashMap<Integer,Cab> driverIndex = new HashMap<Integer,Cab>();
	private Cab Driver_1 = new Cab();
	private Cab Driver_2 = new Cab();
	private Cab Driver_3 = new Cab();
	private Cab Driver_4 = new Cab();
	private Cab Driver_5 = new Cab();
	
	public MicroCab() {
		Driver_1.setCabLocation(10, 15);
		driverIndex.put(driverIndex.size()+1, Driver_1);
		Driver_2.setCabLocation(18, 12);
		driverIndex.put(driverIndex.size()+1, Driver_2);
		Driver_3.setCabLocation(33, 21);
		driverIndex.put(driverIndex.size()+1, Driver_3);
		Driver_4.setCabLocation(8, 10);
		driverIndex.put(driverIndex.size()+1, Driver_4);
		Driver_5.setCabLocation(19, 21);
		driverIndex.put(driverIndex.size()+1, Driver_5);
	}
	
	public Location readMicroCabLocations(int index) {
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
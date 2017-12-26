package com.zoho.cabbookingsystemv2;

import java.util.HashMap;

public class MiniCab extends Cab{

	private int noOfSeats = 4;
	private int ratePerKM = 8;
	private int averageKMpH = 45;
	private int noOfDriversAvailable = 4;
	private HashMap<Integer,Cab> driverIndex = new HashMap<Integer,Cab>();
	private Cab Driver_1 = new Cab();
	private Cab Driver_2 = new Cab();
	private Cab Driver_3 = new Cab();
	private Cab Driver_4 = new Cab();
	
	public MiniCab() {
//		Driver_1.setCabLocation(6, 19);
		Driver_1.setCabLocation(10, 15);
		driverIndex.put(driverIndex.size()+1, Driver_1);
		Driver_2.setCabLocation(29, 12);
		driverIndex.put(driverIndex.size()+1, Driver_2);
		Driver_3.setCabLocation(24, 21);
		driverIndex.put(driverIndex.size()+1, Driver_3);
		Driver_4.setCabLocation(8, 1);
		driverIndex.put(driverIndex.size()+1, Driver_4);
	}
	
	public Location readMiniCabLocations(int index) {
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
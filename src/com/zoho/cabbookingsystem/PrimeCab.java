package com.zoho.cabbookingsystem;

import java.util.HashMap;
import java.util.Scanner;

	public class PrimeCab{

//	private int driverCount = 0;
	private Location primeCabDrivers = new Location();
//	private Location driver_2 = new Location();
//	private Location driver_3 = new Location();
//	private Location driver_4 = new Location();
	
//	private HashMap<String,Location> primeCabDrivers = new HashMap<String,Location>();
	
//	Scanner read = new Scanner(System.in);
	
	public void getDriverLocations() {
//		public void setDriverLocations() {
			primeCabDrivers.setLocation(10, 15);
//			driverCount++;
			primeCabDrivers.setLocation(18, 12);
//			driverCount++;
			primeCabDrivers.setLocation(8, 21);
//			driverCount++;
			primeCabDrivers.setLocation(13, 14);
//			driverCount++;
//			System.out.println(primeCabDrivers.driverCount());
//		} 
	}
	
	
	
	public int getDriverCount() {
		return primeCabDrivers.driverCount();
	}
	
    
//    public void displayDriverDetails() {
//    	driver_1.driverDetailDisp();
//    }
//    
//    public String currentLocation(String Driver) {
//		return driver_1.getCurrentLocation(Driver);
//	}
}
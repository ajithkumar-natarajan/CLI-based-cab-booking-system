package com.zoho.cabbookingsystem;

import java.util.HashMap;
import java.util.Scanner;

	public class MicroCab{

//	private int driverCount = 0;
	private Location microCabDrivers = new Location();
//	private Location driver_2 = new Location();
//	private Location driver_3 = new Location();
//	private Location driver_4 = new Location();
	
//	private HashMap<String,Location> MicroCabDrivers = new HashMap<String,Location>();
	
//	Scanner read = new Scanner(System.in);
	
	public void getDriverLocations() {
//		public void setDriverLocations() {
			microCabDrivers.setLocation(10, 15);
//			driverCount++;
			microCabDrivers.setLocation(18, 12);
//			driverCount++;
			microCabDrivers.setLocation(8, 21);
//			driverCount++;
			microCabDrivers.setLocation(13, 14);
//			driverCount++;
//			System.out.println(microCabDrivers.driverCount());
//		} 
	}
	
	
	
	public int getDriverCount() {
		return microCabDrivers.driverCount();
	}
	
    
//    public void displayDriverDetails() {
//    	driver_1.driverDetailDisp();
//    }
//    
//    public String currentLocation(String Driver) {
//		return driver_1.getCurrentLocation(Driver);
//	}
}
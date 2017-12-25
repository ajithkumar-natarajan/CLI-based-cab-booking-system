package com.zoho.cabbookingsystem;

import java.util.HashMap;
import java.util.Scanner;

	public class MiniCab{

//	private int driverCount = 0;
	private Location miniCabDrivers = new Location();
//	private Location driver_2 = new Location();
//	private Location driver_3 = new Location();
//	private Location driver_4 = new Location();
	
//	private HashMap<String,Location> miniCabDrivers = new HashMap<String,Location>();
	
//	Scanner read = new Scanner(System.in);
	
	public void getDriverLocations() {
//		public void setDriverLocations() {
			miniCabDrivers.setLocation(10, 15);
//			driverCount++;
			miniCabDrivers.setLocation(18, 12);
//			driverCount++;
			miniCabDrivers.setLocation(8, 21);
//			driverCount++;
			miniCabDrivers.setLocation(13, 14);
//			driverCount++;
//			System.out.println(miniCabDrivers.driverCount());
//		} 
	}
	
	
	
	public int getDriverCount() {
		return miniCabDrivers.driverCount();
	}
	
    
//    public void displayDriverDetails() {
//    	driver_1.driverDetailDisp();
//    }
//    
//    public String currentLocation(String Driver) {
//		return driver_1.getCurrentLocation(Driver);
//	}
}
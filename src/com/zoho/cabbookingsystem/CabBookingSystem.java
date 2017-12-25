package com.zoho.cabbookingsystem;

//import java.util.*;
//import java.io.*;
//import java.util.HashMap;
//import java.util.Map.Entry;
//import java.util.Set;
//import java.util.Scanner;
//import com.zoho.cabbookingsystem.*;
	
public class CabBookingSystem {
public static void main(String args[]){
	try {
		int driversAvailable;
		Customer customer = new Customer();
		customer.putCustomerDetails();
		Agency agent = new Agency();
//								agent.agencyDetails();
//		driv1.init();
//								agent.driverDetails();
//		agent.disp();
								
//								int locX = 0;
//								int custLocX = 0, custLocY = 0;
//								int drivLocX = 0, drivLocY = 0;
//								int destLocX = 0, destLocY = 0;
		boolean cabAvailable = false;
		
//										String custLoc = customer.currentLocation();
		int custLocX = customer.getCurrentLocationX();
//		System.out.println(custLocX);
		
		int custLocY = customer.getCurrentLocationY();
//		System.out.println(custLocY);
		
		int destnLocX = customer.getDestnLocationX();
//		System.out.println(destnLocX);
		
		int destnLocY = customer.getDestnLocationY();
//		System.out.println(destnLocY);
		
		String customerChoice = agent.getCustomerChoice();
		
		driversAvailable = agent.getDriversCount();
		System.out.println(driversAvailable);
//										for(String split:custLoc.split(",",0)){  
//											if(locX == 0) {
//												custLocX = Integer.parseInt(split);
//												locX = 1;
//											}
//											else
//												custLocY = Integer.parseInt(split);
//										}

//		System.out.print(custLocX);
//		System.out.println(" "+custLocY);
		
//											Estimate positions = new Estimate();
//											positions.orientation(custLocX,custLocY);
//											
//											for(int count=1;count<=agent.driverCount();count++) {
//												locX = 0;
//												String drivLoc = agent.currentLocation("Driver "+count);
//												for(String split:drivLoc.split(",",0)){  
//													if(locX == 0) {
//														drivLocX = Integer.parseInt(split);
//														locX = 1;
//													}
//													else
//														drivLocY = Integer.parseInt(split);
//												}
//									//			System.out.print(drivLocX);
//									//			System.out.println(" "+drivLocY);
//									//			System.out.println("");
//												positions.orientation(drivLocX,drivLocY);
//											}
		
//										//		positions.temp();
//												positions.measureDriverDistance();
//												int nearestDriver = positions.allot();
//										//		System.out.println(nearestDriver);
//												
//												if(nearestDriver<2)
//													nearestDriver = 2;
//												
//												if(nearestDriver<=4) {
//													System.out.println("");
//													System.out.println("Driver "+positions.nearestDriver()+" has been allotted, enjoy your ride!");
//													System.out.println("Estimated time for the driver to arrive is: "+(nearestDriver/2)+" minutes");
//													cabAvailable = true;
//												}
//		else
//			System.out.println("Sorry! No cabs are available now.");
//			throw new CabUnavailableException ("Sorry! No cabs are available right now.");
		
//														if(cabAvailable) {
//															String destLoc = customer.destnLocation();
//															locX = 0;
//															for(String split:destLoc.split(",",0)){  
//																if(locX == 0) {
//																	destLocX = Integer.parseInt(split);
//																	locX = 1;
//																}
//																else
//																	destLocY = Integer.parseInt(split);
//															}
//															
//															int cost = positions.totalCost(destLocX,destLocY);
//															
//															System.out.println("Approximate cost of your travel will be \u20B9"+cost);
//															System.out.println("Approximate travel time will be "+(cost*0.1875)+" minutes");
//														}
	} catch (Exception ex) {  
    System.out.println(ex.getMessage());
	}
}
}
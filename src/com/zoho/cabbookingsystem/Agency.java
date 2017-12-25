package com.zoho.cabbookingsystem;

//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.HashMap;
//import java.util.Map;
import java.util.Scanner;

	public class Agency{
	//private int driverLocX, driverLocY;
//	private int driverCount;
	private String cabType;
	private int noOfDriversAvailable;
	private Location driver = new Location();
	Scanner read = new Scanner(System.in);
	
	public Agency() {
		System.out.println("Enter the type of cab required (Micro / Mini / Prime): ");
//		depart.locationX = read.nextInt();
//		depart.locationY = read.nextInt();
//		depart.Location(depart.locationX,depart.locationY);
		this.cabType = read.nextLine();

		switch(cabType){  
	    case "Micro": MicroCab microCustomer = new MicroCab();
	    microCustomer.getDriverLocations(); 
	    noOfDriversAvailable = microCustomer.getDriverCount();
	    break;  
	    
	    case "Mini": MiniCab miniCustomer = new MiniCab();
	    miniCustomer.getDriverLocations();
	    noOfDriversAvailable = miniCustomer.getDriverCount();
	    break;  
	    
	    case "Prime": PrimeCab primeCustomer = new PrimeCab();
	    primeCustomer.getDriverLocations();
	    noOfDriversAvailable = primeCustomer.getDriverCount();
	    break;
	    default: System.out.println("Invalid choice!");  
	    }
	}
	
	public String getCustomerChoice() {
		return cabType;
	}
	
	public int getDriversCount() {
		return noOfDriversAvailable;
	}
	
//										public void agencyDetails() {
//											System.out.println("Enter the total number of drivers available: ");
//											driverCount = read.nextInt();
//										    //read.close();
//										}
	
//												public int driverCount() {
//													return driverCount;
//												}
	
//	public void init() {
//		try {
//			FileWriter fw;
//			fw = new FileWriter("/Users/ajith-pt1787/eclipse-workspace/CabBookingSystem/src/dependency/Count.txt");  
//			fw.write(0);    
//	        fw.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}

//										public void driverDetails() {
//									    //for(start:driverCount) {
//										    for(int headCount=1;headCount<=driverCount;headCount++) {
//										    	System.out.println("Enter X and Y coordinate of driver "+headCount+"'s location: ");
//										    	//Scanner read = new Scanner(System.in);
//									//	    	int driverLocX = read.nextInt();
//									//	    	int driverLocY = read.nextInt();
//									//	    	driver.locationX = read.nextInt();
//									//	    	driver.locationY = read.nextInt();
//										    	driver.locate();
//										    	// read.close();
//												//list.put("Driver "+start,driverLocX+","+driverLocY);
//										    	driver.driverDetailPut(headCount, driver);
//										    }
//										}
//    
// // create our map
//    HashMap<String, Coordinates<Position>> list = new HashMap<String, List<Position>>();    
//
//    // populate it
//    Coordinates<Position> spot = new ArrayList<Position>();
//    spot.add(new Position("Driver "+start));
//    list.put("Driver "+start, spot);
//
//    // read from it
//    List<Person> bobs = peopleByForename["Bob"];
//    Person bob1 = bobs[0];
//    Person bob2 = bobs[1];
    
//												    public void disp() {
//												    	driver.driverDetailDisp();
//												    }
    
    public String currentLocation(String Driver) {
		return driver.currentLocation(Driver);
	}
}
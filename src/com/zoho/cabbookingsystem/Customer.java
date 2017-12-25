package com.zoho.cabbookingsystem;

//import java.util.Scanner;

//import loc.*;

public class Customer{  
//   private int custLocX, custLocY;
//   private int destnX, destnY;
	private Location depart = new Location();
	private Location arrival = new Location();
	
	
	public void putCustomerDetails() {
		System.out.println("Enter current X and Y coordinate of the customer: ");
//		depart.locationX = read.nextInt();
//		depart.locationY = read.nextInt();
//		depart.Location(depart.locationX,depart.locationY);
		depart.locate();
		    //read.close();
		System.out.println("Enter the X and Y coordinate of the destination: ");
//		arrival.locationX = read.nextInt();
//		arrival.locationY = read.nextInt();
//		arrival.Location(arrival.locationX,arrival.locationY);
		arrival.locate();
			//read.close();
		}
//	public Customer(int LocX, int LocY){
//	   this.custLocX = custLocX;
//	   this.custLocY = custLocY;
//	}
   
//	void destination(int destnX, int destnY) {
//	   this.destnX = destnX;
//	   this.destnY = destnY;
//	}

	public int getCurrentLocationX() {
		return depart.locationX();
	}
	
	public int getCurrentLocationY() {
		return depart.locationY();
	}
	
//									public String destnLocation() {
//										return arrival.currentLocation();
//									}
	
	public int getDestnLocationX() {
		return arrival.locationX();
	}
	
	public int getDestnLocationY() {
		return arrival.locationY();
	}
}
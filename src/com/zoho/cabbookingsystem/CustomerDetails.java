package com.zoho.cabbookingsystemv2;

import java.util.Scanner;

public class CustomerDetails{  
	private int locX, locY;
	private Location customerPickup = new Location();
	private Location customerDrop = new Location();
	
	Scanner read = new Scanner(System.in);
	
	public void readCustomerDetails() {
		System.out.println("Enter X and Y coordinate of the pick-up point: ");
		locX = read.nextInt();
		locY = read.nextInt();
		customerPickup.setLocation(locX, locY);
		System.out.println("Enter X and Y coordinate of the drop point: ");
		locX = read.nextInt();
		locY = read.nextInt();
		customerDrop.setLocation(locX, locY);
	}

	public int getPresentLocationX() {
		return customerPickup.readLocationX();
	}
	
	public int getPresentLocationY() {
		return customerPickup.readLocationY();
	}
	
	public int getDropLocationX() {
		return customerDrop.readLocationX();
	}
	
	public int getDropLocationY() {
		return customerDrop.readLocationY();
	}
	
	public Location getPickupLocation() {
		return customerPickup;
	}
	
	public Location getDropLocation() {
		return customerDrop;
	}
}
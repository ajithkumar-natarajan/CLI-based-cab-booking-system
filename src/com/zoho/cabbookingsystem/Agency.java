package com.zoho.cabbookingsystemv2;

import java.util.Scanner;
import java.util.HashMap;

class CabUnavailableException extends Exception
{
    public CabUnavailableException(String message)
    {
        super(message);
    }
}

public class Agency{
	private String cabType;
	private String closestDriver;
	private int nearestCabDistance;
	private int noOfDriversAvailable;
	private static HashMap<String,Location> driverDetails = new HashMap<String,Location>();
	Scanner read = new Scanner(System.in);
	Estimate estimates = new Estimate();
	
	public void getCabDetails() {
		System.out.println("Enter the type of cab required (Micro / Mini / Prime): ");
		this.cabType = read.nextLine();

		switch(cabType){  
	    case "Micro": MicroCab microCustomer = new MicroCab();
	    noOfDriversAvailable = microCustomer.getDriverCount();
	    for(int i=1; i<=noOfDriversAvailable; i++)
		{
			driverDetails.put("Driver "+(driverDetails.size()+1), microCustomer.readMicroCabLocations(i));
		}
	    break;
	    
	    case "Mini": MiniCab miniCustomer = new MiniCab();
	    noOfDriversAvailable = miniCustomer.getDriverCount();
	    for(int i=1; i<=noOfDriversAvailable; i++)
		{
			driverDetails.put("Driver "+(driverDetails.size()+1), miniCustomer.readMiniCabLocations(i));
		}
	    break;
	    
	    case "Prime": PrimeCab primeCustomer = new PrimeCab();
	    noOfDriversAvailable = primeCustomer.getDriverCount();
	    for(int i=1; i<=noOfDriversAvailable; i++)
		{
			driverDetails.put("Driver "+(driverDetails.size()+1), primeCustomer.readPrimeCabLocations(i));
		}
	    break;
	    default: System.out.println("Invalid choice!");  
	    }
	}
	
	public String readCustomerChoice() {
		return cabType;
	}
	
	public int readDriversCount() {
		return noOfDriversAvailable;
	}
	
	public void dispCabDetails() {
		
		for(int i=1; i<=driverDetails.size(); i++)
		{
			MicroCab microCustomer = new MicroCab();
			Location value = driverDetails.get("Driver "+i);
			System.out.println("Driver "+i+" :"+microCustomer.readLocationX(value)+" , "+microCustomer.readLocationY(value));
		}
	}
	
	public void allotNearestCab(Location pickUp) throws CabUnavailableException {
		estimates.setCustomerPickupDetails(pickUp);
		
		switch(cabType){  
	    case "Micro": 
	    	for(int i=1; i<=driverDetails.size(); i++)
			{
				MicroCab microCustomer = new MicroCab();
				Location value = driverDetails.get("Driver "+i);
				String nearestDriver = estimates.findNearestCab(microCustomer.readLocationX(value), microCustomer.readLocationY(value));
				if (nearestDriver.equals("Flag"))
					closestDriver = "Driver "+i;
			}
			nearestCabDistance = estimates.findNearestCabDistance();
			if(nearestCabDistance>4)
				throw new CabUnavailableException ("Sorry! No cabs are available right now.");
			MicroCab microCustomer = new MicroCab();
			System.out.println(closestDriver+" has been alotted! The driver will reach you in "+nearestCabDistance*60/microCustomer.getAverageSpeed()+ " minutes");
		break;
	    
	    case "Mini": 
	    	for(int i=1; i<=driverDetails.size(); i++)
			{
				MiniCab miniCustomer = new MiniCab();
				Location value = driverDetails.get("Driver "+i);
				String nearestDriver = estimates.findNearestCab(miniCustomer.readLocationX(value), miniCustomer.readLocationY(value));
				if (nearestDriver.equals("Flag"))
					closestDriver = "Driver "+i;
			}
			nearestCabDistance = estimates.findNearestCabDistance();
			if(nearestCabDistance>4)
				throw new CabUnavailableException ("Sorry! No cabs are available right now.");
			MiniCab miniCustomer = new MiniCab();
			System.out.println(closestDriver+" has been alotted! The driver will reach you in "+nearestCabDistance*60/miniCustomer.getAverageSpeed()+ " minutes");
		break;
	    
	    case "Prime": 
	    	for(int i=1; i<=driverDetails.size(); i++)
			{
				PrimeCab primeCustomer = new PrimeCab();
				Location value = driverDetails.get("Driver "+i);
				String nearestDriver = estimates.findNearestCab(primeCustomer.readLocationX(value), primeCustomer.readLocationY(value));
				if (nearestDriver.equals("Flag"))
					closestDriver = "Driver "+i;
			}
			nearestCabDistance = estimates.findNearestCabDistance();
			if(nearestCabDistance>4)
				throw new CabUnavailableException ("Sorry! No cabs are available right now.");
			PrimeCab primeCustomer = new PrimeCab();
			System.out.println(closestDriver+" has been alotted! The driver will reach you in "+nearestCabDistance*60/primeCustomer.getAverageSpeed()+ " minutes");
		break;
		}
	}
    
	public void dispApproxTravelDetails(Location drop) {
		estimates.setCustomerPickupDetails(drop);
		switch(cabType){  
	    case "Micro": 
	    	MicroCab microCustomer = new MicroCab();
			System.out.println("Approximate cost of your travel will be \u20B9"+estimates.totalCost(microCustomer.getRatePerKM()));
			System.out.println("Approximate travel time of your ride will be "+estimates.totalTime(microCustomer.getAverageSpeed())+" minutes");
	    break;
	    
	    case "Mini": 
	    	MiniCab miniCustomer = new MiniCab();
			System.out.println("Approximate cost of your travel will be \u20B9"+estimates.totalCost(miniCustomer.getRatePerKM()));
			System.out.println("Approximate travel time of your ride will be "+estimates.totalTime(miniCustomer.getAverageSpeed())+" minutes");
	    break;
	    
	    case "Prime": 
	    	PrimeCab primeCustomer = new PrimeCab();
			System.out.println("Approximate cost of your travel will be \u20B9"+estimates.totalCost(primeCustomer.getRatePerKM()));
			System.out.println("Approximate travel time of your ride will be "+estimates.totalTime(primeCustomer.getAverageSpeed())+" minutes");
	    break;
		}}
}
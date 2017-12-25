package com.zoho.cabbookingsystem;

//import java.lang.Math.*;

class CabUnavailableException extends Exception
{
    public CabUnavailableException(String message)
    {
        super(message);
    }
}

public class Estimate {
	private double[] locations = new double[100];
	private double[] distance = new double[50];
	private int index = 0;
	private int pairs = 0;
	private double smallest = Double.MAX_VALUE;
	private int driverAlotted = 0;

												//	public void orientation(int locX, int locY) {
												//		locations[index++] = locX;
												//		locations[index++] = locY;		
												//		pairs++;
												//	}
	
//	public void temp() {
//		System.out.println(locations[0]);
//		System.out.println(locations[1]);
//		System.out.println(locations[2]);
//		System.out.println(locations[3]);
//		System.out.println(locations[4]);
//		System.out.println(locations[5]);
//		int i=1;
//		System.out.println(Math.sqrt((locations[0]-locations[2*i])*(locations[0]-locations[2*i]) + (locations[1]-locations[(2*i)+1])*(locations[1]-locations[(2*i)+1])));
//		i=2;
//		System.out.println(Math.sqrt((locations[0]-locations[2*i])*(locations[0]-locations[2*i]) + (locations[1]-locations[(2*i)+1])*(locations[1]-locations[(2*i)+1])));
//		System.out.println(--i);
//		System.out.println(i);
//	}
	
	public void measureDriverDistance() {
		for(int i=1;i<pairs;i++) {
			distance[i-1] = Math.sqrt((locations[0]-locations[2*i])*(locations[0]-locations[2*i]) + (locations[1]-locations[(2*i)+1])*(locations[1]-locations[(2*i)+1]));
//			System.out.println(distance[i]);
		}
	}
	
	public int allot() throws CabUnavailableException {
//    	System.out.println(pairs);
	    for(int i =0;i<pairs-1;i++) {
	        if(smallest > distance[i]) {
//	        	System.out.println(distance[i]);
	            smallest = distance[i];
	            driverAlotted = i+1;
	        }
	    }
//	    System.out.println(smallest);
	    if(smallest>4) {
	    	throw new CabUnavailableException ("Sorry! No cabs are available right now.");
		}
	    return (int) (smallest);
	}
	
	public int nearestDriver() {
		return (int) driverAlotted;
	}
	
	public int totalCost(int locX, int locY) {
		double travelDist = Math.sqrt((locations[0]-locX)*(locations[0]-locX) + (locations[1]-locY)*(locations[1]-locY));
		return (int) travelDist*8;
	}
}
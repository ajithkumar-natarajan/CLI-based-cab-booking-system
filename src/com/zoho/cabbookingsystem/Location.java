package com.zoho.cabbookingsystem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//import java.io.*;

public class Location{  
	   //private int custLocX, custLocY;
	   //private int destnX, destnY;
	private int locationX;
	private int locationY;
	private int driverCount;
//	private int count = 0;
//	private String[] driverLocations = new String[20];

	private HashMap<String,Location> driverList = new HashMap<String,Location>();
	Scanner read = new Scanner(System.in);
	

	public Location() {
		
	}
//	public locate(int LocX, int LocY){
//		this.locationX = LocX;
//		this.locationY = LocY;
//	}
	public Location(int LocX, int LocY){
		this.locationX = LocX;
		this.locationY = LocY;
	}
	
	public void setLocation(int LocX, int LocY){
		this.locationX = LocX;
		this.locationY = LocY;
		driverCount = driverList.size()+1;
		driverList.put("Driver "+driverCount, new Location(this.locationX,this.locationY));
//		System.out.println("Size: "+driverList.size());
	}
	
	public void locate(){
		this.locationX = read.nextInt();
		this.locationY = read.nextInt();
	}
	
	public int driverCount() {
		return driverList.size();
	}
	
	public String toString() {
//		try {
//			FileWriter fw;
//			FileReader fr=new FileReader("/Users/ajith-pt1787/eclipse-workspace/CabBookingSystem/src/dependency/Count.txt");    
//	        int i;    
//	        while((i=fr.read())!=-1)    
//	        count = ((int)i);    
//	        fr.close();
//			fw = new FileWriter("/Users/ajith-pt1787/eclipse-workspace/CabBookingSystem/src/dependency/Count.txt");  
//			driverLocations[count] = locationX+","+locationY;
//			//System.out.println(driverLocations[count]); 
//			count++;
//			fw.write(count);   
//	        fw.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} 
		//System.out.println(count);
		return locationX+","+locationY;
	}
	
											//	public void driverDetailPut(int headCount, Location driver) {
											//    		list.put("Driver "+headCount, new Location(driver.locationX,driver.locationY));
											//	}
	
//	public void driverDetailPut(int driverCount) {//, Location driver) {
//		list.put("Driver "+driverCount, new Location(this.locationX,this.locationY));
//	}
	
//								public void driverDetailDisp() {
//									for(Map.Entry n:list.entrySet()){
//							    			System.out.println(n.getKey()+" - "+n.getValue());
//									}
//		try {
//			FileReader fr=new FileReader("/Users/ajith-pt1787/eclipse-workspace/CabBookingSystem/src/dependency/Count.txt");    
//	        int i;    
//	        while((i=fr.read())!=-1)    
//	        count = ((int)i);    
//	        fr.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		//System.out.println(count);
//		Location value = list.get("Driver 1");
		//String value1 = (String)value;
//		for(String w:value.split("\\s",0)){  
//			System.out.println(w);  
//			}  
//		System.out.println(value.locationX);
//		System.out.println(depart.);
//		for(int temp = 0; temp<count; temp++) {
//			
//			//System.out.println(driverLocations[temp]);  
//		}
	
//												public Location currentLocation() {
//													return (locationX+","+locationY);
//												}
	
	public String currentLocation(String Driver) {
		Location value = driverList.get(Driver);
//		System.out.println(value.locationX);
		return (value.locationX+","+value.locationY);
	}
	
	public int locationX() {
		return locationX;
	}
	
	public int locationY() {
		return locationY;
	}
	
	
//	   
//	void destination(int destnX, int destnY) {
//	   this.destnX = destnX;
//	   this.destnY = destnY;
//	}
}
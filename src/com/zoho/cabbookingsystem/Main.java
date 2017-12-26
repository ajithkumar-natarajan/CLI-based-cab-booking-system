package com.zoho.cabbookingsystemv2;

	
public class Main {
public static void main(String args[]){
	try {
			CustomerDetails customer = new CustomerDetails();
			customer.readCustomerDetails();
			Agency cabRequest = new Agency();
			cabRequest.getCabDetails();
			cabRequest.allotNearestCab(customer.getPickupLocation());
			cabRequest.dispApproxTravelDetails(customer.getDropLocation());
		} catch (Exception ex) {  
		    System.out.println(ex.getMessage());
		}
	}
}
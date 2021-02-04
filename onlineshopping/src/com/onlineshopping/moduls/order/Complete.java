package com.onlineshopping.moduls.order;

/**
 * This is an order complete model class
 * 
 *
 */

public class Complete extends Order{

	private String pickupLocation;
	private boolean isDelivered;
	
	public String getPickupLocation() {
		return pickupLocation;
	}
	public void setPickupLocation(String pickupLocation) {
		this.pickupLocation = pickupLocation;
	}
	public boolean isDelivered() {
		return isDelivered;
	}
	public void setDelivered(boolean isDelivered) {
		this.isDelivered = isDelivered;
	}
	
}

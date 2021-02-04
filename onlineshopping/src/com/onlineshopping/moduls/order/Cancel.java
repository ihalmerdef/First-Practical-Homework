package com.onlineshopping.moduls.order;

/**
 * This is a cancel order model class
 * 
 *
 */
public class Cancel extends Order {

	private boolean refund;

	public boolean isRefund() {
		return refund;
	}

	public void setRefund(boolean refund) {
		this.refund = refund;
	}
	
}

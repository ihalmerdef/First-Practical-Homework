package com.onlineshopping.moduls.customer;

import java.util.Set;

/**
 * This class is a customer model class
 
 */
public class Customer {

	//Customer instance variables
	private String customerID;
	private String customerFName;
	private String customerLName;	
	private Set<Address> addresses;
	private Set<Phone> phones;
	private Set<Bill> billingsInfo;
		
	
	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	public String getFirstName() {
		return customerFName;
	}
	public void setFirstName(String FirstName) {
		this.customerFName = FirstName;
	}
	public String getLastName() {
		return customerLName;
	}
	public void setLastName(String LastName) {
		this.customerLName = LastName;
	}
	public Set<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}
	public Set<Phone> getPhones() {
		return phones;
	}
	public void setPhones(Set<Phone> phones) {
		this.phones = phones;
	}
	public Set<Bill> getBillingsInfo() {
		return billingsInfo;
	}
	public void setBillingsInfo(Set<Bill> billingsInfo) {
		this.billingsInfo = billingsInfo;
	}
	
	
	
}

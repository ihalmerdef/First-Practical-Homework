package com.onlineshopping.moduls.partner;

import java.util.Set;

import com.lsmp.mp.customer.Address;
import com.lsmp.mp.customer.Customer;
import com.lsmp.mp.customer.Phone;
import com.lsmp.mp.product.Product;

/**
 * This is partner model class
 *
 *
 */
public class Partner extends Customer{

	//Instances
	private Integer partnerID;
	private String partnerFName;
	private String partnerLName;
	private Set<Phone> phones;
	private Set<Address> addresses;
	private Set<Product> products;
		
	
	public Integer getPartnerID() {
		return partnerID;
	}
	public void setPartnerID(Integer partnerID) {
		this.partnerID= partnerID;
	}
	public String getPartnerFirstName() {
		return partnerFName;
	}
	public void setSellerName(String partnerLName) {
		this.partnerLName = partnerLName;
	}
	
public Set<Phone> getPhones() {
		return phones;
	}
	public void setPhones(Set<Phone> phones) {
		this.phones = phones;
	}
	public Set<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(Set<Address> addresses) {
		this.addresses=addresses;
	}
	public Set<Product> getProducts() {
		return products;
	}
	public void setProducts(Set<Product> products) {
		this.products = products;
	}
	
}

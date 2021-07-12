package com.training.model;

public class Address {

	private String city;
	private int pincode;
	private String AddressLine1;
	private String AddressLine2;
	public Address(String city, int pincode, String addressLine1, String addressLine2) {
		super();
		this.city = city;
		this.pincode = pincode;
		AddressLine1 = addressLine1;
		AddressLine2 = addressLine2;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getAddressLine1() {
		return AddressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		AddressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return AddressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		AddressLine2 = addressLine2;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", pincode=" + pincode + ", AddressLine1=" + AddressLine1 + ", AddressLine2="
				+ AddressLine2 + "]";
	}
	
}

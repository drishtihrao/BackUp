package com.cg.springframework.add;

public class Address {
	private String line1, line2, city, state, country;
	private int pincode;
	public Address(String line1, String line2, String city, String state, String country, int pincode) {
		super();
		this.line1 = line1;
		this.line2 = line2;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [line1=" + line1 + ", line2=" + line2 + ", city=" + city + ", state=" + state + ", country="
				+ country + ", pincode=" + pincode + "]";
	}
	
	
}

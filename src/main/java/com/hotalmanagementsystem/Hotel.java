package com.hotalmanagementsystem;

public class Hotel {
	int ratesForRegularCustomer;
	String name;

	/**
	 * getter setter method for set or get value
	 * 
	 * @return actual value
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRatesForRegularCustomer() {
		return ratesForRegularCustomer;
	}

	public void setRatesForRegularCustomer(int ratesForRegularCustomer) {
		this.ratesForRegularCustomer = ratesForRegularCustomer;
	}

	public String toString() {
		return "\n HotelName='" + name + '\'' + ", Rate for regular customer'" + ratesForRegularCustomer + '\'';
	}
}
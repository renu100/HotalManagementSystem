package com.hotalmanagementsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class HotelManagmentSystem {
	ArrayList<Hotel> hotelList = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	/**
	 * purpose: to add hotal in list
	 * 
	 * @param hotelName
	 * @param rateForRegularCustomer
	 * @return boolean
	 */
	public boolean addHotel(String hotelName, int rateForRegularCustomer) {
		Hotel hotel = new Hotel();
		hotel.name = hotelName;
		hotel.ratesForRegularCustomer = rateForRegularCustomer;
		hotelList.add(hotel);
		return true;
	}
}

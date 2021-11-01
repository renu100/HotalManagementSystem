package com.hotalmanagementsystem;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for hotal management system
 */
public class HotelTest {
	@Test
	public void HotelWhenAddedShouldReturnTrue() {
		HotelManagmentSystem h1 = new HotelManagmentSystem();
		boolean result, result2, result3;
		result = h1.addHotel("Lakewood", 110);
		result2 = h1.addHotel("Bridgewood", 150);
		result3 = h1.addHotel("Ridgewood", 220);
		Assert.assertTrue(result);
		Assert.assertTrue(result2);
		Assert.assertTrue(result3);
	}
}

package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.Date;

class DateTest {

	@Test
	void testFindAlldate() {
		assertEquals("03/june/2018",Date.findAllDate("03,06,2018"));
	}

}

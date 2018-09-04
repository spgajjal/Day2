package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.Missing;

class MissingTest {

	@Test
	void testFindMissing() {
		int[] arr= {7,3,4,5,6,1};
		assertEquals(2,Missing.findMissing(arr)) ;
	}

}

package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.MultiDimension;

class MultiDimensionTest {

	@Test
	void test() {
		assertEquals(1, MultiDimension.search(new int[][] {{2,3,4}, {5,6,7}},2,3,7));
				
	}

}

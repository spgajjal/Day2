package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.AvgMarks;

class AvgMarksTest {

	@Test
	void test() {
		int a[][]  ={{1, 2, 3}, {4, 5, 6},{7,7,8}};
	             
	         assertArrayEquals(new int[] {1,2,2,3,4,5,5,6,6,7,7,8},AvgMarks.calculateAvg(a));
	}
}


package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.Bubble;

class BubbleTest {

	@Test
	void testBubblesort() {
		 assertArrayEquals(new int[] {1,5,12,14,6,78,19,1,23,26,35,37,7,52,86,47}, Bubble.Bubblesort(new int[] {1,5,12,14,6,78,19,1,23,26,35,37,7,52,86,47}));

}
}

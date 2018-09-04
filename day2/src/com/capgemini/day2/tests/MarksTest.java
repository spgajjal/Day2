package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.Marks;

class MarksTest {

	@Test
	void test() {
		
		assertEquals(1, Marks.calculateMarks(60,70,70));
	}

}

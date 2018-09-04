package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.Cui;

class CuiTest {

	@Test
	void test() {
		assertEquals(1,Cui.checkCui("spandhu","1234","spandhu","1234"));
	}

}

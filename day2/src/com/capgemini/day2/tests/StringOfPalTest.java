package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.StringOfPal;

class StringOfPalTest {

	@Test
	void test() {
		assertArrayEquals(new String[]{"abba","aca","aa",null,null,null,null,null,null,null}, StringOfPal.check(new String[] {"abba","gstshj","aa","bcab","aca"}));
	}

}

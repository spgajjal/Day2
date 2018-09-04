package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.Compoundintrst;

class CompoundintrstTest {

	@Test
	void test() {
		double arr[]= {20,21};
		assertArrayEquals(arr,Compoundintrst.Compoundintrst(100,10,2),0.1);
	}

	
}

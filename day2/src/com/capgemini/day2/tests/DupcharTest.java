package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.DuplicateCheck;

class DupcharTest {

	@Test
	void test() {
		assertEquals("abc", DuplicateCheck.checkDuplicates("abcabcabc"));
	}

}

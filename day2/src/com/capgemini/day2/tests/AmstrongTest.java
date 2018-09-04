
package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.Armstrong;

class AmstrongTest {

	@Test
	void testCheckAmstrongNumber() {

		assertEquals(true,Armstrong.checkAmstrongNumber(153));
	}

}

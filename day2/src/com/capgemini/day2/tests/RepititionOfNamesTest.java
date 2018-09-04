package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.RepititionOfNames;

class RepititionOfNamesTest {

	@Test
	void test() {
		String names[]= {"Dave","Ann","George","Sam","Ted","Gag","Saj","Agati","Mary","Sam","Ayan","Dey","Meery","Smith","Johnson","Bill","Williams",
				"Jones","Brown","Davis","Miller","Wilson","Moore","Taylor","Anderson","Thomas","Jackson"};
		assertEquals(2,RepititionOfNames.countRepeat(names,"Sam"));
		//fail("Not yet implemented");
	}

}

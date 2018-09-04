package com.capgemini.day2.tests;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.Diff;

class DiffTest {

	@Test
	void test() {
		int arr[]= {1,2,5,6,4,7,9,3};
		int arr1[][]= {{1,4},{2,5},{3,6},{4,7},{6,9}};
	assertArrayEquals(arr1,Diff.findDiff(arr,3));
	}
}

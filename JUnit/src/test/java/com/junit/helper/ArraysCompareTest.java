package com.junit.helper;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

class ArraysCompareTest {

	@Test
	public void testArraysSort() {
		int[] numbers = { 12, 3, 4, 1 };
		int[] expected = { 1, 3, 4, 12 };
		Arrays.sort(numbers);

		assertArrayEquals(expected, numbers);

	}

//
//	@test(expected=NullPointerException.class)
//	public void testArraysSortNull() {
//		int[] numbers = null;
//		Arrays.sort(numbers);
//
//	}
	
	@Timeout(1000)
	public void testSort_performance() {
		int array[]= {12,23,4};
		for(int i=1;i<100000;i++)
		{
			array[0]=i;
			Arrays.sort(array);
		}
	}

}

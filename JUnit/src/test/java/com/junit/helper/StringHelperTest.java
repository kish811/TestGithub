package com.junit.helper;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

public class StringHelperTest {

	
	//AACD =CD ,ACDI , AAAA,ABCD
	@Test
	public  void testTruncateAInFirst2Positions() {
		StringHelper helper = new StringHelper();
		
		
		assertEquals("CD",helper.truncateAInFirst2Positions("AACD"));
	//	assertEquals("CD",helper.truncateAInFirst2Positions("AACD"));

	}

	
	@Test
	public  void testTruncateAInFirst2Positions2() {
		StringHelper helper = new StringHelper();
		
		
	//	assertEquals("CD",helper.truncateAInFirst2Positions("AACD"));
		assertEquals("",helper.truncateAInFirst2Positions("AA"));

	}
	
	@Test
	public void testareFirstAndLastTwoCharactersTheSame() {
		StringHelper helper = new StringHelper();

		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}

}

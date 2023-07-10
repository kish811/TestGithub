package com.junit.helper;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringHelperParameterizedTest {

	StringHelper helper = new StringHelper();

	@Parameters
		public static Collection testCondition() {
		String expectedOutputs[][]={{"AACD","CD"},	{"ACD","CD"}};
		return Arrays.asList(expectedOutputs);
		
	}

	// AACD =CD ,ACDI , AAAA,ABCD
	@Test
	public void testTruncateAInFirst2Positions() {

		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
		// assertEquals("CD",helper.truncateAInFirst2Positions("AACD"));

	}

	@Test
	public void testTruncateAInFirst2Positions2() {

		// assertEquals("CD",helper.truncateAInFirst2Positions("AACD"));
		assertEquals("", helper.truncateAInFirst2Positions("ACD"));

	}

}

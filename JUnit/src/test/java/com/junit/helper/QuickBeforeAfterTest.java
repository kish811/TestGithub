package com.junit.helper;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class QuickBeforeAfterTest {

	@BeforeClass
	void test4() {
		System.out.println("Test 4 katham");
	}

	@Before
	void test() {
		System.out.println("Test  katham");
	}

	@Test
	void test1() {
		System.out.println("Test 1 katham");
	}

	@After
	void test2() {
		System.out.println("Test 2 katham");
	}

	@AfterClass
	void test3() {
		System.out.println("Test 3 katham");
	}

}

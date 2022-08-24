package com.leetcode.isomorphic;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContainsDuplicateTest {

	private ContainsDuplicate obj;

	@BeforeAll
	public static void beforeClass() {
	}

	@BeforeEach
	public void before() {
		obj = new ContainsDuplicate();
	}

	@Test
	public void testcontainsDuplicate() {
		obj = new ContainsDuplicate();
		Assertions.assertTrue(obj.containsDuplicate(new int[] { 1, 3, 4, 5, 2, 1 }));
		Assertions.assertFalse(obj.containsDuplicate(new int[] { 3, 4, 5, 2, 1 }));
	}

	@AfterEach
	public void after() {

	}

	@AfterAll
	public static void afterClass() {

	}

}

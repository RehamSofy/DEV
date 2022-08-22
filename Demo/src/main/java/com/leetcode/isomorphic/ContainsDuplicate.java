package com.leetcode.isomorphic;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

	public boolean containsDuplicate(int[] nums) {

		Set<Integer> set = new HashSet<>();
		for (int v : nums) {
			set.add(v);
		}
		return set.size() < nums.length;

	}

}

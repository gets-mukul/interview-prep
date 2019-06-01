package com.amazon.prep;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithoutRepeat {

	public static void main(String[] args) {
		String str = "GEEKSFORGEEKS";
		int start = 0;
		int ans = 0;

		Set<Character> set = new HashSet<Character>();

		for (int i = 0; i < str.length();) {
			
			if (set.contains(str.charAt(i))) {
				set.remove(str.charAt(start));
				start++;

			} else {
				set.add(str.charAt(i));
				i++;
				ans = Math.max(ans, i-start);
			}
		}

		System.out.println(ans);

	}

}

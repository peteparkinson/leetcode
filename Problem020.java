/* 20. Valid Parentheses
 * https://leetcode.com/problems/valid-parentheses/
 */

package leetCode;

import java.util.HashMap;
import java.util.Stack;

public class Problem020 {
	public static void main(String[] args) {
		// Driver
		// String s = "{[[]{}]}()()";
		// String s = "()[]{}";
		// String s = "(]";
		// String s = "{[]}";
		String s = "(){}}{";
		System.out.println(isValid(s));

	}

	public static boolean isValid(String s) {

		try {
			HashMap<Character, Character> map = new HashMap<Character, Character>();
			map.put('}', '{');
			map.put(']', '[');
			map.put(')', '(');

			Stack<Character> stack = new Stack<Character>();

			if (map.containsKey(s.charAt(0))) {
				return false;
			}

			for (int i = 0; i < s.length(); i++) {
				if (map.containsValue(s.charAt(i))) {
					stack.add(s.charAt(i));
				}
				if (map.containsKey(s.charAt(i))) {
					if (stack.peek() == map.get(s.charAt(i))) {
						stack.pop();
					} else {
						return false;
					}
				}
			}
			if (stack.size() > 0) {
				return false;
			}

		} catch (Exception e) {
			return false;
		}

		return true;
	}
}

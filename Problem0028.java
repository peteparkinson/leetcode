/* 28. Implement strStr()
 * https://leetcode.com/problems/implement-strstr/
 */

package leetCode;

public class Problem0028 {

	public static int strStr(String haystack, String needle) {
		if (needle.length() == 0 || haystack.equals(needle)) {
			return 0;
		}
		int len = needle.length();
		for (int i = 0; i <= haystack.length() - len; i++) {
			if (haystack.substring(i, i + len).equals(needle)) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		String s1 = "a";
		String s2 = "a";
		System.out.println(strStr(s1, s2));
	}
}

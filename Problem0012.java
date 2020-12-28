/* 12. Integer to Roman
 * https://leetcode.com/problems/integer-to-roman/
 */
package leetCode;

public class Problem0012 {
	public static void main(String[] args) {

		System.out.println(intToRoman(4));
		System.out.println(intToRoman(39));
		System.out.println(intToRoman(1994));
		System.out.println(intToRoman(3999));

	}

	public static String intToRoman(int num) {
		StringBuilder ans = new StringBuilder();
		int[] nums = new int[] { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		String[] romans = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
		for(int i = 0; i < nums.length; i++) {
			while(nums[i] <= num) {
				num -= nums[i];
				ans.append(romans[i]);
			}
		}
		return ans.toString();
	}
}

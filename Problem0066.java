/* 66. Plus One
 * https://leetcode.com/problems/plus-one/
 */

package leetCode;

public class Problem0066 {
	public static void main(String[] args) {

		int[] digits = new int[] { 4, 3, 2, 1};
		// int[] digits = new int[] {0, 0};
		int[] tmp = plusOne(digits);
		for (int i = 0; i < digits.length; i++) {
			System.out.println(tmp[i]);
		}

	}

	public static int[] plusOne(int[] digits) {
		int i = digits.length - 1;
		if (digits[0] == 0) {
			digits[i] = 1;
			return digits;
		}
		while (digits[i] == 9) {
			digits[i] = 0;
			if (i == 0) {
				digits = shiftArray(digits);
				break;
			} else {
				i--;
			}
		}
		digits[i]++;
		return digits;
	}

	public static int[] shiftArray(int[] arr) {
		int[] tmp = new int[arr.length + 1];
		tmp[0] = 0;
		for (int i = 0; i < arr.length; i++) {
			tmp[i + 1] = arr[i];
		}
		return tmp;
	}

}

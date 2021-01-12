/* 31. Next Permutation
 * https://leetcode.com/problems/next-permutation/
 * 
 * The algorithm requires explanation:
 * 
 * iterate whole array backwards.
 * find index of first number that isn't ascending in value (assigned 'i')
 * if you find none, return reversed of original array
 * iterate array backwards again,
 * find index of first value > arr[i], (assigned 'j')
 * swap 'i' and 'j' values in array
 * sort values of elements with indexes > i
 * 
 */

package leetCode;

import java.util.Arrays;

public class Problem0031 {
	public static void main(String[] args) {

		int[] arr = new int[] {4, 2, 0, 2, 3, 2, 0};
		//int[] arr = new int[] {1, 1};
		nextPermutation(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void nextPermutation(int[] nums) {
		int len = nums.length;
		if (len == 1) { return; }
		int i, j = len - 1, tmp;
		for (i = len - 2; i >= 0; i--) {
			if (nums[i] < nums[i + 1]) {
				break;
			}
			if (i == 0) {
				for (int k = 0; k < len / 2; k++) {
					tmp = nums[k];
					nums[k] = nums[len - k - 1];
					nums[len - k - 1] = tmp;
				}
				return;
			}
		}
		while (nums[j] <= nums[i]) {
			j--;
		}
		tmp = nums[i];
		nums[i] = nums[j];
		nums[j] = tmp;
		Arrays.sort(nums, i + 1, len);
	}
}

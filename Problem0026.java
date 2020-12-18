/* 26. Remove Duplicates from Sorted Array
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */

package leetCode;

public class Problem0026 {
	
	public static int removeDuplicates(int[] nums) {
        if(nums.length == 0){return 0;}
		int ref = 0;
		for(int i = 1; i < nums.length; i++) {
			if(nums[ref] != nums[i]) {
				ref++;
				nums[ref] = nums[i];
			}
		}
		return ref + 1;
	}
	
	public static void main(String[] args) {
		int[] nums = new int[] {1, 1, 2, 3, 3, 3, 4, 4, 5, 6};
		int len = removeDuplicates(nums);
		
		System.out.println(len);
	}
}

/* 27. Remove Element
 * https://leetcode.com/problems/remove-element/
 */
package leetCode;

public class Problem0027 {
	
    public static int removeElement(int[] nums, int val) {
        if(nums.length == 0) {return 0;}
    	int i = 0;
    	for(int j = 0;j < nums.length; j++) {
    		if(nums[j] != val) {
				nums[i++] = nums[j];
    		}
    	}
    	return i;
    }
	
	public static void main(String[] args) {
		int[] arr = new int[] {3,2,2,3, 1, 2, 3, 4, 5, 6, 7, 8};
		System.out.println(removeElement(arr, 2));
	}
}

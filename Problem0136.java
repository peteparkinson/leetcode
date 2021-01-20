/* 136. Single Number
 * https://leetcode.com/problems/single-number/
 */

package leetCode;

public class Problem0136 {
	public static void main(String[] args) {
		int[] arr = new int[] {4,1,2,1,2};
		System.out.println(singleNumber(arr));
	}
	
    public static int singleNumber(int[] nums) {
    	int ans = 0;
    	for(int i = 0; i < nums.length; i++) {
    		ans ^= nums[i]; 
    	}
    	return ans;
    }
}

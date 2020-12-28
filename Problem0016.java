/* 16. 3Sum Closest
 * https://leetcode.com/problems/3sum-closest/
 */
package leetCode;

import java.util.Arrays;

public class Problem0016 {
	public static void main(String[] args) {
		int[] nums = new int[] {1,1,-1,-1,3};
		int target = -1;
		System.out.println(threeSumClosest(nums, target));
		
	}
	
    public static int threeSumClosest(int[] nums, int target) {
    	
    	int ans = nums[0] + nums[1] + nums[nums.length - 1];
    	Arrays.sort(nums);
    	
    	for(int i = 0; i < nums.length - 2; i++) {
    		int lo = i + 1, hi = nums.length - 1;
    		while(lo < hi) {
    			int sum = nums[i] + nums[lo] + nums[hi];
    			if(sum > target) {
    				hi--;
    			} else {
    				lo++;
    			}
    			if(Math.abs(sum - target) < Math.abs(ans - target)) {
    				ans = sum;
    			}
    		}
    	}
    	return ans;
    }
	
}

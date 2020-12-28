/* 1. Two Sum
 * https://leetcode.com/problems/two-sum/
 */

package leetCode;

import java.util.HashMap;

public class Problem0001 {
	public static void main(String[] args) {
		
		int[] nums = new int[] {3, 2, 4};
		int target = 6;
		int[] ans = twoSum(nums, target);
		System.out.println(ans[0]);	
		System.out.println(ans[1]);	
		
	}
	
    public static int[] twoSum(int[] nums, int target) {

    	int[] ans = new int[2];
    	HashMap<Integer, Integer> map = new HashMap<>();
    	for(int i = 0; i < nums.length; i++) {
    		if(map.containsKey(target - nums[i])) {
    			ans[0] = map.get(target- nums[i]);
    			ans[1] = i;
    			break;
    		} else {
    			map.put(nums[i], i);
    		}
    	}
        return ans;
    }
	
}

/* 18. 4Sum
 * https://leetcode.com/problems/4sum/
 * 
 * this needs revisited.  45th and 87th percentile
 */

package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem0018 {

	public static void main(String[] args) {
		System.out.println(fourSum(new int[] {-2,-1,-1,1,1,2,2}, 0));
	}	
		
    public static List<List<Integer>> fourSum(int[] nums, int target) {
    	Arrays.sort(nums);
    	List<List<Integer>> ans = new ArrayList<>();
    	for(int i = 0; i < nums.length; i++) {
        	for(int j = i + 1; j < nums.length; j++) {
        		int lo = j + 1;
        		int hi = nums.length - 1;
        		while(lo < hi) {
        			if(nums[i] + nums[j] + nums[lo] + nums[hi] == target) {
        				if(!ans.contains(Arrays.asList(nums[i], nums[j], nums[lo], nums[hi]))) {
	        				ans.add(Arrays.asList(nums[i], nums[j], nums[lo], nums[hi]));
        				}
        				while(lo < hi && nums[lo] == nums[lo + 1]) { lo++;}
        				while(lo < hi && nums[hi] == nums[hi - 1]) { hi--;}
        				lo++;
        				hi--;
        			} else if(nums[i] + nums[j] + nums[lo] + nums[hi] < target) {
        				lo++;
        			} else {
        				hi--;
        			}
        		}
        	}
    	}
		return ans;
    }
}

/* 15. 3Sum
 * https://leetcode.com/problems/3sum/
 */

package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Problem0015 {
	public static void main(String[] args) {

		//System.out.println(threeSum(new int[] {-1,0,1,2,-1,-4}));
		System.out.println(threeSum(new int[] {-2,0,0,2,2}));
	}
	
    public static List<List<Integer>> threeSum(int[] nums) {
    	Arrays.sort(nums);
    	List<List<Integer>> ans = new ArrayList<>();
    	for(int i = 0; i < nums.length; i++) {
    		if(i == 0 || (i > 0 && nums[i] != nums[i-1])) {
        		int lo = i + 1;
        		int hi = nums.length - 1;
        		while(lo < hi) {
        			if(nums[i] + nums[lo] + nums[hi] == 0) {
        				ans.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
        				while(lo < hi && nums[lo] == nums[lo + 1]) { lo++;}
        				while(lo < hi && nums[hi] == nums[hi - 1]) {hi--;}
        				lo++;
        				hi--;
        			} else if(nums[i] + nums[lo] + nums[hi] < 0) {
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

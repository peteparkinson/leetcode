/* 35. Search Insert Position
 * https://leetcode.com/problems/search-insert-position/
 */

package leetCode;

public class Problem0035 {
	public static void main(String[] args) {
		/*
		int[] nums = new int[] {1 ,3, 5, 6, 7, 15, 17, 20, 22, 23, 29, 30, 37, 48, 49, 51, 52, 53, 54, 55};
		int target = 40;

		*/
		int[] nums = new int[] {1};
		int target = 1;
		System.out.println(searchInsert(nums, target));
		
		
	}
	
    public static int searchInsert(int[] nums, int target) {
    	if(nums.length == 0 || nums[0] > target) {
    		return 0;
    	}
    	if(nums[nums.length - 1] < target) {
    		return nums.length;
    	}
    	
    	double interval = nums.length / 2;
    	int i = 0; 
    	
    	while(nums[i] != target) {
    		if(nums[i] < target && nums[i+1] > target) {
    			i++;
    			break;
    		}
    		if(nums[i] > target) {
    			i -= interval;
    		} else if (nums[i] < target) {
    			i += interval;
    		}
    		interval = Math.ceil(interval / 2);
    	}
    	return i;
    }
	
}

/* 53. Maximum Subarray
 * https://leetcode.com/problems/maximum-subarray/
 */
package leetCode;

public class Problem0053 {
	public static void main(String[] args) {
		
		int[] nums = new int[] {-2,1,-3,4,-1,2,1,-5,4};	
		
		System.out.println(maxSubArray(nums));
		
	}
	
    public static int maxSubArray(int[] nums) {
    	int n = nums.length;
    	int[] arr = new int[n];
    	arr[0] = nums[0];
    	int max = arr[0];

    	for(int i = 1; i < n; i++) {
    		arr[i] = nums[i]+(arr[i-1]>0 ? arr[i-1] : 0);
    		max = Math.max(max, arr[i]);
    	}
        
    	return max;
    }
	
}

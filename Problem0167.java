/* 167. Two Sum II - Input array is sorted
 * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 */

package leetCode;

public class Problem0167 {
	public static void main(String[] args) {
		
		int[] nums = new int[] {2,7,11,15};
		int target = 9;
		int[] ans = twoSum(nums, target);
		System.out.println(ans[0]);
		System.out.println(ans[1]);
		
	}
	
    public static int[] twoSum(int[] numbers, int target) {
        int i = 0, j = numbers.length - 1;
    	while(i < j) {
    		if(numbers[i] + numbers[j] == target) {
    			break;
    		} else if(numbers[i] + numbers[j] < target) {
    			i++;
    		} else {
    			j--;
    		}
    	}
        //question requires indices + 1
    	return new int[] {i+1, j+1};
    }
	
}

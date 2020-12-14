/* Problem 1137
 * https://leetcode.com/problems/n-th-tribonacci-number/
 */

package leetCode;

public class Problem070 {
	public static void main(String[] args) {
		
		System.out.println(climbStairs(0));
		
	}
	
    public static int climbStairs(int n) {
    	if(n == 0) {
    		return 0;
    	} else if(n == 1) {
    		return 1;
    	} else if (n == 2) {
    		return 1;
    	}
    	int[] arr = new int[n + 1];
    	arr[1] = 1;
    	arr[2] = 1;
    	arr[3] = 2;
    	
    	for(int i = 4; i <= n; i++) {
    		arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3];
    	}
    	return arr[n];
    }
    
}
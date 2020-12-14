/* 70. Climbing Stairs
 * https://leetcode.com/problems/climbing-stairs/
 */

package leetCode;

public class Problem070 {
	public static void main(String[] args) {
		
		System.out.println(climbStairs(6));
		
	}
	
    public static int climbStairs(int n) {
    	if(n == 1) { 
    		return 1;
    	} else if(n == 0) {
    		return 0;
    	}
    	int[] arr = new int[n + 1];
    	arr[1] = 1;
    	arr[2] = 2;
    	
    	for(int i = 3; i <= n; i++) {
    		arr[i] = arr[i - 1] + arr[i - 2];
    	}
    	return arr[n];
    }
    
}

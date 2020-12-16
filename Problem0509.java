/* 509. Fibonacci Number
 * https://leetcode.com/problems/fibonacci-number/
 */

package leetCode;

public class Problem0509 {
	public static void main(String[] args) {
		
		System.out.println(fib(6));
		
	}
	
	public static int fib(int n) {
		
		if(n == 0) { return 0;}
		if(n == 1) { return 1;}
		
		int[] seq = new int[n + 1];
		
		seq[1] = 1;
		seq[2] = 1;
		
		for(int i = 3; i < n + 1; i++) {
			seq[i] = seq[i - 1] + seq[i - 2];
		}
		return seq[seq.length - 1];
	}
}

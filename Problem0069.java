/* 69. Sqrt(x)
 * https://leetcode.com/problems/sqrtx/
 */

package leetCode;

public class Problem0069 {
	public static void main(String[] args) {
		
		int n = 2147395600;
		System.out.println(mySqrt(n));
		
	}
	
    public static int mySqrt(int x) {
    	if(x == 1 || x == 2) {
    		return 1;
    	}
		int interval = x / 2;
		long i = 1;       //long in case i*i goes over max int
		
		while(!(i*i == x || (i*i < x && (i+1)*(i+1) > x ))) {
			if(i*i < x) {
				i += interval;
			} else { 
				i -= interval;
			}
			interval = interval > 1 ? interval/2 : interval+1;
		}
		return (int) i;
    }
}

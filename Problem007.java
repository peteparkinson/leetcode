/* Problem 7
 * https://leetcode.com/problems/reverse-integer/
 */

package leetCode;

public class Problem007 {

	public static void main(String[] args) {

		//Driver
		int num = -123;
		System.out.println(reverse(num));
	}

    public static int reverse(int x) {
    	try {
        	String s = new StringBuilder().append(Math.abs(x)).reverse().toString();
        	return (x < 0) ? Integer.parseInt(s) * -1 : Integer.parseInt(s);
    	} catch (Exception e){
    		return 0;
    	}
    }
}

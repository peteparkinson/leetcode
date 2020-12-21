/* 58. Length of Last Word
 * https://leetcode.com/problems/length-of-last-word/
 */

package leetCode;

public class Problem0058 {
	public static void main(String[] args) {
		String s = "a";
		System.out.println(lengthOfLastWord(s));
	}
	
    public static int lengthOfLastWord(String s) {
    	int count = 0;
    	for(int i = s.length() - 1; i >= 0; i--) {
    		if(s.charAt(i) != ' ') {
    			count++;
    		} else if(count > 0) { break;}
    	}
    	return count;
    }
}

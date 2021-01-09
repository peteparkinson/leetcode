/* 22. Generate Parentheses
 * https://leetcode.com/problems/generate-parentheses/
 * 
 * This algorithm was posted by "brobins9" on the leetcode forums.  
 * https://leetcode.com/problems/generate-parentheses/discuss/10100/Easy-to-understand-Java-backtracking-solution
 * 
 * how it works is awe inspiring.
 * I'm not sure if this will prove useful for future permutation problems
 * but I'm making note as a reminder to revisit.
 */

package leetCode;

import java.util.ArrayList;
import java.util.List;

public class Problem0022 {
	public static void main(String[] args) {
		System.out.println(generateParenthesis(3));
	}
	
    public static List<String> generateParenthesis(int n) {
    	List<String> ans = new ArrayList<String>();
    	helper(ans, "", 0, 0, n);
    	return ans;
    }

	private static void helper(List<String> ans, String s, int open, int close, int n) {
		if(open + close == n*2) {
			ans.add(s.toString());
			return;
		}
		
		if(open < n) 
			helper(ans, s + "(", open+1, close, n);
		if(close < open)
			helper(ans, s + ")", open, close+1, n);
	}
    

}

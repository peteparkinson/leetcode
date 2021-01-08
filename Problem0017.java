/* 17. Letter Combinations of a Phone Number
 * https://leetcode.com/problems/letter-combinations-of-a-phone-number/
 */

package leetCode;

import java.util.LinkedList;
import java.util.List;

public class Problem0017 {
	public static void main(String[] args) {
		System.out.println(letterCombinations("23"));
		
	}
	
    public static List<String> letterCombinations(String digits) {
    	LinkedList<String> ans = new LinkedList<String>();
    	if(digits.length() == 0) {return ans;}
        String[] letters = new String[] {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        ans.add("");
        for(int i = 0; i < digits.length(); i++) {
        	int n = digits.charAt(i) - '0';
        	int tmp = ans.size();
        	for(int j = 0; j < tmp; j++) {
            	String s = ans.remove();
            	if(s.length() > i) { break;}
        		for(int k = 0; k < letters[n].length(); k++) {
        			ans.add(s + letters[n].charAt(k));
        		}
        	}
        }
        return ans;
    }
}


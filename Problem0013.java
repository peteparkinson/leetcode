/* 13. Roman to Integer
 * https://leetcode.com/problems/roman-to-integer/
 */

package leetCode;

import java.util.HashMap;

class addTwoNumbers {
	public static void main(String[] args) {

		String numeral = "LXIV";
		System.out.println(romanToInt(numeral));

	}

    public static int romanToInt(String s) {
        
    	int ans = 0;
    	
    	HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    	
    	map.put('I', 1);
    	map.put('V', 5);
    	map.put('X', 10);
    	map.put('L', 50);
    	map.put('C', 100);
    	map.put('D', 500);
    	map.put('M', 1000);
    	
    	// This flag handles the case that a subtraction is the last operation, e.g. "LXIV"
    	// the last digit always needs added after the loop, except in this case
    	boolean flag = true;
    	
    	for(int i = 0; i < s.length() - 1; i++) {
    		if(map.get(s.charAt(i)) >= map.get(s.charAt(i + 1))) {
    			ans += map.get(s.charAt(i));
    		} else {
    			ans += map.get(s.charAt(i + 1)) - map.get(s.charAt(i));
    			i++;
    			if(i == s.length() - 1) {
        			flag = false;
    			}
    		}
    		
    	}
    	
    	if(flag) {
        	ans += map.get(s.charAt(s.length() - 1));
    	}
    	
    	return ans;
    }
}

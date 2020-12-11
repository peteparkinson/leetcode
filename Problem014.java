/* 14. Longest Common Prefix
 * https://leetcode.com/problems/longest-common-prefix/
 */

package leetCode;

public class Problem014 {

	public static void main(String[] args) {

		String[] strs = new String[] {"dog","racecar","car"};
		//String[] strs = new String[] {"flower","flow","flight"};
		//String[] strs = new String[];
		
		System.out.println(longestCommonPrefix(strs));
		
	}
	
    public static String longestCommonPrefix(String[] strs) {
    	if(strs.length == 0) {
    		return "";
    	}
    	String tmp = strs[0];
    	
    	for(int i = 1; i < strs.length; i++) {
    		if(tmp.length() > strs[i].length()) {
    			tmp = tmp.substring(0, strs[i].length());
    		}
    		for(int j = 0; j < tmp.length(); j++) {
    			if(tmp.charAt(j) != strs[i].charAt(j)) {
    				tmp = tmp.substring(0, j);
    			}
    		}
    	}
    	
        return tmp;
    }
}

/* 5. Longest Palindromic Substring
 * https://leetcode.com/problems/longest-palindromic-substring/
 */
package leetCode;

public class Problem0005 {
	
    public static String longestPalindrome(String s) {
    	if(s == null) { return "";}
    	int start = 0, end = 0;
    	for(int i = 0; i < s.length(); i++) {
    		int len = Math.max(palLength(s,i,i), palLength(s,i,i+1));
    		if(end - start < len) {
    			start = i - (len - 1) / 2;
    			end = i + len / 2;
    		}
    	}
    	return s.substring(start, end + 1);
    }
    
    public static int palLength(String s, int left, int right) {
    	int L = left, R = right;
    	while(L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
    		L--;
    		R++;
    	}
    	
    	return R - L - 1;
    }
    
	public static void main(String[] args){
		//Driver
		String s = "qwerkfhfkasdfdsa";
		System.out.println(longestPalindrome(s));
		
	}
}

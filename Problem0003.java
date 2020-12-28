/* 3. Longest Substring Without Repeating Characters
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */

package leetCode;

public class Problem0003 {
	public static void main(String[] args) {
		// "abcabcbb"
		// "pwwkew"
		// "bbbbb"
		// "b"
		System.out.println(lengthOfLongestSubstring("b"));
	}
	
    public static int lengthOfLongestSubstring(String s) {
    	int ans = 0;
    	int[] arr = new int[256];
    	int j = 0;
    	for(int i = 0; i < s.length(); i++) {
    		if(arr[s.charAt(i)] > 0) {
    			j = Math.max(j, arr[s.charAt(i)]);
    		}
    		arr[s.charAt(i)] = i + 1;
    		ans = Math.max(ans, i - j + 1);
    	}
    	return ans;
    }
}
	    

/*
 * 9th percentile
 * 
    public static int lengthOfLongestSubstring(String s) {
        if(s.equals("")){
            return 0;
        }
    	int max = 1;
    	int i = 0;
    	int j = 0;
    	while(i <  s.length() - 1) {
    		if(s.substring(j, i + 1).contains(String.valueOf(s.charAt(i + 1)))) {
    			j++;
    			i = j;
    		} else {
    			i++;
    		}
    		max = Math.max(i - j + 1, max); 
    	}
    	return max;
    }
*/
    
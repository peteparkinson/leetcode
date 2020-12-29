/* 3. Longest Substring Without Repeating Characters
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */

package leetCode;

public class Problem0003 {
	public static void main(String[] args) {
		// "abcabcbb"
		// "tmmzuxt"
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
	    

/******************************
 * 99th percentile above.  saw this method of mapping characters to 
 * 9th percentile below
 
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
    
    /******************************
     * Another answer using a hash map.  
     * this is similar to the arr[256] answer, slightly slower.
     
public static int lengthOfLongestSubstring(String s) {
	if(s.equals("")) { return 0; }
	HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    	int ans = 0;
    	for(int i = 0, j = 0; i < s.length(); i++) {
    		if(map.containsKey(s.charAt(i))
			&& map.get(s.charAt(i)) >= j){
    			j =map.get(s.charAt(i)) + 1;
    		}
		map.put(s.charAt(i), i);
    		ans = Math.max(ans, i - j + 1);
    	}
    	return ans;
}
*****************************/
    

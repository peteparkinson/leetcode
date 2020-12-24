/* 11. Container With Most Water
 * https://leetcode.com/problems/container-with-most-water/
 */
package leetCode;

public class Problem0011 {
	public static void main(String[] args) {
		
		int[] height = new int[] {1,8,6,2,5,4,8,3,7};
		System.out.println(maxArea(height));
		
	}
	
    public static int maxArea(int[] height) {
    	int i = 0, j = height.length - 1;
        int max = 0;
        while(i < j) {
    		max = Math.max(max, Math.min(height[i], height[j]) * (j - i));
    		if(height[i] < height[j]) {
    			i++;
    		} else {
    			j--;
    		}
        }
    	return max;
    }
}



/* 119. Pascal's Triangle II
 * https://leetcode.com/problems/pascals-triangle-ii/
 */
package leetCode;

import java.util.LinkedList;
import java.util.List;

public class Problem0119 {
	public static void main(String[] args) {
        System.out.println(getRow(5));
	}
	
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new LinkedList<Integer>();
        ans.add(1);
        for(int i = 0; i < rowIndex; i++) {
        	for(int j = i; j >= 1; j--) {
        		int tmp = ans.get(j) + ans.get(j - 1);
        		ans.set(j, tmp);
        	}
        	ans.add(1);
        }
        return ans;
    }
}

/* 118. Pascal's Triangle
 * https://leetcode.com/problems/pascals-triangle/
 */
package leetCode;

import java.util.ArrayList;
import java.util.List;

public class Problem0118 {
	public static void main(String[] args) {

        List<List<Integer>> ans = generate(5);
        System.out.println(ans);
	}
	
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();
        
        if(numRows == 0){return ans;}
        sub.add(1);
        ans.add(sub);
        if(numRows == 1){return ans;}
    	sub = new ArrayList<>();
        sub.add(1);
        sub.add(1);
        ans.add(sub);

        for(int i = 2; i < numRows; i++) {
        	sub = new ArrayList<>();
        	sub.add(1);
        	for(int j = 1; j <= ans.get(i - 1).size() - 1; j++) {
            	sub.add(ans.get(i - 1).get(j) + ans.get(i - 1).get(j - 1));
        	}
        	sub.add(1);
        	ans.add(sub);
        }
        return ans;
    }
}

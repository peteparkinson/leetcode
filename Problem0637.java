/* 637. Average of Levels in Binary Tree
 * https://leetcode.com/problems/average-of-levels-in-binary-tree/
 */

package leetCode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Problem0637 {
	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(-9);
		TreeNode t2 = new TreeNode(-3);
		TreeNode t3 = new TreeNode(2);
		TreeNode t4 = new TreeNode(4);
		TreeNode t5 = new TreeNode(4);
		TreeNode t6 = new TreeNode(0);
		TreeNode t7 = new TreeNode(-6);
		TreeNode t8 = new TreeNode(-5);
		
		t1.left = t2;
		t1.right = t3;
		t2.right = t4;
		t3.left = t5;	
		t3.right = t6;	
		t4.left = t7;
		t5.left = t8;

		System.out.println(averageOfLevels(t1));
		
	}
	
    public static List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new LinkedList<Double>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();

    	q.offer(root);
    	while(!q.isEmpty()) {
    		int count = q.size();
    		Double sum = 0.0;
    		for(int i = 0; i < count; i++) {
    			TreeNode n = q.poll();
    			sum += n.val;
    			if(n.left != null) { q.offer(n.left);}
    			if(n.right != null) { q.offer(n.right);}
    		}
    		ans.add(sum / count);
    	}
    	return ans;
    }
}

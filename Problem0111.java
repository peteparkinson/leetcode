/* 111. Minimum Depth of Binary Tree
 * https://leetcode.com/problems/minimum-depth-of-binary-tree/
 */

package leetCode;

import java.util.LinkedList;
import java.util.Queue;

public class Problem0111 {
	
    public static int minDepth(TreeNode root) {
    	if(root == null) { return 0; }
    	
    	Queue<TreeNode> q = new LinkedList<TreeNode>();
    	q.offer(root);
    	
    	int level = 2;
    	while(!q.isEmpty()) {
    		int mark = q.size();
    		for(int i = 0; i < mark; i++) {
    			if(q.peek().left == null && q.peek().right == null) {
    				return level;
    			}
    			if(q.peek().left != null) { q.offer(q.peek().left);}
    			if(q.peek().right != null) { q.offer(q.peek().right);}
    			q.poll();
    		}
    		level++;
    	}
    	return 0;
    	
    	/* works, but slow, 55th and 66th percentiles. rework with BFS
        if(root == null) {return 0;}
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        if(left == 0 || right == 0) {
        	return Math.max(left, right) + 1;
        }
        return Math.min(left, right) + 1;
        */
    }
	
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

		System.out.println(minDepth(t1));
		
	}
}

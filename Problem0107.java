/* 107. Binary Tree Level Order Traversal II
 * https://leetcode.com/problems/binary-tree-level-order-traversal-ii/
 */

package leetCode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Problem0107 {
	public static void main(String[] args) {

		/* Driver
		 
		   3
   		/  \
  	 9    20
         /  \
        15   7
        
        expected out: 
        [
  			[15,7],
  			[9,20],
  			[3]
		    ]
		 */

		TreeNode t1 = new TreeNode(3);
		TreeNode t2 = new TreeNode(9);
		TreeNode t3 = new TreeNode(20);
		TreeNode t4 = new TreeNode(15);
		TreeNode t5 = new TreeNode(7);

		t1.left = t2;
		t1.right = t3;
		t3.left = t4;
		t3.right = t5;
		
		System.out.println(levelOrderBottom(t1));
	}
	
    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new LinkedList<List<Integer>>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        
        if(root == null) {return ans;}
        
        q.offer(root);
        while(!q.isEmpty()) {
            List<Integer> sub = new LinkedList<Integer>();
        	int mark = q.size();
        	for(int i = 0; i < mark; i++) {
        		if(q.peek().left != null) {q.offer(q.peek().left);}
        		if(q.peek().right != null) {q.offer(q.peek().right);}
        		sub.add(q.poll().val);
        	}
        	ans.add(0, sub);
        }
        return ans;
    }
	
}

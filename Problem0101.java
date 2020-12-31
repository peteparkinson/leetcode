/* 101. Symmetric Tree
 * https://leetcode.com/problems/symmetric-tree/
 * 
  //given
  //Definition for a binary tree node.
  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
 * revisit and find recursive solution
 */

package leetCode;

import java.util.Stack;

public class Problem0101 {
	public static void main(String[] args) {
	/*
	1
   / \
  2   2
 / \ / \
3  4 4  3
	*/
		TreeNode a = new TreeNode(1);
		TreeNode b = new TreeNode(2);
		TreeNode c = new TreeNode(2);
		TreeNode d = new TreeNode(3);
		TreeNode e = new TreeNode(4);
		TreeNode f = new TreeNode(4);
		TreeNode g = new TreeNode(3);

		a.left = b;
		a.right = c;
		b.left = d;
		b.right = e;
		c.left = f;
		c.right = g;
		System.out.println(isSymmetric(a));
	}
	
    public static boolean isSymmetric(TreeNode root) {

    	if(root == null) {return false;}
		Stack<TreeNode> stk = new Stack<>();
		
		stk.add(root.left);
		stk.add(root.right);

		TreeNode a;
		TreeNode b;
		while(!stk.isEmpty()) {
			a = stk.pop();
			b = stk.pop();
			if(a == b) {
				continue;
			} else if(a == null || b == null || a.val != b.val){
				return false;
			}
			stk.add(a.left);
			stk.add(b.right);
			stk.add(a.right);
			stk.add(b.left);
		}
    	return true;
    }
}

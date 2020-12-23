/* 100. Same Tree
 * https://leetcode.com/problems/same-tree/submissions/
 */

package leetCode;

import java.util.Stack;

public class Problem0100a {
	public static void main(String[] args) {
		
		//TreeNode p = new TreeNode(1, new TreeNode(2), new TreeNode(3, new TreeNode(4), new TreeNode(5)));
		TreeNode p = new TreeNode(1, new TreeNode(2), new TreeNode(3));
		TreeNode q = new TreeNode(1, new TreeNode(2), new TreeNode(3));

		System.out.println(isSameTree(p, q));
		//System.out.println(isSameTree(null, q));
	}
	
	public static boolean isSameTree(TreeNode p, TreeNode q) {

		Stack<TreeNode> stk = new Stack<>();
		
		stk.add(p);
		stk.add(q);
		
		while(!stk.isEmpty()) {
			TreeNode a = stk.pop();
			TreeNode b = stk.pop();
			if(a == null && b == null) {
				continue;
			} else if(a == null || b == null || a.val != b.val){
				return false;
			}
			stk.add(a.left);
			stk.add(b.left);
			stk.add(a.right);
			stk.add(b.right);
		}
		return true;
	}
}

/* 104. Maximum Depth of Binary Tree
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/
 * 
 * //Given
 * //Definition for a binary tree node.
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
 * 
 */

package leetCode;

public class Problem0104 {
	public static void main(String[] args) {
		// not writing a driver for this
    // simple recursive DFS
	}
	
    public static int maxDepth(TreeNode root) {
    	if(root == null) {
    		return 0;
    	}
    	return 1 + Math.max(maxDepth(root.right), maxDepth(root.left));
    }
	
}

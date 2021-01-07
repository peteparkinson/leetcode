/* 110. Balanced Binary Tree
 * https://leetcode.com/problems/balanced-binary-tree/
 */

package leetCode;

public class Problem0110 {
	public static void main(String[] args) {

		TreeNode t1 = new TreeNode(3);
		TreeNode t2 = new TreeNode(9);
		TreeNode t3 = new TreeNode(20);
		TreeNode t4 = new TreeNode(15);
		TreeNode t5 = new TreeNode(17);
		
		t1.left = t2;
		t1.right = t3;
		t3.left = t4;
		t3.right = t5;
		
		System.out.println(isBalanced(t1));
		
	}
	
    public static boolean isBalanced(TreeNode root) {
    	if(root == null) { return true; }
    	int left = depth(root.left);
    	int right = depth(root.right);
    	
    	return Math.abs(left - right) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }
    
    public static int depth(TreeNode root) {
    	if(root == null) { return 0; }
    	return Math.max(depth(root.left), depth(root.right)) + 1;
    }
}

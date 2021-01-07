/* 111. Minimum Depth of Binary Tree
 * https://leetcode.com/problems/minimum-depth-of-binary-tree/
 * 
 * this is scoring low, 55th and 66th percentiles.
 * there's no need to calculate beyond the length of the shortes branch + 1.
 * this currently calcultes the entire lengths of branches
 */
package leetCode;

public class Problem0111 {
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
	
    public static int minDepth(TreeNode root) {
        if(root == null) {return 0;}
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        if(left == 0 || right == 0) {
        	return Math.max(left, right) + 1;
        }
        return Math.min(left, right) + 1;
    }
	
    
}

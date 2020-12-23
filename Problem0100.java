/* 100. Same Tree
 * https://leetcode.com/problems/same-tree/
 * 
 //given
 public class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {  }

	TreeNode(int val) {	this.val = val; }

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}
 *
 */

package leetCode;

public class Problem0100 {
	public static void main(String[] args) {

		//TreeNode p = new TreeNode(1, new TreeNode(2), new TreeNode(3, new TreeNode(4), new TreeNode(5)));
		TreeNode p = new TreeNode(1, new TreeNode(2), new TreeNode(3));
		TreeNode q = new TreeNode(1, new TreeNode(2), new TreeNode(3));

		System.out.println(isSameTree(p, q));
		//System.out.println(isSameTree(null, q));
		
	}
	
    public static boolean isSameTree(TreeNode p, TreeNode q) {
    	if(p == null || q == null) {
    		return p == q;
    	}
    	return p.val == q.val &&
    			isSameTree(p.left, q.left) &&
    			isSameTree(p.right, q.right);
    }
}

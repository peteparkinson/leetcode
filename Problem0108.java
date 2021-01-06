/* 108. Convert Sorted Array to Binary Search Tree
 * https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
 */

package leetCode;

import java.util.LinkedList;
import java.util.Queue;

public class Problem0108 {
	public static void main(String[] args) {
		
		/*
		 * [-10,-3,0,5,9]
		 * expected out:
						      0
						     / \
						   -3   9
						   /   /
						 -10  5
 
		 */
		
		//Driver
		int[] arr = new int[] {-10,-3,0,5,9};
		
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		TreeNode n = sortedArrayToBST(arr);
		
		q.offer(n);
		while(!q.isEmpty()) {
			int mark = q.size();
			for(int i = 0; i < mark; i++) {
				if(q.peek().left != null) { q.offer(q.peek().left); }
				if(q.peek().right != null) { q.offer(q.peek().right); }
				System.out.println(q.poll().val);
			}
		}
	}
	
    public static TreeNode sortedArrayToBST(int[] nums) {
    	return helper(nums, 0, nums.length - 1);
    }
    
    public static TreeNode helper(int[] nums, int i, int j) {
    	if(i > j){return null;}
    	
    	int mid = (int) Math.floor((i + j) /2);
    	TreeNode n = new TreeNode(nums[mid]);
    	n.left = helper(nums, i, mid - 1);
    	n.right = helper(nums, mid + 1, j);
    	
    	return n;
    }
}

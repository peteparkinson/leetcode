/* 88. Merge Sorted Array
 * https://leetcode.com/problems/merge-sorted-array/ 
 */

package leetCode;

public class Problem0088 {
	public static void main(String[] args) {
		//Driver
		int[] nums1 = new int[] {1,2,3,0,0,0};
		int[] nums2 = new int[] {2,5,6};
		int m = 3;
		int n = 3;
		
		//insert the code below into the merge function on the site	
		int[] tmp = new int[m + n];
		int ref = 0;
		int a = 0;
		int b = 0;
		
		while(a < m && b < n) {
			if(nums1[a] < nums2[b]) {
				tmp[ref] = nums1[a];
				a++;
				ref++;
			} else {
				tmp[ref] = nums2[b];
				b++;
				ref++;
			}
		}
		while(a < m) {
			tmp[ref] = nums1[a];
			a++;
			ref++;
		}
		while(b < n) {
			tmp[ref] = nums2[b];
			b++;
			ref++;
		}
		
		for(int i = 0; i < nums1.length; i++) {
			nums1[i] = tmp[i];
			//System.out.println(nums1[i]);
		}
	}
}

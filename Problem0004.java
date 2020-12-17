/* 4. Median of Two Sorted Arrays
 * https://leetcode.com/problems/median-of-two-sorted-arrays/
 */

package leetCode;

public class Problem0004 {
	
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		double[] arr = new double[nums1.length + nums2.length];
		int x = 0;
		int y = 0;
		int ref = 0;
		
		while(x < nums1.length && y < nums2.length) {
			if(nums1[x] < nums2[y] ) {
				arr[ref++] = nums1[x++];
			} else {
				arr[ref++] = nums2[y++];
			}
		}
		while(y < nums2.length) {
			arr[ref++] = nums2[y++];
		}
		while(x < nums1.length) {
			arr[ref++] = nums1[x++];
		}
		if(arr.length % 2 == 0) {
			return (arr[(arr.length / 2) - 1] + arr[(arr.length / 2)])/2;
		} else {
			return arr[(int) Math.floor(arr.length / 2)];
		}
	}
	
	public static void main(String[] args) {
		//Driver
		int[] nums1 = new int[] {1, 2};
		int[] nums2 = new int[] {3, 4};
		double ans = findMedianSortedArrays(nums1, nums2);
		
		System.out.println(ans);
	}
}

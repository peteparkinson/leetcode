/* 83. Remove Duplicates from Sorted List
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 */

package leetCode;


public class Problem0083 {
	public static void main(String[] args) {

		ListNode a1 = new ListNode(1);
		ListNode a2 = new ListNode(1);
		ListNode a3 = new ListNode(2);
		ListNode a4 = new ListNode(3);
		ListNode a5 = new ListNode(3);

		a1.next = a2;
		a2.next = a3;
		a3.next = a4;
		a4.next = a5;
		
		ListNode ans = new ListNode();
		ans = deleteDuplicates(a1);
		
		while(ans != null) {
			System.out.println(ans.val);
			ans = ans.next;
		}
		
	}
	
    public static ListNode deleteDuplicates(ListNode head) {
    	if(head == null) {
    		return null;
    	}
    	ListNode curr = head;
    	while(curr.next != null) {
    		if(curr.val == curr.next.val) {
    				curr.next = curr.next.next;
    		} else {
        		curr = curr.next;
    		}
    	}
    	return head;
    }
}

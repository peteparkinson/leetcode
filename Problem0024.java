/* 24. Swap Nodes in Pairs
 * https://leetcode.com/problems/swap-nodes-in-pairs/
 */

package leetCode;

public class Problem0024 {
	public static void main(String[] args) {
		
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);
		ListNode n6 = new ListNode(6);

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		//n5.next = n6;
		
		ListNode ans = swapPairs(n1);
		
		while(ans != null) {
			System.out.println(ans.val);
			ans = ans.next;
		}
	}
	
    public static ListNode swapPairs(ListNode head) {
    	if(head == null || head.next == null) {return head;}
    	
    	ListNode n = head.next;
    	head.next = swapPairs(n.next);
    	n.next = head;
    	
    	return n;
    }	
}

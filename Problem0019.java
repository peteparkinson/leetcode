/* 19. Remove Nth Node From End of List
 * https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 */

package leetCode;

public class Problem0019 {
	public static void main(String[] args) {
		
		//[1,2,3,4,5], n = 2
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		ListNode l5 = new ListNode(5);

		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;

		ListNode ans = removeNthFromEnd(l1, 2);
		ListNode dum = ans;
		
		while (dum != null) {
			System.out.println(dum.val);
			dum = dum.next;
		}
		
	}
	
    public static ListNode removeNthFromEnd(ListNode head, int n) {
    	ListNode ans = new ListNode(0, head);
    	ListNode lead = ans, rear = ans;
    	
    	for(int i = 0; i < n; i++) {
    		lead = lead.next;
    	}
    	while(lead.next != null) {
    		lead = lead.next;
    		rear = rear.next;
    	}
    	rear.next = rear.next.next;
    	
    	return ans.next;
    }
}

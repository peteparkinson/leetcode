/* 25. Reverse Nodes in k-Group
 * https://leetcode.com/problems/reverse-nodes-in-k-group/
 * 
 * Input: [1,2,3,4,5], 	k = 2
 * Output:[2,1,4,3,5]
 * 
 */

package leetCode;

public class Problem0025 {
	public static void main(String[] args) {

		ListNode a1 = new ListNode(1);
		ListNode a2 = new ListNode(2);
		ListNode a3 = new ListNode(3);
		ListNode a4 = new ListNode(4);
		ListNode a5 = new ListNode(5);
		ListNode a6 = new ListNode(6);
		ListNode a7 = new ListNode(7);
		ListNode a8 = new ListNode(8);
		ListNode a9 = new ListNode(9);
		ListNode a0 = new ListNode(0);

		a1.next = a2;
		a2.next = a3;
		a3.next = a4;
		a4.next = a5;
		a5.next = a6;
		a6.next = a7;
		a7.next = a8;
		a8.next = a9;
		a9.next = a0;

		/*
		ListNode a1 = new ListNode(1);
		ListNode a2 = new ListNode(2);

		a1.next = a2;
		*/
		
		ListNode ans = reverseKGroup(a1, 2);
		
		
		while(ans != null) {
			System.out.println(ans.val);
			ans = ans.next;
		}
		
	}
	
    public static ListNode reverseKGroup(ListNode head, int k) {
        
    	int nodeCount = 0;
    	ListNode curr = head;
    	ListNode start = head;
    	ListNode end = head;
    	ListNode prev = head;
    	while(curr != null) {
    		nodeCount++;
    		curr = curr.next;
    	}
    	for(int i = 0; i < nodeCount / k; i++) {
        	for(int j = 1; j < k; j++) {
        		start = start.next;
        	}

        	curr = start.next;
        	start.next = null;
        	start = reverseList(end);
        	if(i == 0) {
        		head = start;
        	} else {
        		prev.next = start; 
        		prev = end;
        	}
        	end.next = curr;
        	start = curr;
        	prev = end;
        	end = end.next;
    	}
    	return head;
    }
    
    public static ListNode reverseList(ListNode head) {
    	ListNode curr = head;
    	ListNode next = null;
    	ListNode prev = null;
    	while(curr != null) {
    		next = curr.next;
    		curr.next = prev;
    		prev = curr;
    		curr = next;
		}
    	return prev;
    }
}

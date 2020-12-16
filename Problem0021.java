/* 21. Merge Two Sorted Lists
 * https://leetcode.com/problems/merge-two-sorted-lists/
 * 
 * 
 * // Given
 * // Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

 package leetCode;
 

public class Problem0021 {	
	
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

    	if(l1 == null) {return l2;}
    	if(l2 == null) {return l1;}
    	
    	ListNode returnMe = new ListNode();
    	ListNode a = l1;
    	ListNode b = l2;
    	ListNode c = returnMe;
    	
    	while (a != null && b != null) {
    		if(a.val < b.val) {
    			c.val = a.val;
        		a = a.next;    				
    		} else {
    			c.val = b.val;
        		b = b.next;    		
    		}
    		c.next = new ListNode();
    		c = c.next;
    	}
    	while(a != null) {
    		c.val = a.val;
    		a = a.next;
    		if(a != null) {
        		c.next = new ListNode();
        		c = c.next;    		
    		}
    	}
    	while(b != null) {
    		c.val = b.val;
    		b = b.next;
    		if(b != null) {
        		c.next = new ListNode();
        		c = c.next;    		
    		}
    	}

    	return returnMe;
    }
	
	public static void main(String[] args) {

		// Driver code
		// Long Example
		/*
		ListNode l1a = new ListNode(8);
		ListNode l1b = new ListNode(12);
		ListNode l1c = new ListNode(15);
		ListNode l1d = new ListNode(51);
		ListNode l1e = new ListNode(51);
		ListNode l1f = new ListNode(72);
		ListNode l1g = new ListNode(73);
		
		l1a.next = l1b;
		l1b.next = l1c;
		l1c.next = l1d;
		l1d.next = l1e;
		l1e.next = l1f;
		l1f.next = l1g;
		
		ListNode l2a = new ListNode(8);
		ListNode l2b = new ListNode(14);
		ListNode l2c = new ListNode(20);
		ListNode l2d = new ListNode(80);
		
		l2a.next = l2b;
		l2b.next = l2c;
		l2c.next = l2d;
		*/
		
		// short example
		ListNode l1a = new ListNode(-9);
		ListNode l1b = new ListNode(3);
		ListNode l1c = new ListNode(7);
		l1a.next = l1b;
		l1b.next = l1c;
		ListNode l2a = new ListNode(1);
		ListNode l2b = new ListNode(5);
		ListNode l2c = new ListNode(6);
		l2a.next = l2b;
		l2b.next = l2c;
		
		ListNode current = mergeTwoLists(l1a, l2a);
		while(current != null) {
			System.out.println(current.val);
			current = current.next;
		}
	}
}

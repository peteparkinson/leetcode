/* 23. Merge k Sorted Lists
 * https://leetcode.com/problems/merge-k-sorted-lists/
 * 
 * //Given
 * //Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 * 
 * this solution uses the "merge two lists" function, one at a time.  
 * it's too slow: 10th percentile speed, 9th percentile RAM
 * there's a similar solution where if you merged 8 lists,
 * it would merge like this [(1+2) + (3+4)] + [(5+6) + (7+8)]
 * instead of like this (((((((1+2)+3)+4)+5)+6)+7)+8)
 * 
 */

package leetCode;

public class Problem0023 {
	
	public static ListNode mergeKLists(ListNode[] lists) {

		if(lists.length == 0) {
			return null;
		}
		
		ListNode[] arr = lists;
		ListNode ans = arr[0];
		ListNode tmp = ans;
		
		for(int i = 1; i < arr.length; i++) {
			tmp = arr[i];
			ans = mergeTwoLists(ans, tmp);
		}
		
		
		return ans;
	}
	
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		
    	if(l1 == null) { return l2;}
    	if(l2 == null) { return l1;}

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
		
		ListNode n1a = new ListNode(1);
		ListNode n1b = new ListNode(3);
		ListNode n1c = new ListNode(5);
		
		ListNode n2a = new ListNode(7);
		ListNode n2b = new ListNode(11);

		ListNode n3a = new ListNode(2);
		ListNode n3b = new ListNode(4);
		ListNode n3c = new ListNode(6);
		ListNode n3d = new ListNode(8);

		n1a.next = n1b;
		n1b.next = n1c;
		
		n2a.next = n2b;
		
		n3a.next = n3b;
		n3b.next = n3c;
		n3c.next = n3d;
		

	/*
		ListNode n1a = new ListNode(1);
		ListNode n1b = new ListNode(2);
		ListNode n1c = new ListNode(2);

		ListNode n2a = new ListNode(1);
		ListNode n2b = new ListNode(1);
		ListNode n2c = new ListNode(2);

		n1a.next = n1b;
		n1b.next = n1c;
		
		n2a.next = n2b;
		n2b.next = n2c;
		
	*/
		//ListNode[] arr = new ListNode[] {new ListNode(2), new ListNode(), new ListNode(-1)};
		ListNode[] arr = new ListNode[] {n1a, n2a, n3a};
		ListNode tmp = mergeKLists(arr);
		ListNode answer = tmp;

		System.out.println();
		while(answer != null) {
			System.out.println(answer.val);
			answer = answer.next;
		}
	}
	
}

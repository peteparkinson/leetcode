/* 2. Add Two Numbers
 * https://leetcode.com/problems/add-two-numbers/ 
 * 
 * //Given
 *	public class ListNode {
 * 		int val;
 * 		ListNode next;
 * 
 * 		ListNode() {} 
 * 		ListNode(int val) {this.val = val;}
 * 
 *		ListNode(int val, ListNode next) {
 *			this.val = val;
 * 			this.next = next;
 * 		}
 *	}
 */

package leetCode;

public class Problem002 {
	
	// the function being tested
	/*
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	ListNode head = new ListNode(0);
    	ListNode a = l1;
    	ListNode b = l2;
    	ListNode current = head;
    	
    	int carry = 0;
    	
    	while(a != null || b != null) {
    		if(a == null) {
    			a = new ListNode(0);
    		}
    		if(b == null) {
    			b = new ListNode(0);
    		}
        	current.val = (carry + a.val + b.val) % 10;
        	carry = (carry + a.val + b.val) / 10; 

    		if(a.next == null && b.next == null) {
    			if(carry == 1) {
        			//this adds a digit to the sum, if necessary (can only be 1)
        			current.next = new ListNode(1);
    			}
        		//this break prevents a "0" value node from being added at the end
    			break;
    		} 
        	current.next = new ListNode();
    		current = current.next;
    		a = a.next;
    		b = b.next;
    	}
    	return head;
	*/
	
		/* I'm revisiting the problems completed so far (about 30 of them).
		 * The above solution is from 15 days ago.  The above ranked 79th 
		 * and 21st percentile for speed and RAM, respectively. It creates 
		 * a new node for each null, which is unnecessary.  Also, it creates 
		 * each new node for the solution at the end of the loop which
		 * necessitates a condition statement to prevent a node from being
		 * added above the highest significant digit.
		 * 
		 * the new solution below simply ignores null nodes, instead of 
		 * creating 0 value nodes.  and each new node for the solution is
		 * created at the beginning of the loop, which still leaves an 
		 * unnecessary 0 value node, but this time it's below the least 
		 * significant digit, which is handled by returning "<node>.next".
		 * 79th and 98th percentile, respectively.
		 */
	
		ListNode head = new ListNode();
		ListNode dum = head;
		ListNode a = l1;
		ListNode b = l2;
		
		int carry = 0;
		
		while(a != null || b != null) {
			dum.next = new ListNode();
			dum = dum.next;
			if(a == null) {
				dum.val = (b.val + carry) % 10;
				carry = (b.val + carry) / 10;	
				b = b.next;
			} else if(b == null) {
				dum.val = (a.val + carry) % 10;
				carry = (a.val + carry) / 10;	
				a = a.next;
			} else {
				dum.val = (a.val + b.val + carry) % 10;
				carry = (a.val + b.val + carry) / 10;	
				a = a.next;
				b = b.next;
			}
			if (carry == 1 && a == null && b == null) {
				dum.next = new ListNode(1);
			}
		}
		return head.next;
    }
    
	public static void main(String[] args) {

		// Driver code
		// Long Example
		ListNode l1a = new ListNode(9);
		ListNode l1b = new ListNode(9);
		ListNode l1c = new ListNode(9);
		ListNode l1d = new ListNode(9);
		ListNode l1e = new ListNode(9);
		ListNode l1f = new ListNode(9);
		ListNode l1g = new ListNode(9);
		
		l1a.next = l1b;
		l1b.next = l1c;
		l1c.next = l1d;
		l1d.next = l1e;
		l1e.next = l1f;
		l1f.next = l1g;
		
		ListNode l2a = new ListNode(9);
		ListNode l2b = new ListNode(9);
		ListNode l2c = new ListNode(9);
		ListNode l2d = new ListNode(9);
		
		l2a.next = l2b;
		l2b.next = l2c;
		l2c.next = l2d;
		
		/*
		// short example
		ListNode l1a = new ListNode(2);
		ListNode l1b = new ListNode(4);
		ListNode l1c = new ListNode(3);
		l1a.next = l1b;
		l1b.next = l1c;
		ListNode l2a = new ListNode(5);
		ListNode l2b = new ListNode(6);
		ListNode l2c = new ListNode(4);
		l2a.next = l2b;
		l2b.next = l2c;
		*/
		
		ListNode current = addTwoNumbers(l1a, l2a);
		while(current != null) {
			System.out.println(current.val);
			current = current.next;
		}
		
	}
    
}

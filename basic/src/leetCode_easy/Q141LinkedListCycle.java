package leetCode_easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Q141LinkedListCycle {

	public static void main(String[] args) {
//		ListNode l1 = new ListNode(3);
//		l1.next = new ListNode(2);
//		l1.next.next = new ListNode(0);
//		l1.next.next.next = new ListNode(4);
//		l1.next.next.next.next =  l1.next;
		
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = l1;
//		l1.next.next.next.next = new ListNode(0);
//		l1.next.next.next.next.next = new ListNode(3);
//		l1.next.next.next.next.next.next = new ListNode(3);
		
//		printListNode(l1);
		
		boolean result = hasCycle(l1);
		
		System.out.println(result);
		
//		  List lst = new ArrayList();
//		  lst.add(1);
//		  lst.add(2);
//		  lst.add(3);
		  
//		  System.out.println(lst.get(lst.size()-1));
	}
	
	public static void printListNode(ListNode list) {
		ListNode current = list;
		while (Optional.ofNullable(current).isPresent()) {
			System.out.print(current.val);
			System.out.print(" ");
			current = current.next;
		}
		System.out.println();
	}
	
    public static boolean hasCycle(ListNode head) {
        boolean result = false;
        
        if(head != null) {
	        ListNode baseNode = head;
	        ListNode nextNode = head.next;
	        ListNode endNode = null;
	        List<ListNode> lst = new ArrayList<ListNode>();
	        
	        while(nextNode != null) {
	        	if(lst.contains(nextNode)) {
	        		endNode = lst.get(lst.size()-1);
	        		break;
	        	}
	        	
	        	lst.add(nextNode);
	        	nextNode = nextNode.next;
	        }
	        
	        
	        lst.clear();
	        
	        if(endNode != null) {
		        while(baseNode != null) {
		        	if(baseNode == endNode.next) {
		        		result = true;
		        	}
		        	
		        	if(lst.contains(baseNode)) {
		        		break;
		        	}
		        	
		        	lst.add(baseNode);
		        	baseNode = baseNode.next;
		        }
	        }
        }
        
        return result;
        
        /*高手版本 看不懂*/
        /*
 		if (head == null) {
            return false;
        } else if (head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        
        while (slow != null && fast != null) {
            if (slow == fast) {
                return true;
            }
            
            slow = slow.next;
            if (fast.next == null) {
                return false;
            }
            fast = fast.next.next;
        }
        
        return false;
         * 
         * */
    }

}

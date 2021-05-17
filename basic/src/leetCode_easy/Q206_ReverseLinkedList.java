package leetCode_easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Q206_ReverseLinkedList {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(3);
		l1.next.next.next = new ListNode(4);
		l1.next.next.next.next = new ListNode(5);
		printListNode(l1);
		ListNode result = reverseList(l1);
		printListNode(result);
	}
	
    public static ListNode reverseList(ListNode head) {
    	/*自己版本*/
//    	ListNode originNode = head; 
//    	ListNode resultNode = new ListNode(); 
//    	ListNode preNode = new ListNode();
//    	preNode.next = resultNode;
//    	List<ListNode> lst = new ArrayList<ListNode>();
//    	
//    	if(originNode == null)
//        	return null;
//       
//        while(originNode != null) {
//        	lst.add(originNode);
//        	
//        	originNode = originNode.next;
//        }
//        
//        int count = lst.size()-1;
//        while(resultNode != null) {
//        	System.out.println(count);
//        	resultNode.val = lst.get(count).val;
//        	
//        	if(count != 0) {
//	        	resultNode.next = new ListNode();
//	        	
//	        	resultNode = resultNode.next;
//        	}
//        	else if(count == 0) {
//        		resultNode.next = null;
//        		break;
//        	}
//        	
//        	count--;
//        }
//       
//    	return preNode.next;
    	
    	/*高手版本*/
    	ListNode currentNode = head;
    	ListNode preNode = null;
    	ListNode nextNode = null;
    	
    	while(currentNode != null) {
    		/*將下一個node址派給nextNode*/
    		nextNode = currentNode.next;
    		
    		/*將preNode派給現在的node下一個址*/
    		currentNode.next = preNode;
    		
    		/*下一個跌代指向的node*/
    		preNode = currentNode;
    		
    		
    		currentNode = nextNode;
    	}
    	
    	return preNode;
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
}

package leetCode_easy;

import java.util.Optional;

/*
 * 
 * Given the head of a linked list and an integer val, 
 * remove all the nodes of the linked list that has Node.val == val, 
 * and return the new head.
 * 
 * 1.
 * Input: head = [1,2,6,3,4,5,6], val = 6
	Output: [1,2,3,4,5]
 * 
 * 2.
 * 
 * 
 * */
public class Q203_RemoveLinkedListElements {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(6);
		l1.next.next.next = new ListNode(3);
		l1.next.next.next.next = new ListNode(4);
		l1.next.next.next.next.next = new ListNode(5);
		l1.next.next.next.next.next.next = new ListNode(6);
		
//		ListNode l1 = new ListNode(7);
//		l1.next = new ListNode(6);
//		l1.next.next = new ListNode(6);
//		l1.next.next.next = new ListNode(7);
//		
		printListNode(l1);
		System.out.println("---------------");
		ListNode l2 = removeElements(l1, 6);
		System.out.println("---///////-----");
		printListNode(l2);
		System.out.println("---------------");
	}

	public static ListNode removeElements(ListNode head, int val) {
		if(head == null)
			return null;
		
		ListNode node = new ListNode(0);
		ListNode preNode = node;
		node.next = head;
		
		while(head != null) {
			if(head.val == val) {
				preNode.next = head.next;
				head = head.next;
			}
			else {
				preNode = head;
				head = head.next;
			}
		}
		
		return node.next;
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

package leetCode_easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/*
 * Given the heads of two singly linked-lists headA and headB, 
 * return the node at which the two lists intersect.
 *  If the two linked lists have no intersection at all, return null.
For example, the following two linked lists begin to intersect at node c1:
 * 
 * It is guaranteed that there are no cycles anywhere in the entire linked structure.

Note that the linked lists must retain their original structure after the function returns.

Input: intersectVal = 8, listA = [4,1,8,4,5], listB = [5,6,1,8,4,5], skipA = 2, skipB = 3
Output: Intersected at '8'
Explanation: The intersected node's value is 8 (note that this must not be 0 if the two lists intersect).
From the head of A, it reads as [4,1,8,4,5]. From the head of B, it reads as [5,6,1,8,4,5].
 There are 2 nodes before the intersected node in A; There are 3 nodes before the intersected node in B.
 
 Input: intersectVal = 2, listA = [1,9,1,2,4], listB = [3,2,4], skipA = 3, skipB = 1
Output: Intersected at '2'
Explanation: The intersected node's value is 2 (note that this must not be 0 if the two lists intersect).
From the head of A, it reads as [1,9,1,2,4]. From the head of B, it reads as [3,2,4]. 
There are 3 nodes before the intersected node in A; There are 1 node before the intersected node in B.

Input: intersectVal = 0, listA = [2,6,4], listB = [1,5], skipA = 3, skipB = 2
Output: No intersection
Explanation: From the head of A, it reads as [2,6,4]. From the head of B, it reads as [1,5]. Since the two lists do not intersect, intersectVal must be 0, while skipA and skipB can be arbitrary values.
Explanation: The two lists do not intersect, so return null.
 * */
public class Q160IntersectionOfTwoLinkedLists {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(4);
		l1.next = new ListNode(1);
		l1.next.next = new ListNode(8);
		l1.next.next.next = new ListNode(4);
		l1.next.next.next.next = new ListNode(5);
		
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(1);
		l2.next.next.next = new ListNode(8);
		l2.next.next.next.next = new ListNode(4);
		l2.next.next.next.next.next = new ListNode(5);
		
//		printListNode(l1);
		ListNode l3 = getIntersectionNode(l1, l2);
		System.out.println(l3);
//		printListNode(l2);
	}

	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		/*自己版本*/
//		List<ListNode> lstA = new ArrayList<ListNode>();
//		
//		if(headA == null || headB == null) {
//			return null;
//		}
//		
//		while(headA != null) {
//			lstA.add(headA);
//			headA = headA.next;
//		}
//		
//		while(headB != null) {
//			if(lstA.contains(headB)) {
//				return headB;
//			}
//			headB = headB.next;
//		}
//		
//		return null;
		
		/*高手版本*/
		
		
		ListNode first = headA;
		ListNode second = headB;
		
		if(first == null || second == null) {
			return null;
		}
		
		int m = getNodeLength(first);
		int n = getNodeLength(second);
		
		int diff = m -n;
		
		if(diff > 0) {
			int d = 0;
			while(d < diff && first != null) {
				first = first.next;
				d++;
			}
		}
		
		if(diff < 0) {
			int d = 0;
			while(d > diff && second != null) {
				second = second.next;
				diff++;
			}
		}
		
		printListNode(second);
		
		while(first != null && second != null) {
			if(first == second) {
				System.out.println("QQQ");
				return first;
			}
			
			first = first.next;
			second = second.next;
		}
		
		return null;
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
	
	public static int getNodeLength(ListNode node) {
		int result = 0;
		
		while(node != null) {
			result++;
			node = node.next;
		}
		
		return result;
	}
	

}

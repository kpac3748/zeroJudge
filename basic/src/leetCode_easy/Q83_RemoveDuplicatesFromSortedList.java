package leetCode_easy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;

/*
 * Given a sorted linked list, 
 * delete all duplicates such that each element appear only once.
 * Example 1:
 * Input: 1->1->2
 * Output: 1->2
 * Example 2:
 * Input: 1->1->2->3->3
 * Output: 1->2->3
 * 
 * */
public class Q83_RemoveDuplicatesFromSortedList {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(-3);
		l1.next = new ListNode(-1);
		l1.next.next = new ListNode(0);
		l1.next.next.next = new ListNode(0);
		l1.next.next.next.next = new ListNode(0);
		l1.next.next.next.next.next = new ListNode(3);
		l1.next.next.next.next.next.next = new ListNode(3);
		
		printListNode(l1);
		ListNode l2 = deleteDuplicates(l1);
		printListNode(l2);
	}
	
	public static ListNode deleteDuplicates(ListNode head) {
		/*自己的版本*/
//		int count = 0;
//		
//		Set<Integer> set = new HashSet<Integer>();
//		List<ListNode> lst = new ArrayList<ListNode>();
//		
//		ListNode result = new ListNode();
//		ListNode tempNode2 = new ListNode();
//		
//		if(head == null) {
//			return null;
//		}
//		
//		while(head != null) {
//			set.add(head.val);
//			head = head.next;
//		}
//		
//		System.out.println("set = " +  set);
//		
//		TreeSet<Integer> myTreeSet = new TreeSet<Integer>();
//		myTreeSet.addAll(set);
//		
//		for(int val : myTreeSet) {
//			System.out.println("count ggg = " + count);
//			
//			ListNode tempNode = new ListNode();
//			if(count == 0) {
//				/*設定head val*/
//				result.val = val;
//				if(set.size() != 1)
//					result.next = tempNode;
//			}
//			else {
//				if(count == 1) {
//					tempNode = result.next;
//					tempNode.val = val;
//					lst.add(tempNode);
//					count++;
//					continue;
//				}
//				
//				tempNode2 = lst.get(count-2);
//				tempNode2.next = tempNode;
//				tempNode.val = val;
//				lst.add(tempNode);
//			}
//			
//			count++;
//			
//			System.out.println("count = " + count);
//		}
//		
//		System.out.println("lst = " + lst);
//		System.out.println("lst size = " + lst.size());
//		
//		if(lst.size() != 0)
//			result.next = lst.get(0);
//		
//        return result;
		
		/*高手版本*/
		
//		ListNode original = head;
//		ListNode next = head.next;
//		
//		
//		while(next != null) {
//			/*如果目前node和下一個node值相同，把目前node的下一個node指向不同值的node*/
//			if(next.val == original.val) {
//				original.next = next.next;
//				next = next.next;
//			}
//			else {
//				original = next;
//				next = next.next;
//			}
//		}
//		
//		return head;
		
		
		
		ListNode baseNode = head;
		ListNode nextNode = head.next;
		
		while(nextNode != null) {
			if(nextNode.val == baseNode.val) {
				baseNode.next = nextNode.next;
				nextNode = nextNode.next;
			}
			else {
				baseNode = nextNode;
				nextNode = nextNode.next;
			}
		}
		
		return head;
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


package leetCode_easy;

import java.util.Optional;

/*Merge two sorted linked lists and return it as a new sorted list.
  The new list should be made by splicing together the nodes of the first two lists.*/
public class Q21_MergeTwoSortedLists {

	public static void main(String[] args) {
		Object ob = new Object();
		
		ListNode l1 = new ListNode();
		
		System.out.println(l1.val);
		
		l1.next = new ListNode();
		l1.next.next = new ListNode(4);
		
		ListNode l2 = new ListNode();
		l2.next = new ListNode(3);
		l2.next.next = new ListNode(4);
		
		printListNode(l1);
		printListNode(l2);
		
		ListNode qoo[] = {null};
		ListNode xo[] = {null};
		
		ListNode merged = mergeTwoLists(qoo[0], xo[0]);
		printListNode(merged);
	}

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode l3 = new ListNode();
		ListNode result = l3;
		
		if(l1 == null && l2 == null) {
			System.out.println(l1);
			return null;
		}
		
		/*linkedlist��null ����*/
		while (l1 != null || l2 != null) {
			/*�p�G���lst�����Onull�A�i��compare*/
			if (l1 != null && l2 != null) {
				if (l1.val > l2.val) {
					l3.val = l2.val;
					/*���X�U�@�ӭ�*/
					l2 = l2.next;
				} else {
					l3.val = l1.val;
					l1 = l1.next;
				}
			}
			/*�p�G�䤤�@�Ӥ��Onull�A�N���٦���*/
			else {
				if(l1 != null) {
					l3.val = l1.val;
					l1 = l1.next;
				}
				else if(l2 != null) {
					l3.val = l2.val;
					l2 = l2.next;
				}
			}
			
			if (l1 != null || l2 != null) {
				l3.next = new ListNode();
				l3 = l3.next;
			}
		}

		return result;
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

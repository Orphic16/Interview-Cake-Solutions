package solutions;

import utils.LinkedList;

public class ReverseALinkedList {
	public static LinkedList reverse(LinkedList head) {
		LinkedList current = head;
		LinkedList next, prev = null;

		while (current != null) {
			next = current.next;

			current.next = prev;

			prev = current;
			current = next;
		}

		return prev;
	}
}
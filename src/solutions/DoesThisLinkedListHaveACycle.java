package solutions;

import utils.LinkedList;

public class DoesThisLinkedListHaveACycle {
	public static boolean checkCycle(LinkedList firstNode) {
		LinkedList slow = firstNode;
		LinkedList fast = firstNode;
		
		while (slow.next != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			
			if (slow == fast) {
				return true;
			}
		}
		
		return false;
	}
}

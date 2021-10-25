import org.junit.jupiter.api.Test;
import solutions.ReverseALinkedList;
import utils.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseALinkedListTests {
	@Test
	public void test() {
		LinkedList list = new LinkedList(1);
		list.next = new LinkedList(2);
		list.next.next = new LinkedList(3);
		LinkedList reverse = ReverseALinkedList.reverse(list);

		assertEquals(3, reverse.data);
	}
}

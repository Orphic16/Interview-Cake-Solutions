import static org.junit.Assert.*;
import org.junit.Test;
import solutions.*;
import utils.*;

public class DoesThisLinkedListHaveACycleTests {
	@Test
	public void test() {
		LinkedList a = new LinkedList(1);
		LinkedList b = new LinkedList(2);
		LinkedList c = new LinkedList(3);
		LinkedList d = new LinkedList(4);
		LinkedList e = new LinkedList(5);
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		
		assertFalse(DoesThisLinkedListHaveACycle.checkCycle(a));
	}
	
	@Test
	public void testCycle() {
		LinkedList a = new LinkedList(1);
		LinkedList b = new LinkedList(2);
		LinkedList c = new LinkedList(3);
		LinkedList d = new LinkedList(4);
		LinkedList e = new LinkedList(5);
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = a;
		
		assertTrue(DoesThisLinkedListHaveACycle.checkCycle(a));
	}
}

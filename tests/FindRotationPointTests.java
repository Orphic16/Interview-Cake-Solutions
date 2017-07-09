import static org.junit.Assert.*;
import org.junit.Test;
import solutions.*;

public class FindRotationPointTests {
	@Test
	public void test() {
		String[] words = new String[]{
			    "ptolemaic",
			    "retrograde",
			    "supplant",
			    "undulate",
			    "xenoepist",
			    "asymptote", // <-- rotates here!
			    "babka",
			    "banoffee",
			    "engender",
			    "karpatka",
			    "othellolagkage",
			};
		
		assertEquals(5, FindRotationPoint.findRotationPoint(words));
	}
	
	@Test
	public void testAlreadySorted() {
		String[] dictionary = new String[]{"a", "b", "c", "d", "e"};
		assertEquals(5, FindRotationPoint.findRotationPoint(dictionary));
	}
	
	@Test
	public void testLastPosition() {
		String[] dictionary = new String[]{"b", "c", "d", "e", "a"};
		assertEquals(4, FindRotationPoint.findRotationPoint(dictionary));
	}
}

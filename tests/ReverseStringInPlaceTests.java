import org.junit.jupiter.api.Test;
import solutions.ReverseStringInPlace;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseStringInPlaceTests {
	@Test
	public void test() {
		assertEquals("gfedcba", ReverseStringInPlace.reverse("abcdefg"));
	}
}

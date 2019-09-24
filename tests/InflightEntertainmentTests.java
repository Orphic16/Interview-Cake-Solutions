import org.junit.jupiter.api.Test;
import solutions.InflightEntertainment;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class InflightEntertainmentTests {
	@Test
	public void test() {
		int[] movieLengths = new int[]{10, 7, 5, 8, 11, 9};
		assertTrue(InflightEntertainment.twoMoviesFillFlight(movieLengths, 21));
	}
	
	@Test
	public void testBadCase() {
		int[] movieLengths = new int[]{10, 7, 5, 8, 11, 9};
		assertFalse(InflightEntertainment.twoMoviesFillFlight(movieLengths, 11));
	}
}

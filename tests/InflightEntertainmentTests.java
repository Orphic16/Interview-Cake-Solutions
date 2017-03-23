import static org.junit.Assert.*;
import org.junit.Test;
import solutions.*;

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

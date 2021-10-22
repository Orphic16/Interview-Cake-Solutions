import org.junit.jupiter.api.Test;
import solutions.InPlaceShuffle;

public class InPlaceShuffleTests {
	@Test
	public void test() {
		int[] array = new int[]{10, 7, 5, 8, 11, 9};
		InPlaceShuffle.inplaceShuffle(array);
	}	
}

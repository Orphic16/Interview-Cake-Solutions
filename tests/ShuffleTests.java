import org.junit.Test;
import solutions.*;

public class ShuffleTests {
	@Test
	public void test() {
		int[] array = new int[]{10, 7, 5, 8, 11, 9};
		Shuffle.inplaceShuffle(array);
	}	
}

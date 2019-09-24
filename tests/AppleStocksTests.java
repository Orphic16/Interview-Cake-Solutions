import org.junit.jupiter.api.Test;
import solutions.AppleStocks;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppleStocksTests {
	@Test
	public void test() {
		int[] stockPricesYesterday = new int[]{10, 7, 5, 8, 11, 9};
		assertEquals(6, AppleStocks.getMaxProfit(stockPricesYesterday));
	}
	
	@Test
	public void testAlwaysIncreasing() {
		int[] stockPricesYesterday = new int[]{1, 2, 3, 4, 5, 6};
		assertEquals(5, AppleStocks.getMaxProfit(stockPricesYesterday));
	}
	
	@Test
	public void testAlwaysDecreasing() {
		int[] stockPricesYesterday = new int[]{6, 5, 4, 3, 2, 1};
		assertEquals(0, AppleStocks.getMaxProfit(stockPricesYesterday));
	}
}

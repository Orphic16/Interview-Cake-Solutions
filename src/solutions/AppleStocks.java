package solutions;

public class AppleStocks {
	public static int getMaxProfit(int[] stockPricesYesterday) {
		int maxProfit = 0;
		int minSoFar = stockPricesYesterday[0];

		for (int j : stockPricesYesterday) {
			minSoFar = Math.min(j, minSoFar);
			maxProfit = Math.max(j - minSoFar, maxProfit);
		}
		
		return maxProfit;
	}
}
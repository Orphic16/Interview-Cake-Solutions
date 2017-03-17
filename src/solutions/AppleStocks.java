package solutions;

public class AppleStocks {
	public static int getMaxProfit(int[] stockPricesYesterday) {
		int maxProfit = 0;
		int minSoFar = stockPricesYesterday[0];
		
		for (int i=0;i<stockPricesYesterday.length; i++) {
			minSoFar = Math.min(stockPricesYesterday[i], minSoFar);
			maxProfit = Math.max(stockPricesYesterday[i] - minSoFar, maxProfit);
		}
		
		return maxProfit;
	}
}
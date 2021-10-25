package solutions;

public class ProductOfAllOtherNumbers {
	public static int[] findProduct(int[] numbers) {
		int[] result = new int[numbers.length];

		int[] productBeforeIndex = new int[numbers.length];
		int[] productAfterIndex = new int[numbers.length];

		int total = 1;
		for (int i=0; i<numbers.length; i++) {
			productBeforeIndex[i] = total;
			total = total * numbers[i];
		}

		total = 1;
		for (int i=numbers.length -1; i>=0; i--) {
			productAfterIndex[i] = total;
			total = total * numbers[i];
		}

		for (int i=0; i<numbers.length; i++) {
			result[i] = productBeforeIndex[i] * productAfterIndex[i];
		}

		return result;
	}
}
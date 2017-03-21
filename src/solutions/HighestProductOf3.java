package solutions;

public class HighestProductOf3 {
	public static int highestProductOf3(int[] values) {
		int highestProductOf3 = values[0] * values[1] * values[2];
		
		int highestProductOf2 = values[0] * values[1];
		int lowestProductOf2 = values[0] * values[1];		

		int highestValue = Math.max(values[0], values[1]);
		int lowestValue = Math.min(values[0], values[1]);
		
		for (int i=2; i<values.length; i++) {
			highestProductOf3 = Math.max(highestProductOf3, Math.max(highestProductOf2 * values[i], lowestProductOf2 * values[i]));
			
			highestProductOf2 = Math.max(highestProductOf2, Math.max(highestValue * values[i], lowestValue * values[i]));
			lowestProductOf2 = Math.min(lowestProductOf2, Math.min(highestValue * values[i], lowestValue * values[i]));
			
			highestValue = Math.max(highestValue, values[i]);
			lowestValue = Math.min(lowestValue, values[i]);
		}
		
		return highestProductOf3;
	}
}

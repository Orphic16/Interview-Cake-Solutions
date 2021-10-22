package solutions;

import java.util.ArrayList;
import java.util.Arrays;

public class MakingChange {
	public static ArrayList<String> permute(int total, int[] denominations) {
		ArrayList<String> output = new ArrayList<>();
		
		for(int i=denominations.length-1; i>= 0; i--) {
			permute(total - denominations[i], denominations, denominations[i], denominations[i] + "", output);
		}	
		
		return output;
	}
	
	private static void permute(int total, int[] denominations, int currentDenomination, String outputSoFar, ArrayList<String> output) {
		if (currentDenomination > total) {
			denominations = Arrays.copyOf(denominations, denominations.length-1);
		}
		
		if (total == 0) {
			output.add(outputSoFar);
		} else if (total > 0) {
			for (int i = denominations.length - 1; i >= 0; i--) {
				if (denominations[i] <= currentDenomination) {
					permute(total - denominations[i], denominations, denominations[i], outputSoFar + " " + denominations[i], output);
				}
			}
		}
	}
	
	public static long count(int total, int[] denominations) {
		long[] memory = new long[total+1];	
		
		memory[0] = 1;

		for (int denomination : denominations) {
			for (int j = denomination; j <= total; j++) {
				memory[j] += memory[j - denomination];
			}
		}
				
		return memory[total];
	}
}
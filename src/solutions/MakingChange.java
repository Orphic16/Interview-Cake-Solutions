package solutions;

import java.util.ArrayList;
import java.util.Arrays;

public class MakingChange {
	public static ArrayList<String> permutate(int total, int[] denominations) {
		ArrayList<String> output = new ArrayList<String>();
		
		for(int i=denominations.length-1; i>= 0; i--) {
			permutate(total - denominations[i], denominations, denominations[i], denominations[i] + "", output);
		}	
		
		return output;
	}
	
	private static void permutate(int total, int[] denominations, int currentDenom, String outputSoFar, ArrayList<String> output) {
		if (currentDenom > total) {
			denominations = Arrays.copyOf(denominations, denominations.length-1);
		}
		
		if (total < 0) {
			return;
		} else if (total == 0) {
			output.add(outputSoFar);
		} else {
			for(int i=denominations.length-1; i>= 0; i--) {
				if (denominations[i] <= currentDenom) {
					permutate(total - denominations[i], denominations, denominations[i], outputSoFar + " " + denominations[i], output);
				}
			}	
		}
	}
}
package solutions;

import java.util.HashSet;

public class InflightEntertainment {
	public static boolean twoMoviesFillFlight(int[] movieLengths, int flightLength) {
		HashSet<Integer> timeLookup = new HashSet<Integer>();
		for (int i=0; i<movieLengths.length; i++) {
			int lengthToFind = flightLength - movieLengths[i];
			if (timeLookup.contains(lengthToFind)) {
				return true;
			}
			
			timeLookup.add(movieLengths[i]);
		}
		
		return false;
	}
}

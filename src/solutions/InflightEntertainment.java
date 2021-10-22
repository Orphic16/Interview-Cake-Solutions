package solutions;

import java.util.HashSet;

public class InflightEntertainment {
	public static boolean twoMoviesFillFlight(int[] movieLengths, int flightLength) {
		HashSet<Integer> timeLookup = new HashSet<>();
		for (int movieLength : movieLengths) {
			int lengthToFind = flightLength - movieLength;
			if (timeLookup.contains(lengthToFind)) {
				return true;
			}

			timeLookup.add(movieLength);
		}
		
		return false;
	}
}

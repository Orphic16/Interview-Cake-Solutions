package solutions;

public class FindRotationPoint {
	public static int findRotationPoint(String[] words) {
		int floor = 0;
		int ceil = words.length;
		while (floor < ceil) {
			int pos = floor + ((ceil - floor) / 2);
			if (words[pos].compareTo(words[0]) > 0) {
				floor = pos;
			} else {
				ceil = pos;
			}
			
			if (floor + 1 == ceil) {
				return ceil;
			}
		}		
		
		return 0;
	}
}
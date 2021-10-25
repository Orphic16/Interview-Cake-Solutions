package solutions;

import java.util.ArrayList;
import java.util.List;

public class RecursiveStringPermutations {
	public static List<String> getPermutations(String str) {
		if (str.length() <= 1) return List.of(str);

		String allCharsExceptLast = str.substring(0, str.length() - 1);
		String lastChar = str.substring(str.length() - 1);

		List<String> permutationsOfAllCharsButLast = getPermutations(allCharsExceptLast);

		List<String> permutations = new ArrayList<>();

		for (String s : permutationsOfAllCharsButLast) {
			for (int j = 0; j < allCharsExceptLast.length() + 1; j++) {
				String permutation = s.substring(0, j) + lastChar + s.substring(j);
				permutations.add(permutation);
			}
		}

		return permutations;
	}
}
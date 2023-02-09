package codingchallenges;

import java.util.Arrays;

public class Dinglemouse {
	public static void main(String[] args) {
		// converting Array to a string to get a human readable output
		System.out.println(Arrays.toString(humanYearsCatYearsDogYears(5)));
	}

	public static int[] humanYearsCatYearsDogYears(final int humanYears) {
		// Your code here!
		int catYears = 0;
		int dogYears = 0;

		for (int i = 1; i <= humanYears; i++) {
			if (i == 1) {
				catYears = 15;
				dogYears = 15;
			}
			if (i == 2) {
				catYears += 9;
				dogYears += 9;
			}
			if (i >= 3) {
				catYears += 4;
				dogYears += 5;
			}
		}

		return new int[] { humanYears, catYears, dogYears };
	}

}
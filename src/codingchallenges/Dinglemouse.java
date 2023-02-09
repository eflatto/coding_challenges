package codingchallenges;

import java.util.Arrays;
/*
 * Question:
 * I have a cat and a dog.

I got them at the same time as kitten/puppy. That was humanYears years ago.

Return their respective ages now as [humanYears,catYears,dogYears]

NOTES:

humanYears >= 1
humanYears are whole numbers only
Cat Years
15 cat years for first year
+9 cat years for second year
+4 cat years for each year after that
Dog Years
15 dog years for first year
+9 dog years for second year
+5 dog years for each year after that

 * 
 */
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
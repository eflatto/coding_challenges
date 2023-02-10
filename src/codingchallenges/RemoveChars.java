package codingchallenges;
/*
 * Question
 * It's pretty straightforward. Your goal is to create a 
 * function that removes the first and last characters of a string. 
 * You're given one parameter, the original string. You 
 * don't have to worry with strings with less than two characters.
 */
public class RemoveChars {
	public static void main(String[] args) {
		String hello="hello";
		System.out.println(remove(hello));
	}

	public static String remove(String str) {

		str = str.substring(1, str.length() - 1);

		return str;
	}

}

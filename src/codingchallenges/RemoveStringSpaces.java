package codingchallenges;
/*
 * Simple, remove the spaces from the string, 
 * then return the resultant string
 */
public class RemoveStringSpaces {
	public static void main(String[] args) {
		System.out.println(noSpace("8 j 8   mBliB8g  imjB8B8  jl  B"));
	}
	

	public static String noSpace(final String x) {
		String[] h = x.split(" ");
		String newStr = "";
		for (String str : h) {
			newStr += str;
		}
		return newStr;
	}
}
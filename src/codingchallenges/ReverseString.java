package codingchallenges;

/*
 * Complete the solution so that it 
 * reverses the string passed into it.
 */
public class ReverseString {
	public static void main(String[] args) {
		System.out.println(solution("Hello world"));
	}

	public static String solution(String str) {

		String reversed = "";
		for (int i = str.length()-1; i >= 0; i--) {
			reversed += str.charAt(i);
		}
		return reversed;
	}

}
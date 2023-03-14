package codingchallenges;


	// Complete the solution so that it returns true if the
	// first argument(string) passed in ends with the 2nd argument (also a string).
	public class Stringendswith {
		public static void main(String[] args) {
			System.out.println(solution("Hello World", "World"));
		}
		public static boolean solution(String str, String ending) {
			if (str.endsWith(ending)) {
				return true;
			}
			return false;
		}
	}



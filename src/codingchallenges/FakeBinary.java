package codingchallenges;

/*
 * QUESTION
 * 
Given a string of digits, you should replace any digit 
below 5 with '0' and any digit 5 and above with '1'. 
Return the resulting string.

 Note: input will never be an empty string
*/
public class FakeBinary {
	public static void main(String[] args) {
		System.out.println(fakeBin("1234567"));
	}
    public static String fakeBin(String numberString) {
    	 // Replace all digits below 5 with '0'
        // Replace all digits 5 and above with '1'
    	
    	//used replaceAll to replace all occurrences of the specified regex with either "0" or "1"
        return numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");
    }
}

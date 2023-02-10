package codingchallenges;
/*
 * Check to see if a string has the same amount of 
 * 'x's and 'o's. The method must return a boolean 
 * and be case insensitive. The string can contain 
 * any char.
 */
public class XO {
  
	public static void main(String[] args) {
		System.out.println(getXO("xoxox"));
		System.out.println(getXO("yrtXoOrtrx"));
	}
  public static boolean getXO (String str) {
    int countx=0;
    int counto=0;
 
    for(int i=0;i<str.length();i++){
      if(str.charAt(i) == ('x') ||str.charAt(i) == ('X')) {
        countx++;
      }
      if(str.charAt(i) == ('o') ||str.charAt(i) == ('O')) {
        counto++;
      }
  
    }
    return countx==counto;
  }
}
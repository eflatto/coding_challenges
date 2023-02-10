package codingchallenges;
public class ShortestWord {
	public static void main(String[] args) {
		System.out.println(findShort("bitcoin take over the world maybe who knows perhaps"));
	}
    public static int findShort(String s) {
      //split each word by spaces
      String[] shortestWord = s.split(" ");
      int length = shortestWord[0].length();
      for(int i=0;i<shortestWord.length;i++){
        if(shortestWord[i].length()< length){
          length=shortestWord[i].length();
        }
      }
      return length;
   }
}
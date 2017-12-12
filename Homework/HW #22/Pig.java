//Kenny Lin
//APCS1 pd 8
//HW #22: Otnay Ybay ethay Airhay Onway Ymay Inneechay Inchay Inchay
//2017-25-10

public class Pig
{
    //creates a constant, unchangeable master list of vowels for ease of access
    private static final String VOWELS = "aeiou";


    /*=====================================
      boolean hasA(String,String) -- checks for a letter in a String
      pre:  w != null, letter.length() == 1
      post: hasA("cat", "a") -> true
      hasA("cat", "p")       -> false
      =====================================*/
    public static boolean hasA( String w, String letter ) 
    {
	if (w != null && letter.length() == 1) {
	    return (w.indexOf(letter) >= 0); //can still be 0
	} return false; //just returned false precond was not met
    }//end hasA()


    /*=====================================
      boolean isAVowel(String) -- tells whether a letter is a vowel
      precondition: letter.length() == 1
      =====================================*/
    public static boolean isAVowel( String letter ) 
    {
	if (letter.length() == 1){
	    return (VOWELS.indexOf(letter) >= 0); //stmt returns bool
	} return false;
    }


    /*=====================================
      int countVowels(String) -- counts vowels in a String
      pre:  w != null
      post: countVowels("meatball") -> 3
      =====================================*/
    public static int countVowels( String w ) {
        if (w != null) { //precond checker
	    int counter = 0;
	    for (int p = 0; p < w.length() ; p++) { //iterates based on place of string 
		String currLetter = w.substring(p,p+1);
		if (hasA(VOWELS, currLetter)){ //if vowel
		    counter += 1; // add one
		}
	    } return counter;
	} return 0;
    }

    /*=====================================
      boolean hasAVowel(String) -- tells whether a String has a vowel
      pre:  w != null
      post: hasAVowel("cat") -> true
      hasAVowel("zzz")       -> false
      =====================================*/
    public static boolean hasAVowel( String w )
    {
	//I accidently already coded this
	if (w != null) {
	    int counter = 0;
	    for (int p = 0; p < w.length() ; p++) { //iterates based on place of string 
	        String currLetter = w.substring(p,p+1);
		if (isAVowel(currLetter)){
		    counter += 1;
			}
	    } return counter > 0;
	} return false;
    }

    /*=====================================
      String allVowels(String) -- returns vowels in a String
      pre:  w != null
      post: allVowels("meatball") -> "eaa"
      =====================================*/
    public static String allVowels( String w ) 
    {
	//code was based off last method 
	if (w != null) {
	    String newString = ""; 
	    for (int p = 0; p < w.length() ; p++) { //iterates based on place of string 
	        String currLetter = w.substring(p,p+1);
		if (isAVowel(currLetter)){
		    newString += currLetter;
			}
	    } return newString;
	} return null;
    }



    public static void main( String[] args ) 
    {
	System.out.println("");
	System.out.println("============hasA Test===========");
	System.out.print("Expected true: ");
	System.out.println(hasA("cat", "a"));
	System.out.print("Expected false: ");
	System.out.println(hasA("cat", "p"));
	System.out.println("");
	System.out.println("============isAVowel Test===========");
	System.out.print("Expected true: ");
	System.out.println(isAVowel("a"));
	System.out.print("Expected false: ");
	System.out.println(isAVowel("p"));
	System.out.println("============countVowels Test ===========");
	System.out.print("Expected 3: ");
	System.out.println(countVowels("meatball"));
	System.out.print("Expected 0: ");
	System.out.println(countVowels("ptsd"));
	System.out.println("============hasAVowel Test ===========");
	System.out.print("Expected true: ");
	System.out.println(hasAVowel("cat"));
	System.out.print("Expected false: ");
	System.out.println(hasAVowel("zzz"));
	System.out.println("============allVowels Test  ===========");
	System.out.print("Expected eaa: ");
	System.out.println(allVowels("meatball"));
	System.out.print("Expected u: ");
	System.out.println(allVowels("u"));
    }//end main()

}//end class Pig

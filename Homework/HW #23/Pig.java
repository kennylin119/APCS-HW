/*  PigOTG
    Kenny Lin
    William Lu, Kenny Lin, Rohan Ahammed
    APCS1 pd8
    HW23 -- Etterbay Odingcay Oughthray Ollaborationcay
    2017-10-25 */
    
/*  To-Do List for Other Methods and relevant notes: 
        We need a method that changes a word with upper case letters to all lower case letters.
        We need a method that changes the word back after engToPig().
        We need a method that ignores punctuations.
 */

public class Pig{
    
    //Q: How does this initialization make your life easier?
    //A: So we don't have to retype the string "aeiou" more than once.
    private static final String VOWELS = "aeiou";


    /*=====================================
      boolean hasA(String,String) -- checks for a letter in a String
      pre:  w != null, letter.length() == 1
      post: hasA("cat", "a") -> true
      hasA("cat", "p")       -> false
      =====================================*/
    public static boolean hasA( String w, String letter ){
        return w.indexOf(letter) != -1; 
        // true when letter isn't not present in w, false otherwise
    }//end hasA()


    /*=====================================
      boolean isAVowel(String) -- tells whether a letter is a vowel
      precondition: letter.length() == 1
      =====================================*/
    public static boolean isAVowel( String letter ){
        return hasA(VOWELS, letter); 
        // true when the letter can be found in the group of vowels
    }


    /*=====================================
      int countVowels(String) -- counts vowels in a String
      pre:  w != null
      post: countVowels("meatball") -> 3
      =====================================*/
    public static int countVowels( String w ){
        int ctr = 0; // start counting vowels
        for (int i = 0; i < w.length(); i ++){
            // for each letter in w, if the ltter is a vowel, add 1 to ctr
            if (isAVowel(w.substring(i, i + 1))){
                ctr ++;
            }
        }
        return ctr;
    }


    /*=====================================
      boolean hasAVowel(String) -- tells whether a String has a vowel
      pre:  w != null
      post: hasAVowel("cat") -> true
      hasAVowel("zzz")       -> false
      =====================================*/
    public static boolean hasAVowel( String w ){
        return countVowels(w) != 0;
        // true if w has any number of vowels but 0
    }


    /*=====================================
      String allVowels(String) -- returns vowels in a String
      pre:  w != null
      post: allVowels("meatball") -> "eaa"
      =====================================*/
    public static String allVowels( String w ){
        String str = ""; // start accumulating vowels
        String ltr; // use a var for each letter
        for (int i = 0; i < w.length(); i ++){
            ltr = w.substring(i, i + 1);
            // for each letter in w, if the ltter is a vowel, append it to str
            if (isAVowel(ltr)){
                str += ltr;
            }
        }
        return str;
    }
    

    //pre: w != null
    //post: firstVowel("") --> ""
    //      firstVowel("zzz") --> ""
    //      firstVowel("meatball") --> "e"
    public static String firstVowel(String w){
        if (!hasAVowel(w)){
            return "";
        }// makes sure to return empty string if no vowels to be found by taking a previous method we defined and applying the logical operator !
        return allVowels(w).substring(0, 1);
    }
    

    //pre: w != null and w.length() > 0
    //post: beginsWithVowel("apple")  --> true
    //      beginsWithVowel("strong") --> false
    public static boolean beginsWithVowel(String w){
        return isAVowel(w.substring(0, 1)); // checking the first character of the string and figuring out if it is a vowel or not
    }

    
    //pre: w.length() > 0
    //post: engToPig("apple")  --> "appleway"
    //      engToPig("strong") --> "ongstray"
    //      engToPig("java")   --> "avajay"
    public static String engToPig(String w){
        if (beginsWithVowel(w)){
            return w + "way";
        }
        // no need for else statement. if the vowel is not the first character, then the first character must be a consonant. future development may require else if statements. 
        int indexFirstVowel = w.indexOf(firstVowel(w));
        return w.substring(indexFirstVowel) + w.substring(0, indexFirstVowel) + "ay";
    }
        
    public static void main( String[] args ){
        
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
	System.out.println("");
	
	System.out.println("============countVowels Test ===========");
	System.out.print("Expected 3: ");
	System.out.println(countVowels("meatball"));
	System.out.print("Expected 0: ");
	System.out.println(countVowels("ptsd"));
	System.out.println("");
	
	System.out.println("============hasAVowel Test ===========");
	System.out.print("Expected true: ");
	System.out.println(hasAVowel("cat"));
	System.out.print("Expected false: ");
	System.out.println(hasAVowel("zzz"));
	System.out.println("");
	
	System.out.println("============allVowels Test ===========");
	System.out.print("Expected eaa: ");
	System.out.println(allVowels("meatball"));
	System.out.print("Expected u: ");
	System.out.println(allVowels("u"));
	System.out.println("");
	
	System.out.println("============firstVowel Test ===========");
	System.out.print("Expected e: ");
        System.out.println(firstVowel("meatball")); 
	System.out.print("Expected a: ");
	System.out.println(firstVowel("phantom"));
	System.out.println("");
	
	System.out.println("============beginsWithVowel Test ===========");
	System.out.print("Expected true: ");
        System.out.println(beginsWithVowel("ouch")); 
	System.out.print("Expected false: ");
	System.out.println(beginsWithVowel("static")); 
	System.out.println("");
	
	System.out.println("============engToPig Test ===========");
	System.out.print("Expected ollaborationcay: ");
	System.out.println(engToPig("collaboration"));  
	System.out.print("Expected oughthray: ");
	System.out.println(engToPig("through"));  
	System.out.print("Expected onslaughtway: ");
	System.out.println(engToPig("onslaught"));
	System.out.println("");
    }//end main()

}//end class Pig

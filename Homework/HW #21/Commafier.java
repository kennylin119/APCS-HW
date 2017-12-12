/* Kenny Lin 
APCS1 pd8
HW21 -- Karmacomma
2017-24-10   */

public class Commafier {
    public static void main (String[] args) {
	System.out.println(commafyR(2) );
    }
    public static String commafyR (Integer[] args) {
	String commaStr = "";
	for (Integer i: args) {
	    String str = Integer.toString(i);
	    int l = str.length();
	    commaStr += str.substring(l, l+1);
	    l -= 1;
	}
	return commaStr;
    }
    public static String commafyF (Integer[] args) {
	
    }
}

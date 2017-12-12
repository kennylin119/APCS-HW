//Kenny Lin
//APCS pd 8
//Hw 25 All Hallow's Eve
//2017-11-01


public class Looper {
    public static void main (String[] args) {
	System.out.println( randArray()); //will return overflow error
    }
    public static int[] randArray () {
	int numInt = 10; //max limit for ints
	int[] randArray = new int[numInt];
	for (int i = 0; i < numInt; i++) {
	    int randNum = ((int) (Math.random()* 2147483647)
			   - (int) (Math.random() * 2147483647));
	    randArray[i] = randNum;
	} return randArray;
    }
}


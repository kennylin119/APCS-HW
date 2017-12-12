Kenny Lin
APCS1 pd8
HW6 -- On BigSib Individuality and the Elimination of Radio Fuzz
2017--09--25

public class BigSib {
    private String helloMsg;
    public void setHelloMsg(String newMsg) {
	helloMsg = newMsg;
    }
	public String greet(String name) {
	String statement = helloMsg + name ;
	return statement;
    }
}

/* My greet function

public class Greet {
    public static void main(String[] a ) {
	String gOne;
	String gTwo;
	String gThree;
	String gFour;
	
	BigSib richard = new BigSib();
	BigSib bob = new BigSib();
	BigSib kenny = new BigSib();
	BigSib ilya = new BigSib();
	
	richard.setHelloMsg("Word up ");
	bob.setHelloMsg("Salutations ");
	kenny.setHelloMsg("Hey ya ");
	ilya.setHelloMsg("Sup ");
	
	gOne = richard.greet("freshman");
	gTwo = bob.greet("Dr. Spaceman");
	gThree = kenny.greet("Kong Fooey");
	gFour = ilya.greet("mom");
	
        System.out.println(gOne);
	System.out.println(gTwo);
	System.out.println(gThree);
	System.out.println(gFour);	
    }
}
*/

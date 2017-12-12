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

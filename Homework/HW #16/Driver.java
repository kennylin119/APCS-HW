/***
  driver for class Coin
  ~~~ SUGGESTED WORKFLOW: ~~~
  1. Compile this file and run.
  2. Move the "TOP" line below the first statement. 
  (with cursor at beginning of TOP line, C-k C-k, DOWN, DOWN, C-y)
  3. Compile and run again. 
  4. Resolve errors 1 at a time until it works
  5. Repeat 2-4 until TOP meets BOTTOM
***/

public class Driver
{
  public static void main( String[] args )
  {

    //build Objects from blueprint specified by class Coin

    //test default constructor
    Coin mine = new Coin();

    //test 1st overloaded constructor
    Coin yours = new Coin( "quarter" );

    //test 2nd overloaded constructor
    Coin wayne = new Coin( "dollar", "heads" );

    //test toString() methods of each Coin
    System.out.println("mine: " + mine);
    System.out.println("yours: " + yours);
    System.out.println("wayne: " + wayne);

    //test flip() method
    System.out.println("\nAfter flipping...");
    yours.flip();
    wayne.flip();
    System.out.println("yours: " + yours);
    //System.out.println("yours: " + headsCtr);
    System.out.println("wayne: " + wayne);

    System.out.println();
    System.out.println("===================Test 1=========================");
    //modification 1, until 3 heads comes up
    	yours.reset("tails",.5);
	wayne.reset("tails",.5);
    while ((yours.getHeadsCtr() < 3) || (wayne.getHeadsCtr() < 3) ) {
	System.out.println("\nAfter flipping...");
	yours.flip();
	wayne.flip();
	System.out.println("yours: " + yours);
	System.out.println("wayne: " + wayne);
    }
    
    System.out.println();
    System.out.println("===================Test 2=========================");
        //modification 2, until 3 flips occur
	yours.reset("tails",.5);
	wayne.reset("tails",.5);
    while (yours.getFlipCtr() < 3) {
	System.out.println("\nAfter flipping...");
	yours.flip();
	wayne.flip();
	System.out.println("yours: " + yours);
	System.out.println("wayne: " + wayne);
    }
    
    System.out.println();
    System.out.println("===================Test 3=========================");
    //modification 3, until at least 1300 flips occur and is divisible by 1300
    	yours.reset("tails",.5);
	wayne.reset("tails",.5);
	while ( (yours.getHeadsCtr() < 13000) && ( (yours.getHeadsCtr() / 2000) == (int) yours.getHeadsCtr() / 2000 ) ) {
        //System.out.println("\nAfter flipping...");
	yours.flip();
	wayne.flip();
	//System.out.println("yours: " + yours);
	//System.out.println("wayne: " + wayne);
    }
    
    //test equals() method
    if ( yours.equals(wayne) ) 
	    System.out.println( "Matchee matchee!" );
    else
	    System.out.println( "No match. Firestarter you can not be." );

  }//end main()

}//end class

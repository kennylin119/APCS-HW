/*==================================================
  class GuessNumber -- fun fun fun!

  eg, sample interaction with end user:
  Guess a # fr 1-100: 50
  Too high
  Guess a # fr 1-49: 25
  Too low
  Guess a # fr 26-49: 38
  Correct! It took 3 guesses
  ==================================================*/

import cs1.Keyboard;
import java.util.Random;

public class GuessNumber 
{
    //instance vars
    private int _lo, _hi, _guessCtr, _target;


    /*==================================================
      constructor -- initializes a guess-a-number game
      pre:  
      post: _lo is lower bound, _hi is upper bound,
      _guessCtr is 1, _target is random int on range [_lo,_hi]
      ==================================================*/
    public GuessNumber( int a, int b ) 
    {
	int _lo = a;
	System.out.println(a);
	int _hi = b;
	System.out.println(b);
	int _guessCtr = 1;
	Random rand = new Random();
	int _target = rand.nextInt(_hi) + (_lo);
	//System.out.println(_target);
    }


    /*==================================================
      void playRec() -- Prompts a user to guess until guess is correct.
      Uses recursion.
      pre:  
      post: 
      ==================================================*/
    public void playRec() 
    {
	System.out.println("Please enter a guess between"
			   + _lo + " and " + _hi);
	int counter = 0;
	int guess = Keyboard.readInt();
	if (guess == _target){
	    System.out.println("You win!");
	} else if (guess <= _target) {
	    counter += 1;
	    System.out.println("Your guess was too low");
	    System.out.println("Number of tries: " + counter);
	    playRec();
	} else {
	    counter += 1;
	    System.out.println("Your guess was too high");
	    System.out.println("Number of tries: " + counter);
	    playRec();
	}
    }


    /*==================================================
      void playIter() -- Prompts a user to guess until guess is correct.
      Uses iteration.
      pre:  
      post: 
      ==================================================*/
    public void playIter() 
    {
	boolean win = false;
	int counter = 0;
	while (!win) {
	    counter += 1;
	    System.out.println("Please enter a guess between "
			       + _lo + " and " + _hi);
	    int guess = Keyboard.readInt();
	    System.out.println("target = " + _target);
	    if (guess == _target) {
		win = true;
		System.out.println("You won");
	    }
	    else if (guess <= _target) {
		System.out.println("Your guess was too low");
		System.out.println("Number of tries: " + counter);
	    } else {
		System.out.println("Your guess was too high.");
		System.out.println("Number of tries: " + counter);
	    }
	}
    }


    //wrapper for playRec/playIter to simplify calling
    public void play() 
    { 
	//use one or the other below:
	//playRec();
	playIter();
    }


    //main method to run it all
    public static void main( String[] args ) 
    {
	
	//instantiate a new game
	GuessNumber g = new GuessNumber(1,100);
	//start the game
	g.play();
	
    }//end main

}//end class

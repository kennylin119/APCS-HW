/******************************
 Kenny Lin
 APCS1 pd 1
 HW #38: Put It Together 
 2017-11-20
******************************/

import cs1.Keyboard;
import java.util.Scanner;

public class Swapper
{
    public static void main (String[] args)
    {
	System.out.println("");
	System.out.println("This is the array:");
	String[] array = {"hello ", "it's me ", "I was wondering ", "if after ", "all these years ", "you'll like ", "to meet "};
	System.out.println( toString( array ) );

	System.out.println("");
	System.out.println("Which array places would you like to switch?");
	Scanner user_input = new Scanner( System.in ); //user input of places to switch
	
	System.out.println("First postion:");
	int placeOne = user_input.nextInt();
	//System.out.println(placeOne);
	
	System.out.println("Second position:");
	int placeTwo = user_input.nextInt();
	//System.out.println(placeTwo);
	
	System.out.println("");
	System.out.println("Translation");
	System.out.println( toString( swap(array, placeOne, placeTwo) ) );
    }
    public static String[] swap (String[] array, int a, int b)
    {
	String valueOne = array[a];
	//String valueTwo = array[b]; this didn't work for some reason
	array[a] = array[b];
	array[b] = valueOne;
	return array;
    }
    public static String toString(String[] array)
    {
	String transArray = "";
	for (String i : array)
	    {
		transArray += i
		    + " | "; //inserts blocks between array places
	    }
	return transArray; //translated array
    }
}

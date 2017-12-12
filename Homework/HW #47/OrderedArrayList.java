//Kenny Lin
//APCS1 pd8
//HW #47 Ascending
//2017-12-6

import java.util.Collections;
public class OrderedArrayList  {

    public static void main(String args[]){
	ArrayList<Integer> arraylist = new ArrayList<Integer>();
	arraylist.add(2);
	arraylist.add(3);
	arraylist.add(1);
	   
	for(int counter: arraylist){
	    System.out.println(counter);
	}
	Collections.sort(arraylist);
	for(int counter: arraylist){
	    System.out.println(counter);
	}
    }
}

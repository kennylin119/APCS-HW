//Kenny Lin
//APCS1 pd 8
//HW #50: Dat Bubbly Tho
//2017-12-10

public class BubbleSort {
    public static void main (String[] args) {
	int array[] = {2,14,1,4,89,45,97}; //random integers in array
	System.out.println(toString(sort(array)));
    }
    public static int[] sort (int[] arr) {
	for (int i = 0; i < arr.length; i++) {
	    for (int x = 1; x < arr.length - 1; x++) {
		if (arr[x-1] > arr[x]) { //only switches if values out of order
		    int temp = arr[x-1]; //temp placeholder
		    arr[x-1] = arr[x]; //switches first value with second
		    arr[x] = temp; //switches second with first via placeholder
		}
	    }
	} return arr;
    }
    public static String toString (int[] arr) {
	//classic to String method
	String string = "";
	for (int i = 0; i < arr.length; i++) {
	    string += arr[i] + " "; //leaves spaces between ints
	} return string;
    }
    
}

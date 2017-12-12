//Kenny Lin
//APCS PD 8
//HW #17: Do I repeat myself?
//2017-10-17

public class Repeater {
    public static void main (String[] args) {
	System.out.println("Test recursive");
	System.out.println(fenceR(1));
	System.out.println(fenceR(2));
	System.out.println(fenceR(3));
	System.out.println("Test while loop");
      	System.out.println(fenceW(1));
	System.out.println(fenceW(2));
	System.out.println(fenceW(3));
    }
    public static String fenceR (int numPosts) {
        if (numPosts == 1){
	    return "|";
	}
	return "|--" + fenceR(numPosts - 1);
    }
    public static String fenceW (int numPosts){
	String fence = "";
	    while (numPosts > 1) {
		fence += "|--";
		numPosts -= 1;
	    }
	fence += "|";
	return fence;
    }
}

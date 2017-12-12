// Kenny Lin
// APCS1 pd8
// HW #19: gcd 3 ways  
// 2017 - 10 - 19

//This stats class code is not mine. It is borrowed from Jason Kim of first period who was kind enough to post his code on the QAF. However the gcd homework portion was made by me and my partner. 

public class Stats {

    public static int mean (int a, int b) { //mean with 2 int. 
	return (int) (a + b)/2; //returns an int
    }

    public static double mean (double a, double b) { //mean with 2 double.
	return (double) (a + b)/2; //returns s double
    }

    public static int max (int a, int b) { //gets max of 2 int.
	if (a > b) { //conditional
	    return a; //if a is max
	}
	return b; //if b is max
    }

    public static double max (double a, double b) { //gets max of 2 double.
	if (a > b) { //conditional
	    return a; //if a is max
	}
	return b; //if b is max
    }

    public static int max (int a, int b, int c) { //gets max of 3 int.
	return max(max(a,b),c);
    }

    public static double max (double a, double b, double c) { //gets max of 3 double.
	return max(max(a,b),c);
    }

    public static int geoMean(int a, int b, int c) { //gets geoMean of 3 int.
	double x = (double) 1.0/3.0;
	return (int)  Math.pow(a*b*c, x);
    }

    public static double geoMean (double a, double b, double c) { //gets geoMean of 3 double. 
	double x = (double) 1.0/3.0;
	return Math.pow(a*b*c, x); 
    }

    public static int geoMean (int a, int b) { //gets geometric mean of 2 int.
	return (int) Math.sqrt(a * b); //uses the imported Math.sqrt method. returns an int.
    }

    public static double geoMean (double a, double b) { //gets geometric mean of 2 double.
	return (double) Math.sqrt(a * b); //uses the imported Math.sqrt method. returns a double.
    }

    public static void main (String [] args) { //testing the methods
	System.out.println("===== Mean Methods ====================");
	// expected 28 and 28.5
	System.out.println(mean(27, 30));
	System.out.println(mean(27.0, 30.0));
	System.out.println("===== Max Methods =====================");
	// expected 29, 465.112, 53, 3772.3
	System.out.println(max(29, 12));
	System.out.println(max(187.24, 465.112));
	System.out.println(max(53,23,12));
	System.out.println(max(14.2, 482.2, 3772.3));
	System.out.println("===== GeoMean Methods =================");
	//expected 64, 64.0, 2, 5.0 (but instead of 5.0, I got 4.999999999999999, hmm)
	System.out.println(geoMean(64,64));
	System.out.println(geoMean(125.0, 32.768));
	System.out.println(geoMean(1,2,4));
	System.out.println(geoMean(1.0, 5.0, 25.0));
	System.out.println("===== GeoMean Methods =================");
	System.out.println(gcd(15, 25)); //5    
	System.out.println(gcdER(15, 25)); //5    
	System.out.println(gedEW(15, 25)); //5
    }
	
    public static int gcd (int a, int b){
	int counter;
	if (a > b) {
	    counter = b;
	} else {
	    counter = a; 
	}
	System.out.println( counter);
	while (counter >= 1){
	    if (a % counter == 0 && b % counter == 0 ){
		return counter;
	    } else {
		counter -= 1;
	    }
	}
	return 0;
    }

    public static int gcdER (int a, int b){
	if (a == 0){
	    return b;
	} else if (b == 0){
	    return a;
	} else if (a >= b){
	    return gcdER(a % b, b);
	} else {
	    return gcdER(a, b % a);
	}
    }
    public static int gedEW (int a, int b){
	while (a != 0 && b != 0) {
	    int nextNum = b;
	    b = a % b;
	    a = nextNum;
	}
	return a + b;
    }
}

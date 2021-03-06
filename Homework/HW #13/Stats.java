//Kenny Lin
//CS1 pd 8
//HW12 -- stAtistically sPeaking
//2017-10-5

public  class Stats {
    public static void main (String[] args){
	System.out.println("Int mean test, should equal 5");
	System.out.println(mean(3, 7));
	System.out.println("Double mean test, should equal 2.0");
	System.out.println(mean(1.5, 2.5));
	System.out.println("Int max test, should equal 5");
	System.out.println(max(3,5));
       	System.out.println("triple Int max test, should equal 7");
	System.out.println(max(3, 5, 7));
       	System.out.println(" Double max test, should equal 5.2");
	System.out.println(max(3.53 ,5.2));
	System.out.println("triple Double max test, should equal 9.43");
	System.out.println(max(3.53 ,5.2, 9.43));
	System.out.println("Int geoMean test, should equal 5");
       	System.out.println(geoMean(5,5));
	System.out.println("Double geoMean test, should equal 7.0");
       	System.out.println(geoMean(1,49)); 
	System.out.println("triple Double geoMean test, should equal 8.19321");
       	System.out.println(geoMean(5,10,11));
    }
    public static int mean (int a, int b){
        int total =  a + b;
        int mean = total / 2 ;
        return mean;
    }
    public static double mean (double a, double b){
        double total =  a + b;
        double mean = total / 2 ;
        return mean;
    }
    public static int mean (int a, int b, int c){
        int total =  a + b + c;
        int mean = total / 3;
        return mean;
    }
    public static int max (int a, int b){
	int sum = a + b;
	int difference = a - b;
	int absDiff = java.lang.Math.abs(difference); //I found this absolute value method on stack overflow... Sorry!
	int total = sum + absDiff;
	int max = total / 2;
	return max;
    }
    public static int max (int a, int b, int c){
        int maxTwo = max(a,b);
	int max = max(maxTwo, c);
	return max;
    }
    public static double max (double a, double b){
        if (a > b) {
	    return a;
	} else {
	    return b;
		}
    }
    public static double max (double a, double b, double c){
        double maxTwo = max(a,b);
	double max = max(maxTwo, c);
	return max;
    }
    /* public static int geoMean (int a, int b){
	int product = a * b;
	int geoMean = Math.sqrt(product);
	return geoMean;
	}*/
    public static double geoMean (double a, double b){
	double product = a * b;
	double geoMean = Math.sqrt(product);
	return geoMean;
	}
    /*        public static int geoMean (int a, int b){
	int product = a * b;
	int geoMean = Math.sqrt(product);
	return geoMean;
	}*/
    public static double geoMean (double a, double b, double c){
	double product = a * b *c;
	double geoMean = java.lang.Math.cbrt(product);
	return geoMean;
	}
    /*    public static int geoMean (int a, int b, int c){
	int product = a * b * c;
        int geoMean = java.lang.Math.cbrt(product);
	return geoMean;
	}*/
}


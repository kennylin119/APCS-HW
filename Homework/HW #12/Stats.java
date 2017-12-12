//Kenny Lin
//CS1 pd 8
//HW12 -- stAtistically sPeaking
//2017-10-5

public  class Stats {
    public static void main (String[] args){
	//I just returned everything as doubles
	System.out.println("Int mean test, should equal 5");
	System.out.println(mean(3, 7));
	System.out.println("Double mean test, should equal 2.0");
	System.out.println(mean(1.5, 2.5));
	System.out.println("Int max test, should equal 5");
	System.out.println(max(3,5));
	System.out.println("Double max test, should equal 5.2");
	System.out.println(max(3.53,5.2));
	System.out.println("Int geoMean test, should equal 5");
	System.out.println(geoMean(5,5));
	System.out.println("Double geoMean test, should equal 7.0");
	System.out.println(geoMean(1,49));
    }
    public static double mean (double a, double b){
        double total =  a + b;
        double mean = total / 2 ;
        return mean;
    }
    public static double max (double a, double b){
	double sum = a + b;
	double difference = a - b;
	double absDiff = java.lang.Math.abs(difference); //I found this absolute value method on stack overflow... Sorry!
	double total = sum + absDiff;
	double max = .5 * total;
	return max;
    }
    public static double geoMean (double a, double b){
	double product = a * b;
	double geoMean = Math.sqrt(product);
	return geoMean;
    }
}

/******************************
 Kenny Lin
 APCS1 pd 1
 HW #37: Be More Rational
 2017-11-20
******************************/
public class Rational
{
    //   Instance variables for the numerator and denominator
    private int _numerator;
    private int _denominator;


    // Default constructor (no parameters)
    // creates a new Rational with the value of 0/1
    public Rational()
    {
	_numerator = 0;
	_denominator = 1;
    }


    // Constructor
    // takes 2 parameters, one for the numerator, one for the denominator
    // if an invalid denominator is attempted, should print a message and set the number to 0/1
    public Rational( int n, int d )
    {
	this();
	if ( d != 0 ) {
	    _numerator = n;
	    _denominator = d;
	}
	else {
	    System.out.println( "Invalid number. " +
				"Denominator set to 1." );
	}
    }


    // toString
    // returns a string representation of the rational number (formatting of your choice)
    public String toString()
    {
	return _numerator + " / " + _denominator;
    }


    // floatValue
    // returns floating point approximation of the number
    // uses the most precise floating point primitive
    public double floatValue()
    {
	return (double)_numerator / _denominator;
    }


    // multiply
    // takes 1 Rational object as a parameter and multiplies it by this Rational object
    // does not return any value
    // should modify this object and leave the parameter alone (see below for example)
    // need not reduce the fraction
    public void multiply( Rational r )
    {
	_numerator   = this._numerator   * r._numerator;
	_denominator = this._denominator * r._denominator;
    }


    // divide
    // works the same as multiply, except the operation is division
    public void divide( Rational r )
    {
	if ( r._numerator != 0 ) {
	    _numerator   = _numerator   * r._denominator;
	    _denominator = _denominator * r._numerator;
	}
	else {
	    System.out.println( "Div by 0 error. Values unchanged." );
	}
    }

    //This code was taken from the QAF, originally posted by Raunak Chowdhury 
    
    public static int gcd ( int a, int b){ // Does a recursive algorithm of GCD
        if (a % b == 0) {
	    return b;
        }
        return gcd( b, a%b);
    }

    public Rational add(Rational b) {
        Rational a = this;
        int f = gcd(a._numerator, b._numerator);
        int g = gcd(a._denominator, b._denominator);
        Rational s = new Rational((a._numerator / f) * (b._denominator / g)
				  + (b._numerator / f) * (a._denominator / g),
                                  gcd(a._denominator, b._denominator));

        // multiply back in
        s._numerator *= f;
        return s;
    }
    
    // return negative value
    public Rational negate() {
        return new Rational(_numerator, -_denominator);
    }
    
    public Rational reduce(Rational b) {
        Rational a = this;
        return a.add(b.negate());
    }


    //main method for testing
    public static void main(String[] args)
    {
	Rational r = new Rational( 3, 7 );
	Rational s = new Rational();
	Rational t = new Rational( 8, 5 );

	Rational u = new Rational( 1, 2 );
	Rational v = new Rational( 2, 3 );
	Rational w = new Rational( 8, 12 );

	System.out.println("r: " + r );
	System.out.println("s: " +  s );
	System.out.println("t: " +  t );

	System.out.println( r + " represented as a floating pt num: "
			    + r.floatValue() );

	System.out.print( r + " * " + t + " = ");
	r.multiply(t);
	System.out.println(r);

	System.out.print( r + " / " + t + " = ");
	r.divide(t);
	System.out.println(r);

	r.add(s);  //Adds r to s, changes r to 7/6.  s remains 1/2
	t.reduce(); //Changes t to 2/9
    }
}//end class

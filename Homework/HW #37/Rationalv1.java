//Kenny Lin
//APCS1 Pd 8
//HW #36 -- Be Rational
//2017-11-20

public class Rational
{

    private int _num; //numerator
    private int _den; //denominator
    private Rational zero = new Rational (0,1); 
    public Rational()
    {
	_num = 0;
	_den = 1;
    }
    public Rational(int n, int d)
    {
        this();
	    if ( d != 0 ) {
		_num = n;
		_den = d;
	    }
	    else {
		System.out.println( "Invalid number. " +
				    "Denominator set to 1." );
	    }
    }
    public double floatValue() //returns floating point app. of number
    {
	return (double) _num / _den;
    }
    public String toString() //converts rational into a string format
    {
	return _num + " / " + _den;
    }

    public void multiply( Rational r )
    {
	_num   = this._num   * r._num;
	_den = this._den * r._den;
    }

      public void divide( Rational r )
  {
    if ( r.__num != 0 ) {
      __num   = __num   * r.__den;
      __den = __den * r.__num;
    }
    else {
      System.out.println( "Div by 0 error. Values unchanged." );
    }
  }

    public static void main (String[] args)
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
    }
}

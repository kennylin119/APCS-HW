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
	_den = 0;
    }
    public Rational(int n, int d)
    {
	Rational zero = new Rational(0,1);
	if (_den == 0) //prevent impossible rationals
	    { 
		throw new ArithmeticException("You cannot divide by 0.");       	}
	_num = n;
	_den = d;
    }
    public double floatValue() //returns floating point app. of number
    {
	return (double) _num / _den;
    }
    public String toString() //converts rational into a string format
    {
	return _num + " / " + _den;
    }
    public static void main (String[] args)
    {
	Rational r = new Rational(2,3);
	Rational s = new Rational(1,2);
	System.out.println(r);
	System.out.println(s);
    }
}

/**
 * Created by Comarch on 2016-07-21.
 */
public class Rational {
    int numerator;
    int denominator;

    /*
     * Setters and getters
     */
    public int getNumerator(){
        return this.numerator;
    }

    public int getDenominator(){
        return this.denominator;
    }

    public void setNumerator(int numerator){
        this.numerator = numerator;
    }

    public void setDenominator(int denominator){
        this.denominator = denominator;
    }

    /*
     * Construct rational object with default values
     */
    public Rational(){
        this.numerator = 0;
        this.denominator = 1;
    }

    /*
     * Construct rational object with input values
     */
    public Rational(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

    /*
     * Print value in user-friendly format
     */
    public void printRational(Rational rational){
        System.out.println(rational.numerator + "/" + rational.denominator);
    }

    /*
     * returns string with values of object
     */
    public String toString() {
        return "numerator = " + this.numerator + "; denominator = " + this.denominator;
    }

    /*
     * Changes sign of rational number
     */
    public void negate(){
        this.numerator *= -1;
    }

    /*
     * Swaps numerator with denominator
     */
    public void swap(){
        int tmp = this.numerator;
        this.numerator = this.denominator;
        this.denominator = tmp;
    }

    /*
     * Converts rational number to double
     */
    public double toDouble(Rational that){
        double tmp = (double) that.denominator;
        return that.numerator / tmp;
    }

    /*
     * Returns greatest common divisor with Euclidean algorhitm
     */
    private static int findGCD(int numerator, int denominator){
        if(numerator - denominator == 0){
            return numerator;
        } else if(numerator - denominator > 0){
            return findGCD(numerator-denominator, denominator);
        } else{
            return findGCD(numerator,denominator-numerator);
        }
    }

    /*
     * Reduces rational number to its lowest term
     */
    public static Rational reduce(Rational number){
        Rational result = new Rational(number.getNumerator(),number.getDenominator());
        int gcd = findGCD(number.numerator, number.denominator);
        result.setNumerator(result.getNumerator()/gcd);
        result.setDenominator(result.getDenominator()/gcd);
        return result;
    }

    /*
    * Adds input rational number to this object
     */
    public void add(Rational that){
        this.numerator += that.getNumerator();
        this.denominator += that.getDenominator();
        Rational tmp = reduce(this);
        this.numerator = tmp.getNumerator();
        this.denominator = tmp.getDenominator();
    }

}

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
     * Returns rest from dividing 2 numbers when this rest is smaller than divider
     */
    private static int divide(int number, int divider){
        int result = number;
        int i = 1;
        while(result > divider){
            result = number % (i*divider);
        }
        return result;
    }

    /*
     * Returns greatest common divisor with Euclidean algorhitm
     */
    private static int findGCD(int numerator, int denominator){
        int rest = 1;
        while(rest != 0){
            rest = divide(numerator, denominator);
            numerator = denominator;
            denominator = rest;
        }
        return denominator;
    }

    /*
     * Reduces rational number to its lowest term
     */
    public Rational reduce(Rational number){
        Rational result = new Rational();
        int gcd = findGCD(number.numerator, number.denominator);
        result.setNumerator(result.getNumerator()/gcd);
        result.setDenominator(result.getDenominator()/gcd);
        return result;
    }

}

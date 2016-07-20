/**
 * Created by Comarch on 2016-07-19.
 */
import java.math.BigInteger;

public class Big {

    public static BigInteger bigIntegerFactorial(int base){
        BigInteger result = BigInteger.valueOf(1);
        for(int i=base; i>0; i--){
            BigInteger tmp = BigInteger.valueOf(i);
            result = result.multiply(tmp);
        }
        return result;
    }

    public static void main(String[] args){

        for (int i=0; i<31; i++){
            System.out.print("\nResult for " + i + " = " + bigIntegerFactorial(i));
        }


        // Test of mutability
        /*
        BigInteger big1 = BigInteger.valueOf(3);
        BigInteger big2 = big1;
        big1 = BigInteger.valueOf(99);
        System.out.print("Big 1 = " + big1);
        System.out.print("\nBig 2 = " + big2);
        */

        // Test of Big Integer class
        /*
        int x = 34;
        int y = 123456789;

        BigInteger big1 = BigInteger.valueOf(x);
        BigInteger big2 = BigInteger.valueOf(y);

        BigInteger add = big2.add(big1);
        BigInteger multiply = big2.multiply(big1);
        BigInteger pow = big1.pow(3);

        System.out.print("Add = " + add);
        System.out.print("\nMultiply = " + multiply);
        System.out.print("\nPower = " + pow);
        */
    }
}

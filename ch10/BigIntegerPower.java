import java.math.BigInteger;

/**
 * Created by Comarch on 2016-07-19.
 */
public class BigIntegerPower {
    public static BigInteger pow(int x, int n){
        if(n==0){
            return BigInteger.valueOf(1);
        }
        BigInteger t = pow(x, n/2);

        if(n%2 == 0){
            return t.multiply(t);
        } else{
            BigInteger result = t.multiply(t);
            for(int i=0; i<x-1; i++){
                result = result.add(result);
            }
            return result;
        }
    }

    public static void main(String[] args){
        System.out.print("Result = " + pow(2,5));
    }
}

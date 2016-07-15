/**
 * Created by Comarch on 2016-07-15.
 */
public class ForDebugging {

    public static boolean isPrime(int number) {
        int numberOfDividers = 0;
        for (int i = 2; i < number; i++) {
            if ((number % i) == 0) {
                numberOfDividers++;
            }
        }
        return (numberOfDividers == 0);  // Every prime number has only 2 dividers: 1 and itself, and loop is conting from 2 to n-1
    }

    public static void main(String[] args){
        boolean result = isPrime(7);
        System.out.print("Output: " + result);
    }

}

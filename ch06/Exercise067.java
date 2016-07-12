import java.util.Scanner;

/**
 * Created by media on 2016-07-05.
 */
public class Exercise067 {

    public static boolean isPositiveAndOdd(int checkedNumber){
        if(checkedNumber < 0){
            System.out.print("Input number is less than 0");
            return false;
        } else if(checkedNumber%2 == 0){
            System.out.print("Input number is even");
            return false;
        } else {
            return true;
        }
    }

    public static int oddSum(int maxComponent){
        if(maxComponent == 1){
            return 1;
        } else{
            return maxComponent + oddSum(maxComponent-2);
        }
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int userNumber = 0;
        int sum = 1;
        int component =1;

        while (!isPositiveAndOdd(userNumber)){
            System.out.print("\nWrite maximal number: ");
            userNumber = in.nextInt();
        }

        System.out.printf("\nYou selected: %d", userNumber);
        int answer = oddSum(userNumber);
        System.out.printf("\nYour answer is: %d", answer);
    }
}

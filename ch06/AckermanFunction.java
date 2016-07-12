import java.util.Scanner;

/**
 * Created by media on 2016-07-07.
 */
public class AckermanFunction {

    public static int selectNumber(String parametername){
        Scanner in = new Scanner(System.in);
        System.out.println("Write number " + parametername + ": ");
        return in.nextInt();
    }

    public static int ack(int m, int n){
        if(m == 0){
            return n+1;
        } else if(m>0 && n==0){
            return ack(m-1,1);
        } else if(m>0 && n>0){
            return ack(m-1,ack(m,n-1));
        } else{
            System.out.println("Wrong input numbers, cannot calculate answer!");
            return 0;
        }
    }

    public static void main (String[] args){
        int usernumber1 = selectNumber("n");
        int usernumber2 = selectNumber("m");
        /*
        System.out.printf("\nun1: %d", usernumber1);
        System.out.printf("\nun2: %d", usernumber2);
        */
        int answer = ack(usernumber1,usernumber2);
        System.out.printf("\nYour answer is: %d", answer);
    }
}

import java.util.Random;
import java.util.Scanner;

/**
 * Created by media on 2016-07-10.
 */
public class MyHistogram {

    public static int readInput(String paramname){
        Scanner in = new Scanner(System.in);
        boolean okay;
        do{
            System.out.print("Write " + paramname);
            if(in.hasNextInt()){
                okay = true;
            }else {
                okay = false;
                System.err.println("Wrong input value!");
            }
        }while (!okay);
        return in.nextInt();
    }

    /*
    * returns array of random integers with minimal value 1
     */
    public static int[] randomArray(int size){
        Random random = new Random();
        int[] initializedarray = new int[size];
        for(int i=0; i<initializedarray.length; i++){
            initializedarray[i] = random.nextInt(10);
        }
        return initializedarray;
    }

    /*
    * returns number of range, puts input value to one from input number of rangess
     */
    public static int[][] calculateRanges(int noOfRanges, int elements){
        int elementsInRange = (int) elements/noOfRanges;
        int ranges[][] = new int[noOfRanges][elementsInRange];
        for(int row=0; row<noOfRanges; row++){
            for(int col=0; col<elementsInRange; col++){
                ranges[row][col] = row*elementsInRange + col;
            }
        }
        return ranges;
    }

    /*
    * checks if input element is in array
     */
    public static boolean inRange(int[] row, int element){
        boolean okay = false;
        for(int i=0; i<row.length; i++){
            if(element == row[i]){
                okay = true;
                break;
            }
        }
        return okay;
    }

    /*
    * selects range which conbtains input element
     */
    public static int selectRange(int element, int[][] ranges){
        int row = 0;
        int selectedRange = 0;
        while (row<ranges[0].length){
            if(inRange(ranges[row], element)){
                selectedRange = row;
                break;
            }
            row++;
        }
        return selectedRange;
    }

    /*
    * displays histogram with values of input array in number of ranges set by second input
     */
    public static void histogram(int[] array, int counters){
        int[] histogram = new int[counters];
        int[][] ranges = calculateRanges(counters,array.length);
        for(int score=0; score<array.length; score++){
            int tmp_range = selectRange(array[score],ranges);
            histogram[tmp_range]++;
        }
        for(int i=0; i<histogram.length; i++){
            System.out.printf("\nValue: %d has %d elements",i,histogram[i]);
        }
    }

    public static void main(String[] args){
        int[] scores = randomArray(10);
        int noofcounters = readInput("number of counters: ");
        histogram(scores,noofcounters);
    }
}

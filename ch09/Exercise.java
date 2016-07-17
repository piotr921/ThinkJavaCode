/**
 * Exercise on encapsulation and generalization.
 */
public class Exercise {

    public static int numberOfParentheses(String input){
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            count += openAndClose('(',')',c);
        }
        return count;
    }

    /*
    * This function returns different values when input char is equal to open or close char
     */
    public static int openAndClose(char open, char close, char input){
        if(input == open){
            return 1;
        } else if(input == close){
            return -1;
        } else{
            return 0;
        }
    }

    public static void main(String[] args) {
        String s = "((3 + 7) * 2)((";
        int count = numberOfParentheses(s);
        System.out.println(count);
    }

}

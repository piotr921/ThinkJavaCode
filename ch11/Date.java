/**
 * Created by Comarch on 2016-07-21.
 */
public class Date {
    private int year;
    private int month;
    private int day;

    /*
    * Constructor without parameters
     */
    public Date(){
        this.year = 2001;
        this.month = 1;
        this.day = 1;
    }

    /*
    * Constructor with parameters
     */
    public Date(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    /*
    *
     */
    public String toString(){
        return this.day + "." + this.month + "." + this.year;
    }
}

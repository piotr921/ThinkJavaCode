/**
 * Created by media on 2016-07-20.
 */
public class Scrabble {

    private char letter;
    private int value;

    /*
    * Getters and setters
     */
    public char getLetter(){
        return this.letter;
    }

    public int getValue(){
        return this.value;
    }

    public void setLetter(char letter){
        this.letter = letter;
    }

    public void setValue(int value){
        this.value = value;
    }

    /*
    * Constructor with parameters
     */
    public Scrabble(char letter, int value){
        this.letter = letter;
        this. value = value;
    }

    /*
    * Prints letter and it's value
     */
    public void printTile(Scrabble Tile){
        System.out.print("\nLetter: " + Tile.letter + " has value; " + Tile.value);
    }

    /*
    * Method for testing objects
     */
    public void testTile(){
        Scrabble tile = new Scrabble('z',10);
        printTile(tile);
    }

    /*
    * Overriding method toString
     */
    public String toString(){
        return String.format(this.letter + ": " + "%02d", this.value);
    }

    /*
    * returns TRUE when input tiles has the same valuies of fields
     */
    public boolean equals(Scrabble tile1, Scrabble tile2){
        return (tile1.letter == tile2.letter) && (tile1.value == tile2.value);
    }
}

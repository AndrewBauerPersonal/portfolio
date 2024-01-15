/*
 *
 *
 */



import java.util.*;

public class Lab04 {

public static void main(String[] args) {
    // declaring variables
    String sentence;
    String word;

    // initiating the scanner
    Scanner keyboard = new Scanner(System.in);

    // prompting the user for a sentence

    System.out.println("Please enter the sentence: ");
    sentence = keyboard.nextLine();
    System.out.println("Your input was: " + '"' + sentence + '"');

    // checking if it is an alliteration
    sentence = sentence.toLowerCase();
    Scanner stringScan1 = new Scanner(sentence);

    stringScan1.useDelimiter("[ \t\n,.-:;'?!\"]+");

    char firstChar = sentence.charAt(0);
    boolean isAlliteration = true;
    while ( stringScan1.hasNext() ) {
        word = stringScan1.next();
        if (firstChar != word.charAt(0) && word.length() > 3)
            isAlliteration = false;
    }

    if (isAlliteration)
        System.out.println("This is an alliteration.");
    else
        System.out.println("This is not an alliteration.");
}
}

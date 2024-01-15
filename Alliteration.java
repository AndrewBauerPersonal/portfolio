/*
Name: Andrew Bauer
 Assignment: 04
 Title: Alliteration.java
 Course: CS 144
 Class section: 01
 Lab Section: 01
 Semester: Spring 2020
 Instructor: Renzhi Cao
 Date: 3/19/20
 Sources consulted: N/A
 Known Bugs: N/A
 Program description: Detect an alliteration
 Creativity: Check number of words and average word length.
 Instructions: Java Alliteration
*/
import java.util.Scanner;

public class Alliteration
{
  public static void main(String[] args)
  {
    boolean alliteration = true;
    String inputString;
    char firstLetter;
    String word;
    int numWords = 0;
    int totalWordLength;
    int avgWordLength = 0;

    Scanner input = new Scanner(System.in);


    // ask for input string
    System.out.println("ALLITERATION DETECTOR");
    System.out.print("Enter a string to check for alliteration: ");
    inputString = input.nextLine();

    Scanner stringScan = new Scanner(inputString.toLowerCase());

    //Loop the string and compare the first letter of each word
    //to the first letter of the first word.
    while(stringScan.hasNext())
    {
      word = stringScan.next();
      numWords++;
      firstLetter = inputString.toLowerCase().charAt(0);
      if(word.length() > 3 && firstLetter != word.charAt(0))
      {
        alliteration = false;
      }
      totalWordLength = numWords * word.length();
      avgWordLength = totalWordLength / numWords;
    }
    // conditional messages
    if(alliteration)
    {
      System.out.println("The string entered is an alliteration. ");
    }
    else
    {
      System.out.println("The string entered is NOT an alliteration. ");
    }

    System.out.println("The string has " + numWords + " words.");
    System.out.println("The average word length is " + avgWordLength + ".");
  }
}

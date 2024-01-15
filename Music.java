/*
**
Name: Andrew Bauer
Assignment: 06
Title: Music
Course: CS 144
Class section: 01
Lab Section: 03
Semester: Fall 2019
Instructor: Kenneth Blaha
Date: 11-5-19
Sources consulted: Java book
Known Bugs: The program is still in the process of being developed and it does
not display duration but it calculates it from startOfFadeOut and
endOfFadeIn. Also a WIP still is converting the format of that output to days,
minutes, hours, and seconds.
Program description: The intent of the program is to display separated columns
with their respective description.
Creativity: None.
Instructions: java Music
*/

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class Music {

  // Method header
  public static void main(String [] args) throws IOException{

    // Variable declarations
    String id;
    String artistName;
    String title;
    String releaseName;
    int year;
    double endOfFadeIn = 0;
    double startOfFadeOut = 0;
    double loudness = 0;
    double duration = 0;

    // Scanner to read input from the user
    Scanner keyboard = new Scanner(System.in);

    // Scanner to read in the file that the user types.
    System.out.print("Enter the name of the file: ");
    String filename = keyboard.nextLine();
    File inFile = new File(filename);
    Scanner fileScan = new Scanner(inFile);
    fileScan.useDelimiter(",|\\r?\\n");

    fileScan.nextLine();
    //while there is more data in the file
		// read data for one student, compute average, print result
	/*	System.out.printf("%-30s %-30s %-30s %-30s %-30s %-30s %-30s %-30s"
    , " ID" , " Artist Name" , " Title" , " Release Name" , " End of fade in" ,
     " End of Fade out" , " Loudness" , " Duration");
*/
    // Read from file using Scanner
    while(fileScan.hasNext()) {
      id = fileScan.next();
      id = formatID(id);
      System.out.println(id);
      artistName = fileScan.next();
      artistName = truncate(artistName);
      //System.out.println(artistName);
      title = fileScan.next();
      title = truncate(title);
      //System.out.println(title);
      releaseName = fileScan.next();
      releaseName = truncate(releaseName);
      //System.out.println(releaseName);
      year = fileScan.nextInt();
      //System.out.println(year);
      endOfFadeIn = fileScan.nextDouble();
      //System.out.println(endOfFadeIn);
      startOfFadeOut = fileScan.nextDouble();
      //System.out.println(startOfFadeOut);
      loudness = fileScan.nextDouble();
      //System.out.println(loudness);
      System.out.printf("%-30s %-30s %-30s %-30s %.3f \t\t%.3f \t\t%.3f \t\t%.3f ", id,
      artistName, title, releaseName, endOfFadeIn, startOfFadeOut ,
      loudness, duration);
    }

  }// end main

  public static String formatID(String id) {
    String formattedid;
    formattedid = id.substring(0,7) + "-" + id.substring(7,9) + "-" + id.substring(9,18);
    return formattedid;
  }//end formatID

  public static String truncate(String str){
    if (str.length() > 20)
    {
      return str.substring(0, 20-3) + "...";
    }
    else
    {
      return str;
    }
  }//end truncateStr
}//end class

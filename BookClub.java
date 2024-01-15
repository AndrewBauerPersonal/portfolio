/*
// Name: Andrew Bauer
   Class section: 1
   Was not completely sure how to perform separate calculations with Express
   shipping but standard shipping seems to work fine.
*/

import java.util.Scanner;

public class BookClub {
    // Method Header
  public static void main(String[] args) {
    // Declared variables
    int numBooks = 0;
    final double baseCost = 3.00;
    String member;
    String shippingType = "Express";

    // Read user input and welcome to the Book Store.
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Welcome to Serendipity Books!");
    System.out.print("Are you a book club member(Y/N): ");
    member = keyboard.nextLine();
    System.out.print("Shipping type(Standard or Express): ");
    shippingType = keyboard.nextLine();
    System.out.print("How many books would you like to order?: ");
    numBooks = keyboard.nextInt();


// Calculate the cost based on the number of books with standard shipping.
    if(numBooks <= 3) {
       System.out.println("The cost is $" + (baseCost + numBooks * 0.99));
       System.out.println("Number of points earned: " + (numBooks * 8));
    }
    else if(numBooks > 3 && numBooks <= 8) {
      System.out.println("The cost is $" + (baseCost + numBooks * 0.75));
      System.out.println("Number of points earned: " + (numBooks * 8));
    }
    else if(numBooks > 8 && numBooks <= 20) {
      System.out.println("The cost is $" + (baseCost + numBooks * 0.50));
      System.out.println("Number of points earned: " + (numBooks * 8));
    }
    else if(numBooks > 20) {
      System.out.println("The cost is $" + (baseCost + numBooks * 0.20));
      System.out.println("Number of points earned: " + (numBooks * 8));
    }
  }
}

/*
 // This program is intended to calculate a person's BMI.
Name: Andrew Bauer
Assignment: Lab 1
Title: BMI Calculator
Course: CS 144
Class section: 01
Lab Section: 03
Semester: Fall 2019
Instructor: Kenneth Blaha
Date: 9-19-19
Sources consulted: Starting out with Java book + Java Tutorials.
Known Bugs: The program seems to function as intended.
Program description: The program uses a person's weight and height to generate
BMI.
Creativity: Tell the user if they are underweight/overweight/healthy.
Instructions: To run the program simply type "java BMICalculation".
 */



import java.util.Scanner;

public class BMICalculation {
    // Declarations of variables and method of calculation.
    public static double calculate(int weight, int height) {
        weight = (weight * 703);
        height = height * height;
        return weight / height;
    }
    //Prompt the user to input their height + weight and perform the calculation
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter your height in inches: ");
        int height = keyboard.nextInt();
        System.out.print("Please enter your weight in pounds: ");
        int weight = keyboard.nextInt();
        double BMICalculation = calculate(weight, height);
        //Display BMI Result
        System.out.println("Your BMI is " + BMICalculation);
        //Tell the user the status of their weight based on their BMI.
        if(BMICalculation <= 18.5) {
          System.out.println("\nYour BMI indicates that you are underweight.");
        }
        else if (BMICalculation > 30) {
          System.out.println("\nYour BMI Indicates that you are overweight.");
        }
        else {
          System.out.println("\nYour BMI is considered a normal weight.");
        }
    }
}

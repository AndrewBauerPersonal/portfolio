import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Lab0 {

	/*
	 * Main method to read the file from the user and populate an array.
	 */
	public static void main(String[] args) throws FileNotFoundException {


		// Scanner object for keyboard input
		Scanner keyboard = new Scanner(System.in);

		// Get the file name from the user
		System.out.print("Enter the name of the file to read: ");
		String namefile = keyboard.nextLine();

		// Instantiate and open the file using Scanner
		File inputFile = new File(namefile);
		Scanner fileScan = new Scanner(inputFile);

		int numNames = fileScan.nextInt();
		fileScan.nextLine();
		String[] names = new String[numNames];


		for(int i = 0; i<numNames; i++) {
			names[i] = fileScan.nextLine();
			System.out.println(names[i]);
		}


		//get the file name
		System.out.print("Enter the name of the score file: ");
		String fileScores = keyboard.nextLine();

		//open the file with the scanner
		File scoreFile = new File(fileScores);
		Scanner scanFile = new Scanner(scoreFile);

		int numRows = scanFile.nextInt();
		int numCol = scanFile.nextInt();
		int[][] scores = new int[numRows][numCol];

		for(int i=0; i<numRows;i++) {
			for(int j=0;j<numCol;j++) {
				scores[i][j]= scanFile.nextInt();
				System.out.print(scores[i][j] + " ");
			}
			System.out.println();
		}
		scanFile.close();

		System.out.println("The student average is: " + studentAverage(0, scores));
		System.out.println("The lab average is: " + labAverage(0,scores));
	}

	/*
	 *
	 * This method is going to generate each student's average lab score.
	 * @param studentNum this is the student row number.
	 * @param scores this represents the array
	 */
	private static double studentAverage(int studentNum, int[][] scores) {
			double average = 0.0;
	    for(int i = 0; i < scores[studentNum].length; i++)
	    {
	        average += scores[studentNum][i];
	    }
	    return average / scores[studentNum].length;
	}


	/*
	 *
	 * This method is going to be used to generate the average class lab score.
	 * @param labNum this represents the column of each students score.
	 * @param scores this represents the array.
	 */

	private static double labAverage(int labNum, int[][] scores) {
		double average = 0.0;
		for(int i = 0; i < scores.length; i++)
            average += scores[i][labNum];
        return average / scores.length;
	}

}

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Lab0 {

	/*
	 *
	 *
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

		System.out.print("Enter the name of the score file: ");
		String fileScores = keyboard.nextLine();
		File scoreFile = new File(fileScores);
		Scanner scanFile = new Scanner(scoreFile);

		int numRows = scanFile.nextInt();
		int numCol = scanFile.nextInt();
		int[][] scores = new int[numRows][numCol];

		for(int i=0; i<numRows;i++) {
			for(int j=0;j<numCol;j++) {
				scores[i][j]= i+j;
				System.out.print(scores[i][j]);
			}
			System.out.println();
		}
	}

	/*
	 *
	 * This method is going to generate each student's average lab score.
	 */
	/*
	private static double studentAverage(int studentNum, int[][] scores) {

	}


	/*
	 *
	 * This method is going to be used to generate the average class lab score.
	 */
	/*
	private static double labAverage(int labNum, int[][] scores) {
		int numRows = scores.length;
		int numColumns = scores[studentNum].length;
	}
	*/
}

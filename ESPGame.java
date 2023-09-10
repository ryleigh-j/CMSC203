/*
 * Class: CMSC203 
 * Instructor: Grinberg
 * Description: Color guessing game
 * Due: 9/10/2023
 * Platform/compiler:
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Ryleigh Brown Ekweonu
*/


import java.util.Scanner;
import java.util.Random;

public class ESPGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//to generate random number
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		//number-color key
		final int RED = 0, ORANGE = 1, YELLOW = 2, GREEN = 3, BLUE = 4, PURPLE = 5, WHITE = 6;
		String userName, description, dueDate;
		System.out.print("Please enter your name: ");
		userName = input.nextLine();
		System.out.print("\nPlease enter short description: ");
		description = input.nextLine();
		System.out.print("\nPlease enter due date(MM/DD/YY): ");
		dueDate = input.nextLine();
		//total correct guesses
		int total = 0;

		for (int i = 1; i <= 11; i++) {
			//random number 0-6
			int colorPick = rand.nextInt(7);
			System.out.println("\nRound " + i + "\n");
			System.out.print(
					"\nI am thinking of a color\nIs it red, orange, yellow, green, blue, purple, or white?\nEnter your guess:");
			String userGuess = input.nextLine();
			switch (colorPick) {
			case RED:
				if (userGuess.compareToIgnoreCase("red") == 0) {
					System.out.println("\nWow you read my mind!\n");
					total++;
				} else {
					System.out.println("\nSorry I was thinking red.\n");
				}
				break;
			case ORANGE:
				if (userGuess.compareToIgnoreCase("orange") == 0) {
					System.out.println("\nWow you read my mind!\n");
					total++;
				} else {
					System.out.println("\nSorry I was thinking orange.\n");
				}
				break;
			case YELLOW:
				if (userGuess.compareToIgnoreCase("yellow") == 0) {
					System.out.println("\nWow you read my mind!\n");
					total++;
				} else {
					System.out.println("\nSorry I was thinking yellow.\n");
				}
				break;

			case GREEN:
				if (userGuess.compareToIgnoreCase("green") == 0) {
					System.out.println("\nWow you read my mind!\n");
					total++;
				} else {
					System.out.println("\nSorry I was thinking green.\n");
				}
				break;
			case BLUE:
				if (userGuess.compareToIgnoreCase("blue") == 0) {
					System.out.println("\nWow you read my mind!\n");
					total++;
				} else {
					System.out.println("\nSorry I was thinking blue.\n");
				}
				break;
			case PURPLE:
				if (userGuess.compareToIgnoreCase("purple") == 0) {
					System.out.println("\nWow you read my mind!\n");
					total++;
				} else {
					System.out.println("\nSorry I was thinking purple.\n");
				}
				break;
			case WHITE:
				if (userGuess.compareToIgnoreCase("white") == 0) {
					System.out.println("Wow you read my mind!");
					total++;
				} else {
					System.out.println("\nSorry I was thinking white.\n");
				}
				break;
			default:
				System.out.println("\nYou did not guess :( \n");
			}

		}
		System.out.println("GAME OVER\n");
		System.out.println("\nYou guessed " + total + " out of 11 correct!");
		System.out.println("\nName: " + userName + "\nDescription: " + description + "\nDue Date: " + dueDate
				+ "\nThank you for playing!");

	}

}

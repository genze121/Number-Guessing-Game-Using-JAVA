package com.guess.number;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {

	public static void main(String[] args) {

		// get maximum number for program to guess
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the maximum value:- ");
		int maxVal = scanner.nextInt();

		// generate random and target number
		Random generate = new Random();
		int target = 1 + generate.nextInt(maxVal);

		// start guessing Loop
		int currentGuess = 0;

		for (int numberOfGuesses = 1; currentGuess != target; numberOfGuesses++) {

			// get the user's next guess
			System.out.print("Your Next Guess:-");
			currentGuess = scanner.nextInt();

			//print output based on the guess
			if (currentGuess < target) {
				System.out.println(currentGuess + " is too low!!");
			} else if (currentGuess > target) {
				System.out.println(currentGuess + " is too high!!");
			} else {
				System.out.println("You did it in " + numberOfGuesses + " guess!!! ");
			}

		}

	}

}

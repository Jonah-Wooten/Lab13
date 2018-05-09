package com;

import java.util.Scanner;

public abstract class RoshaboApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		User user = new User();

		System.out.println("Please enter your name");
		String input = scan.nextLine();
		user.setName(input);

		System.out.println("Would you like to play against Rock or Random(1/2)?");
		int answer = scan.nextInt();

		Player opponent = null;

		switch (answer) {
		case 1:
			opponent = new Rock();
			System.out.println(opponent.generateRoshambo());
			break;
		case 2:
			opponent = new Random();
			System.out.println(opponent.generateRoshambo());
			break;

		}
		System.out.println("Rock, Paper, or Scissors? (R/P/S);");
		String rps = scan.next();
		// Display opponents choice
		switch (answer) {
		case 1:

			System.out.println(matchResult(user, opponent));
			break;
		case 2:

			System.out.println(matchResult(user, opponent));
			break;

		}
	}

	public static String matchResult(Player rock, Player opponent) {
		// add game result logic here
		return null;
	}
}
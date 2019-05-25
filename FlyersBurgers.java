//-----------------------------------------------------------------------------------------------------------------------------//
// FlyersBurgers.java         Author: Debra Ragland             CPSC 5100														//
//																																//
// Code is designed to interactively take user delivery or pickup order.														//
//																																//
//------------------------------------------------------------------------------------------------------------------------------//


import java.util.Scanner;
import java.util.ArrayList;

public class FlyersBurgers {
	
//Uses array to print menu
	
	public static void main(String[] args) {

		System.out.print("Welcome to Flyers' Burgers Online!");

		System.out.println();
		ArrayList<String> menu = new ArrayList<String>();
		menu.add("Flyers' Burger, $4.50");
		menu.add("Flyers' Drink, $1.50");
		menu.add("Flyers' Fries, $2.50");
		menu.add("Flyers' Dessert, $3.00");

		String moreToOrder, pickup;
		double tax = 0.05, burgerdollars = 4.50, drinkdollars = 1.50, frydollars = 2.50, sweetdollars = 3.00,
				uptotalsweet2 = 0, uptotaldrink2 = 0, uptotalfry2 = 0, uptotalburger2 = 0;

		int zip = 0, base = 60446;

		Scanner scan = new Scanner(System.in);
		
//Uses scanner to figure determine if order will be pickup or delivery. If delivery, test input zipcode.
		
		System.out.print("Will you be picking up your order today (y/n)?:");
		pickup = scan.nextLine();
		if (pickup.equalsIgnoreCase("n")) {
			System.out.print("Got it! Please input your 5-digit zipcode to verify delivery is available:");
			zip = scan.nextInt();
			if (zip == base) {
				System.out.print("Your delivery fee is $5");
			}
			if (zip != base) {
				if (zip == (base - 5)) {
					System.out.print("Delivery will be $7");
				} else if (zip == (base + 5)) {
					System.out.print("Delivery will be $7");
				} else if (zip >= (base - 4) && zip <= (base + 4)) {
					System.out.print("Delivery will be $5");
				} else if (zip < (base - 5) || zip > (base + 5)) {
					System.out.print("Sorry delivery is not available in your area.");
					System.out.println();
					System.out.print("Would you like to pick up your order instead?");
				}
			}
		}

		System.out.println();

		System.out.print("Here's the menu:");

		System.out.println();

		int index = 0;
		while (index < menu.size()) {
			System.out.println(menu.get(index));
			index++;
		}
// Iterates to ask user what item they would like, how many of that item, and if they want to order something else or not 
// based on delivery or pickup selection above
		
		System.out.print("Would you like to place an order?(y/n):");
		while (scan.hasNextLine()) {
			moreToOrder = scan.nextLine();
			if (moreToOrder.equalsIgnoreCase("y"))
				System.out.print("What would you like? (burger, fry, drink, dessert):");
			if (moreToOrder.equalsIgnoreCase("burger")) {
				System.out.print("How many?:");
				int moreburger = scan.nextInt();
				double uptaxburger = ((burgerdollars * moreburger) * tax);
				uptotalburger2 = (uptaxburger + (burgerdollars * moreburger));
				if (zip == base) {
					System.out.print("Ok, your new total is: "
							+ (uptotalburger2 + uptotalsweet2 + uptotaldrink2 + uptotalfry2 + 5));
				} else if (zip == (base - 5) || zip == (base + 5)) {
					System.out.print("Ok, your new total is: "
							+ (uptotalburger2 + uptotalsweet2 + uptotaldrink2 + uptotalfry2 + 7));
				} else if (zip >= (base - 4) && zip <= (base + 4)) {
					System.out.print("Ok, your new total is: "
							+ (uptotalburger2 + uptotalsweet2 + uptotaldrink2 + uptotalfry2 + 5));
				} else {
					System.out.print(
							"Ok, your new total is: " + (uptotalburger2 + uptotalsweet2 + uptotaldrink2 + uptotalfry2));
				}
				System.out.println();
				System.out.print("Anything else for you today?(y/n): ");
				moreToOrder = scan.nextLine();
			}

			if (moreToOrder.equalsIgnoreCase("fry")) {
				System.out.print("How many?:");
				int morefry = scan.nextInt();
				double uptaxfry = ((frydollars * morefry) * tax);
				uptotalfry2 = (uptaxfry + (frydollars * morefry));
				if (zip == base) {
					System.out.print("Ok, your new total is: "
							+ (uptotalburger2 + uptotalsweet2 + uptotaldrink2 + uptotalfry2 + 5));
				} else if (zip == (base - 5) || zip == (base + 5)) {
					System.out.print("Ok, your new total is: "
							+ (uptotalfry2 + uptotalsweet2 + uptotaldrink2 + uptotalfry2 + 7));
				} else if (zip >= (base - 4) && zip <= (base + 4)) {
					System.out.print("Ok, your new total is: "
							+ (uptotalburger2 + uptotalsweet2 + uptotaldrink2 + uptotalfry2 + 5));
				} else {
					System.out.print(
							"Ok, your new total is: " + (uptotalburger2 + uptotalsweet2 + uptotaldrink2 + uptotalfry2));
				}
				System.out.println();
				System.out.print("Anything else for you today?(y/n): ");
				moreToOrder = scan.nextLine();
			}

			if (moreToOrder.equalsIgnoreCase("drink")) {
				System.out.print("How many?:");
				int moredrink = scan.nextInt();
				double uptaxdrink = ((drinkdollars * moredrink) * tax);
				uptotaldrink2 = (uptaxdrink + (drinkdollars * moredrink));
				if (zip == base) {
					System.out.print("Ok, your new total is: "
							+ (uptotalburger2 + uptotalsweet2 + uptotaldrink2 + uptotalfry2 + 5));
				} else if (zip == (base - 5) || zip == (base + 5)) {
					System.out.print("Ok, your new total is: "
							+ (uptotalburger2 + uptotalsweet2 + uptotaldrink2 + uptotalfry2 + 7));
				} else if (zip >= (base - 4) && zip <= (base + 4)) {
					System.out.print("Ok, your new total is: "
							+ (uptotalburger2 + uptotalsweet2 + uptotaldrink2 + uptotalfry2 + 5));
				} else {
					System.out.print(
							"Ok, your new total is: " + (uptotalburger2 + uptotalsweet2 + uptotaldrink2 + uptotalfry2));
				}
				System.out.println();
				System.out.print("Anything else for you today?(y/n): ");
				moreToOrder = scan.nextLine();
			}

			if (moreToOrder.equalsIgnoreCase("dessert")) {
				System.out.print("How many?:");
				int moresweet = scan.nextInt();
				double uptaxsweet = ((sweetdollars * moresweet) * tax);
				uptotalsweet2 = (uptaxsweet + (sweetdollars * moresweet));
				if (zip == base) {
					System.out.print("Ok, your new total is: "
							+ (uptotalburger2 + uptotalsweet2 + uptotaldrink2 + uptotalfry2 + 5));
				} else if (zip == (base - 5) || zip == (base + 5)) {
					System.out.print("Ok, your new total is: "
							+ (uptotalburger2 + uptotalsweet2 + uptotaldrink2 + uptotalfry2 + 7));
				} else if (zip >= (base - 4) && zip <= (base + 4)) {
					System.out.print("Ok, your new total is: "
							+ (uptotalburger2 + uptotalsweet2 + uptotaldrink2 + uptotalfry2 + 5));
				} else {
					System.out.print(
							"Ok, your new total is: " + (uptotalburger2 + uptotalsweet2 + uptotaldrink2 + uptotalfry2));
				}
				System.out.println();
				System.out.print("Anything else for you today?(y/n): ");
				moreToOrder = scan.nextLine();
			} else if (moreToOrder.equalsIgnoreCase("n")) {
				System.out.print("Ok, see you soon!");
			}

		}
	}
}

import java.util.Scanner;
import java.util.ArrayList;
if (pickup.equalsIgnoreCase("y")) {
	System.out.print("Ok!");
	
} else 


public class FlyersBurgers2 {

	public static void main(String[] args) {

		System.out.print("Welcome to Flyers' Burgers Online!");

		System.out.println();
		ArrayList<String> menu = new ArrayList<String>();
		menu.add("Flyers' Burger, $4.50");
		menu.add("Flyers' Drink, $1.50");
		menu.add("Flyers' Fries, $2.50");
		menu.add("Flyers' Dessert, $3.00");

		String moreToOrder, item, deliver, pickup;
		double tax = 0.05, taxfry, taxburger, taxsweet, totalsweet = 0, taxdrink, totaldrink = 0, totalfry = 0,
				totalburger = 0, burgerdollars = 4.50, drinkdollars = 1.50, frydollars = 2.50, sweetdollars = 3.00,
				uptotalsweet2 = 0, uptotaldrink2 = 0, uptotalfry2 = 0, uptotalburger2 = 0;

		int quantityburger = 0, quantityfry = 0, quantitydrink = 0, quantitysweet = 0;

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Will you be picking up your order today (y/n)?:");
		pickup = scan.nextLine();
		while (pickup.equalsIgnoreCase("y")) {
			System.out.print("Here's the menu:");
			System.out.println();

			int index = 0;
			while (index < menu.size()) {
				System.out.println(menu.get(index));
				index++;
			}

			System.out.print("What can we prepare for you today? (burger, fry, drink, dessert):");
			item = scan.nextLine();
			if (item.equalsIgnoreCase("burger")) {
				System.out.print("How many?:");
				quantityburger = scan.nextInt();

				taxburger = (burgerdollars * quantityburger) * tax;
				totalburger = taxburger + (burgerdollars * quantityburger);

				System.out.println("Your total is:" + totalburger);

			} else if (item.equalsIgnoreCase("fry")) {
				System.out.print("How many?:");
				quantityfry = scan.nextInt();

				taxfry = (frydollars * quantityfry) * tax;
				totalfry = taxfry + (frydollars * quantityfry);

				System.out.println("Your total is: " + totalfry);
			} else if (item.equalsIgnoreCase("drink")) {
				System.out.print("How many?:");
				quantitydrink = scan.nextInt();

				taxdrink = (drinkdollars * quantitydrink) * tax;
				totaldrink = taxdrink + (drinkdollars * quantitydrink);

				System.out.println("Your total is: " + totaldrink);
			} else if (item.equalsIgnoreCase("dessert")) {
				System.out.print("How many?:");
				quantitysweet = scan.nextInt();

				taxsweet = (sweetdollars * quantitysweet) * tax;
				totalsweet = taxsweet + (sweetdollars * quantitysweet);
				System.out.println("Your total is: " + totalsweet);
			} 
			System.out.print("Is there something else we can get for you today?(y/n):");
			while (scan.hasNextLine()) {
				moreToOrder = scan.nextLine();
				if (moreToOrder.equalsIgnoreCase("y"))
					System.out.print("What would you like? (burger, fry, drink, dessert):");

				if (moreToOrder.equalsIgnoreCase("burger")) {
					System.out.print("How many?:");
					int moreburger = scan.nextInt();
					double uptaxburger = ((burgerdollars * (moreburger + quantityburger) * tax));
					uptotalburger2 = (uptaxburger + (burgerdollars * (moreburger + quantityburger)));
					System.out.print("Ok, your new total is: " + (uptotalburger2 + totalburger + uptotalsweet2
							+ totalsweet + uptotaldrink2 + totaldrink + uptotalfry2 + totalfry));
					System.out.println();
					System.out.print("Anything else for you today?(y/n): ");
					moreToOrder = scan.nextLine();
				}
				if (moreToOrder.equalsIgnoreCase("fry")) {
					System.out.print("How many?:");
					int morefry = scan.nextInt();
					double uptaxfry = ((frydollars * (morefry + quantityfry) * tax));
					uptotalfry2 = (uptaxfry + (frydollars * (morefry + quantityfry)));
					System.out.print("Ok, your new total is: " + (uptotalburger2 + totalburger + uptotalsweet2
							+ totalsweet + uptotaldrink2 + totaldrink + uptotalfry2 + totalfry));
					System.out.println();
					System.out.print("Anything else for you today?(y/n): ");
					moreToOrder = scan.nextLine();
				}
				if (moreToOrder.equalsIgnoreCase("drink")) {
					System.out.print("How many?:");
					int moredrink = scan.nextInt();
					double uptaxdrink = ((drinkdollars * (moredrink + quantitydrink) * tax));
					uptotaldrink2 = (uptaxdrink + (drinkdollars * (moredrink + quantitydrink)));
					System.out.print("Ok, your new total is: " + (uptotalburger2 + totalburger + uptotalsweet2
							+ totalsweet + uptotaldrink2 + totaldrink + uptotalfry2 + totalfry));
					System.out.println();
					System.out.print("Anything else for you today?(y/n): ");
					moreToOrder = scan.nextLine();
				}

				if (moreToOrder.equalsIgnoreCase("dessert")) {
					System.out.print("How many?:");
					int moresweet = scan.nextInt();
					double uptaxsweet = ((sweetdollars * (moresweet + quantitysweet) * tax));
					uptotalsweet2 = (uptaxsweet + (sweetdollars * (moresweet + quantitysweet)));
					System.out.print("Ok, your new total is: " + (uptotalburger2 + totalburger + uptotalsweet2
							+ totalsweet + uptotaldrink2 + totaldrink + uptotalfry2 + totalfry));
					System.out.println();
					System.out.print("Anything else for you today?(y/n): ");
					moreToOrder = scan.nextLine();
				} else if (moreToOrder.equalsIgnoreCase("n")) {
					System.out.print("Ok, see you soon!");
				}

			}
		
		}
		
		}
	}

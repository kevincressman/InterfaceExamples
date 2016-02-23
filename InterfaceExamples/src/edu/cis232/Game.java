package edu.cis232;

import java.util.Scanner;
import edu.cis232.item.*;

public class Game {

	Scanner keyboard = new Scanner(System.in);
	Item[] chest = { new Potion("Health Potion?", 10), new Potion("Milk", 3),
			new Treasure(4, 2)};

	public static void main(String[] args) {
		new Game().play();
	}

	public void play() {
		System.out.println("Welcome to the game!");
		System.out.println("Do you want to look in the chest?");
		String answer = keyboard.nextLine();
		if (answer.equalsIgnoreCase("yes")) {
			lookInChest();
		} else {
			System.out.println("You lose.");
		}
	}

	public void lookInChest() {
		for (Item item : chest) {
			System.out.println(item);
			if (item instanceof Carryable) {
				Carryable c = (Carryable) item;
				System.out.printf("Has weight of %d and size of %d%n", c.getWeight(), c.getSize());
			}
			if (item instanceof Drinkable) {
				System.out.println("You can imbibe this! Imbibe?");
				String answer = keyboard.nextLine();
				if (answer.equalsIgnoreCase("yes")) {
					((Drinkable) item).imbibe();
				}
			}
		}
	}

}

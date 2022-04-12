package assignment2;

import java.util.Scanner;

import beverage.Beverage;
import beverage.DarkRoast;
import beverage.Decaf;
import beverage.Espresso;
import beverage.HouseBlend;
import condiment.Mocha;
import condiment.Sprinkle;
import condiment.Whip;

/*
 * Name             : Sung-Jun (Tony) Baek
 * Assignment number: Assignment2 The Decorator Pattern
 */
public class Register {
	private String condimentFactoryAddress;
	public Register (String address) {
		this.condimentFactoryAddress = address;
	}
	
	public void takeOrder() {
		System.out.println("Taking order from: " + condimentFactoryAddress);
		Scanner sc = new Scanner(System.in);
		boolean takeItemList = false;
		Beverage beverage = null;
		
		while (sc.hasNextLine()) {
			String line = sc.nextLine().toLowerCase();
			//start taking items
			if (line.equals("new sale") && !takeItemList) {
				takeItemList = true;
			} else if (line.equals("end sale") && takeItemList) { //create orders
				takeItemList = false;
				//Print item detail
				System.out.println("Item : " + beverage.getDescription());
				//Print item price
				System.out.printf("Price : %.2f\n", beverage.cost());
			} else if (takeItemList) {
				if (line.equals("darkroast")) {
					beverage = new DarkRoast();
				} else if (line.equals("decaf")) {
					beverage = new Decaf();
				} else if (line.equals("espresso")) {
					beverage = new Espresso();
				} else if (line.equals("houseblend")) {
					beverage = new HouseBlend();
				} else if (line.equals("mocha")) {
					if (beverage != null) {
						beverage = new Mocha(beverage);
					}
				} else if (line.equals("whip")) {
					if (beverage != null) {
						beverage = new Whip(beverage);
					}
				} else if (line.equals("sprinkle")) {
					if (beverage != null) {
						beverage = new Sprinkle(beverage);
					}
				} else {
					System.out.println("Not on the item list");
				}
			} else {
				System.out.println("Wrong Input");
			}
		}
		sc.close();
	}
}

package assignment3;

import java.util.*;

import beverage.Beverage;

public class MenuTestDrive {
	
	/*
	 * Name             : Sung-Jun (Tony) Baek
	 * Assignment number: Pattern Assignment3
	 */
	
	public static void main(String args[]) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        StarbuzzCoffeeMenu  coffeMenu = new StarbuzzCoffeeMenu();
		Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, coffeMenu);
		
		waitress.printMenu();
	}

	public static void printMenu() {
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();
		StarbuzzCoffeeMenu coffeMenu = new StarbuzzCoffeeMenu();
		
		ArrayList<?> breakfastItems = pancakeHouseMenu.getMenuItems();
 
		for (int i = 0; i < breakfastItems.size(); i++) {
			MenuItem menuItem = (MenuItem)breakfastItems.get(i);
			System.out.print(menuItem.getName());
			System.out.println("\t\t" + menuItem.getPrice());
			System.out.println("\t" + menuItem.getDescription());
		}

		MenuItem[] lunchItems = dinerMenu.getMenuItems();
 
		for (int i = 0; i < lunchItems.length; i++) {
			MenuItem menuItem = lunchItems[i];
			System.out.print(menuItem.getName());
			System.out.println("\t\t" + menuItem.getPrice());
			System.out.println("\t" + menuItem.getDescription());
		}
		
		Iterator coffeItems = coffeMenu.getIterator();
		System.out.println(coffeMenu.toString());
		//For all existng key, iterate
		while(coffeItems.hasNext()) {
			Beverage beverage = (Beverage) coffeItems.next();
			System.out.print(beverage.getDescription());
			System.out.println("\t\t" + beverage.cost());
		}
	}
}

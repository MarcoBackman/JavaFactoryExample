package assignment3;

import java.util.Hashtable;

import beverage.Beverage;
import beverage.DarkRoast;
import beverage.Decaf;
import beverage.Espresso;
import beverage.HouseBlend;
import condiment.Mocha;
import condiment.Sprinkle;
import condiment.Whip;

public class StarbuzzCoffeeMenu {
	Hashtable<Integer, Beverage> menuItems;
	Iterator menuIterator;
	
	public StarbuzzCoffeeMenu() {
		menuItems = new Hashtable<Integer, Beverage>();
		
		addItem(new DarkRoast());
		addItem(new Decaf());
		addItem(new Espresso());
		addItem(new HouseBlend());
		addItem(new Mocha(new DarkRoast()));
		addItem(new Mocha(new Decaf()));
		addItem(new Mocha(new Espresso()));
		addItem(new Mocha(new HouseBlend()));
		addItem(new Whip(new Whip(new Mocha(new HouseBlend()))));
		addItem(new Sprinkle(new Mocha(new HouseBlend())));
	
		menuIterator = createIterator();
	}
	

	public void addItem(Beverage menuItem)
	{	
		int index = menuItems.size();
		menuItems.put(index, menuItem);
	}
 
	public Hashtable<Integer, Beverage> getMenuItems() {
		return menuItems;
	}
  
	public Iterator getIterator() {
		return menuIterator;
	}
	
	public Iterator createIterator() {
		return new StarbuzzMenuIterator(menuItems);
	}
  
	public String toString() {
		return "StarBuzz Menu Iterator";
	}
}

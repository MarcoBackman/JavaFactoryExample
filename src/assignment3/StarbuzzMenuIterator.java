package assignment3;

import java.util.Hashtable;

import beverage.Beverage;

public class StarbuzzMenuIterator implements Iterator {
	Hashtable<Integer, Beverage> menuItems;
	int index = 0;
	
	public StarbuzzMenuIterator(Hashtable<Integer, Beverage> menuItems) {
		this.menuItems = menuItems;
	}
 
	public Object next() {
		Object object = menuItems.get(index);
		index = index + 1;
		return object;
	}
 
	public boolean hasNext() {
		if (index >= menuItems.size()) {
			return false;
		} else {
			return true;
		}
	}
}

package assignment2;

/*
 * Name             : Sung-Jun (Tony) Baek
 * Assignment number: Assignment2 The Decorator Pattern
 */
public class Store {
	CondimentFactory condimentFactory;
	
	public Store() {
		this.condimentFactory = CondimentFactory.getInstnace();
		String factoryAddress = condimentFactory.getAddress();
		new Register(factoryAddress).takeOrder();
	}
}

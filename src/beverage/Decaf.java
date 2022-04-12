package beverage;

import condiment.Mocha;
import condiment.Sprinkle;
import condiment.Whip;

/*
 * Name             : Sung-Jun (Tony) Baek
 * Assignment number: Assignment2 The Decorator Pattern
 */
public class Decaf extends Beverage {
	public Decaf() {
		description = "Decaffine coffee";
	}
	
	public double cost() {
		return 1.05;
	}

	Mocha mocha;
	Whip whip;
	Sprinkle sprinkle;
	
	public void setMocha(Mocha mocha) {
		this.mocha = mocha;
	}

	public boolean hasMocha() {
		if (mocha != null) {
			return true;
		}
		return false;
	}

	public void setWhip(Whip whip) {
		this.whip = whip;
	}

	public boolean hasWhip() {
		if (whip != null) {
			return true;
		}
		return false;
	}

	public void setSprinkle(Sprinkle sprinkle) {
		this.sprinkle = sprinkle;
	}

	public boolean hasSprinkle() {
		if (sprinkle != null) {
			return true;
		}
		return false;
	}

}

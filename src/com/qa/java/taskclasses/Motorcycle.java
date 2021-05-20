package com.qa.java.taskclasses;

public class Motorcycle extends Vehicle {
	protected boolean hasWindShield;

	public Motorcycle(String name, int id) {
		super(name, id);
	}

	public boolean isHasWindShield() {
		return hasWindShield;
	}

	public void setHasWindShield(boolean hasWindShield) {
		this.hasWindShield = hasWindShield;
	}

}

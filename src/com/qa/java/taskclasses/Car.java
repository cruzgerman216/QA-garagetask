package com.qa.java.taskclasses;

public class Car extends Vehicle {
	protected int numDoors;

	public Car(String name, int id) {
		super(name, id);
	}

	public int getNumDoors() {
		return numDoors;
	}

	public void setNumDoors(int numDoors) {
		this.numDoors = numDoors;
	}

	@Override
	public void readerManual() {
	}
}

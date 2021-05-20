package com.qa.java.taskclasses;

public class Truck extends Vehicle {
	protected boolean hasCargo;

	public Truck(String name, int id) {
		super(name, id);
	}

	public boolean isHasCargo() {
		return hasCargo;
	}

	public void setHasCargo(boolean hasCargo) {
		this.hasCargo = hasCargo;
	}

	@Override
	public void readerManual() {
	}
}

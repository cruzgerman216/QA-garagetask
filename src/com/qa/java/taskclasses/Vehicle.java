package com.qa.java.taskclasses;

public class Vehicle implements vehicleManual{
	public String name;
	public int id;

	public Vehicle(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public void readerManual() {
	}
}

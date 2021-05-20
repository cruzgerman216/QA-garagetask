package com.qa.java.taskclasses;

import java.util.List;
import java.util.ArrayList;

public class Garage {
	protected List<Vehicle> storage = new ArrayList<>();
	protected double bill;

	public Garage() {
		this.bill = 0;
	}

	public void removeVehicle(Vehicle v) {
		List<Vehicle> storage2 = new ArrayList<>();
		for (Vehicle vehicle : storage) {
			if (!vehicle.getClass().equals(v.getClass())) {
				storage2.add(vehicle);
			}
		}
		storage = storage2;
	}

	public void removeVehicle(int id) {
		for (Vehicle v : storage) {
			if (v.id == id) {
				storage.remove(v);
			}
		}
	}

	public void fix(Vehicle v) {
		for (Vehicle vehicle : storage) {
			if (vehicle.getClass().equals(v.getClass())) {
				this.bill += 1500.09;
			} else if (vehicle instanceof Motorcycle) {
				this.bill += 600.32;
			} else if (vehicle instanceof Truck) {
				this.bill += 2000.53;
			}
		}

		System.out.println("Bill comes out to be " + bill);
	}

	public void printGaragePrice() {
		double price = 0;
		for (Vehicle v : storage) {
			if (v instanceof Car) {
				price += 26434.09;
			} else if (v instanceof Motorcycle) {
				price += 1500.32;
			} else if (v instanceof Truck) {
				price += 35500.53;
			}
		}
		System.out.println("Price comes out to be " + price);
	}

	public void emptyGarage() {
		storage.clear();
	}

	public List<Vehicle> getstorage() {
		return storage;
	}

	public void setstorage(List<Vehicle> storage) {
		this.storage = storage;
	}

	public double getBill() {
		return bill;
	}

	public void setBill(double bill) {
		this.bill = bill;
	}

	public void addVehicle(Vehicle v) {
		storage.add(v);
	}
}

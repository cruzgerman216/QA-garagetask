package com.qa.java.taskclasses;

import java.util.List;
import java.util.ArrayList;

public class Garage {
	protected List<Vehicle> store = new ArrayList<>();
	protected double bill;

	public void fix(Vehicle v) {
		for (Vehicle v1 : store) {
			if (v1.getClass().equals(v.getClass())) {
				this.bill += 1500.09;
			} else if (v1 instanceof Motorcycle) {
				this.bill += 600.32;
			} else if (v1 instanceof Truck) {
				this.bill += 2000.53;
			}
		}

		System.out.println("Bill comes out to be " + bill);
	}

	public void printGaragePrice() {
		double price = 0;
		for (Vehicle v : store) {
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

	public void removeVehicle(Vehicle v) {

		for (Vehicle v1 : store) {
			if (v1.getClass().equals(v.getClass())) {
				store.remove(v1);
			}
		}
	}

	public void removeVehicle(int id) {
		for (Vehicle v : store) {
			if (v.id == id) {
				store.remove(v);
			}
		}
	}

	public void emptyGarage() {
		store.clear();
	}

	public List<Vehicle> getStore() {
		return store;
	}

	public void setStore(List<Vehicle> store) {
		this.store = store;
	}

	public double getBill() {
		return bill;
	}

	public void setBill(double bill) {
		this.bill = bill;
	}

	public Garage() {
		this.bill = 0;
	}

	public void addVehicle(Vehicle v) {
		store.add(v);
	}
}

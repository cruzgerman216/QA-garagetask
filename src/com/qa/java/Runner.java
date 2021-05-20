package com.qa.java;

import com.qa.java.taskclasses.Car;
import com.qa.java.taskclasses.Garage;
import com.qa.java.taskclasses.Motorcycle;
import com.qa.java.taskclasses.Truck;
import com.qa.java.taskclasses.Vehicle;

public class Runner {

	public static void main(String[] args) {
		Car car = new Car("Mazda", 324);
		Motorcycle motorcycle = new Motorcycle("ninja3000", 123);
		Truck truck = new Truck("Ford F-150", 843);
		Vehicle truck2 = new Truck("Honda Ridgeline", 541);
		Garage garage = new Garage();
		garage.addVehicle(car);
		garage.addVehicle(motorcycle);
		garage.addVehicle(truck);
		garage.addVehicle(truck2);
		garage.printGaragePrice();
		garage.removeVehicle(truck);
		garage.printGaragePrice();
		garage.fix(truck);
	}
}

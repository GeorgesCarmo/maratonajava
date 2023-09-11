package LComportamento;

import java.util.ArrayList;
import java.util.List;

public class ComportPorParamTest01 {
	private static List<Car> cars = List.of(new Car("white", 2025), new Car("blue", 2024), new Car("red", 2020));

	public static void main(String[] args) {
		System.out.println(filterWhiteCar(cars));
		System.out.println(filterCarByColor(cars, "white"));
		System.out.println(filterCarByAge(cars, 2026));
	}

	private static List<Car> filterWhiteCar(List<Car> cars) {
		List<Car> whiteCars = new ArrayList<>();
		for (Car car : cars) {
			if (car.getColor().equals("white")) {
				whiteCars.add(car);
			}
		}
		return whiteCars;
	}
	
	private static List<Car> filterCarByColor(List<Car> cars, String color) {
		List<Car> listCars = new ArrayList<>();
		for (Car car : cars) {
			if (car.getColor().equals(color)) {
				listCars.add(car);
			}
		}
		return listCars;
	}
	
	private static List<Car> filterCarByAge(List<Car> cars, int year) {
		List<Car> listCars = new ArrayList<>();
		for (Car car : cars) {
			if (car.getYear() <= year) {
				listCars.add(car);
			}
		}
		return listCars;
	}

}

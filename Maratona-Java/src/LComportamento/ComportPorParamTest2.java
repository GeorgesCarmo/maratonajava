package LComportamento;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportPorParamTest2 {
	private static List<Car> cars = List.of(new Car("white", 2025), new Car("blue", 2024), new Car("red", 2020));

	public static void main(String[] args) {
		List<Car> whiteCars = filter(cars, new CarPredicate(){
			@Override
			public boolean test(Car car) {
				return car.getColor().equals("white");
			}


		});
		System.out.println(whiteCars);
//		whiteCars = filter(cars, car -> car.getColor().equals("white"));
//		System.out.println(whiteCars);
	}

	private static List<Car> filter(List<Car> cars, CarPredicate carPredicate) {
		List<Car> listCars = new ArrayList<>();
		for (Car car : cars) {
			if (carPredicate.test(car)) {
				listCars.add(car);
			}
		}
		return listCars;
	}

}

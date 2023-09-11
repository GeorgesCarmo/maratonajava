package LComportamento;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportPorParamTest3 {
	private static List<Car> cars = List.of(new Car("white", 2025), new Car("blue", 2024), new Car("red", 2020));

	public static void main(String[] args) {
		List<Car> whiteCars = filter(cars, car -> car.getColor().equals("white"));
		List<Car> blueCars = filter(cars, car -> car.getColor().equals("blue"));
		List<Car> redCars = filter(cars, car -> car.getColor().equals("red"));
		System.out.println(whiteCars);
		System.out.println(blueCars);
		System.out.println(redCars);
		List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println(filter(nums, num -> num % 2 == 0));
		System.out.println(filter(cars, car -> car.getYear() <= 2025));
	}

	private static <T> List<Car> filter(List<T> list, Predicate<T> predicate) {
		List<T> filterList = new ArrayList<>();
		for (T t : list) {
			if (predicate.test(t)) {
				filterList.add(t);
			}
		}
		return (List<Car>) filterList;
	}
}
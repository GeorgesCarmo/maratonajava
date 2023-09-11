package MLambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTest2 {

	public static void main(String[] args) {
		List<String> strings = List.of("Georges", "Carmo");
		List<Integer> integers = map(strings, s -> s.length());
		List<String> upper = map(strings, String::toUpperCase);
		System.out.println(integers);
		System.out.println(upper);
}
	private static <T, R> List<R> map(List<T> list, Function<T, R> function){
		List<R> result = new ArrayList<>();
		for (T e : list) {
			R r = function.apply(e);
			result.add(r);
		}
		return result;
	}
}
package OStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest7 {
	public static void main(String[] args) {
		List<Integer> integers = List.of(1,2,3,4,5,6);
		
			integers.stream().reduce((x, y) -> x + y).ifPresent(System.out::println); // pode fazer as operações matemáticas basicas (+, -, *, /)
			System.out.println(integers.stream().reduce(0, (x, y) -> x + y));
			
			integers.stream().reduce(Integer::sum).ifPresent(System.out::println);
			System.out.println(integers.stream().reduce(0, Integer::sum));
			
			integers.stream().reduce((x, y) -> x > y ? x : y).ifPresent(System.out::println);
			System.out.println(integers.stream().reduce(0, Integer::max));
	}
	}
package Ddates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest {

	public static void main(String[] args) {

		LocalDateTime localDateTime = LocalDateTime.now();
		LocalDate date = LocalDate.of(2024, Month.AUGUST, 6);
		LocalDate dateParse = LocalDate.parse("2024-08-06"); // para fazer o parse tem q ser identico
		LocalTime time = LocalTime.of(9, 45, 21);
		LocalTime timeParse = LocalTime.parse("09:45:21");
		System.out.println(localDateTime);
		System.out.println(date);
		System.out.println(dateParse);
		System.out.println(time);
		System.out.println(timeParse);
		System.out.println(date.atTime(time));
		// outra forma de fazer a mesma coisa
		LocalDateTime ldt1 = time.atDate(date);
		System.out.println(ldt1);
	}

}

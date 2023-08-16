package Dates;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest {

	public static void main(String[] args) {
		System.out.println(new Date());
		System.out.println(Calendar.getInstance());
		System.out.println(Month.JANUARY.getValue());
		
		LocalDate date = LocalDate.of(2022, Month.JANUARY, 27);
		LocalDate agora = LocalDate.now();
		agora = agora.plusDays(3);
		
		System.out.println(date.getYear());
		System.out.println(date.getMonth());
		System.out.println(date.getDayOfMonth());
		System.out.println(date.getDayOfWeek());
		System.out.println(date);
		System.out.println(agora);
	}

}

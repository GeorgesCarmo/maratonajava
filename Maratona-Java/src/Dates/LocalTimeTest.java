package Dates;

import java.time.LocalTime;

public class LocalTimeTest {

	public static void main(String[] args) {
		
		LocalTime time = LocalTime.of(23, 32, 12);
		LocalTime timeNow = LocalTime.now();
		System.out.println(time);
		System.out.println(timeNow);
		System.out.println(timeNow.getHour());
		System.out.println(timeNow.getMinute());
		System.out.println(timeNow.getSecond());
		System.out.println(LocalTime.MIN);
		System.out.println(LocalTime.MAX);
	}

}

package Dates;

import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		Date date = new Date();//long que representa datas
		System.out.println(date.getTime());
		date.setTime(date.getTime() + 3_600_000); // 1h em ms
		System.out.println(date);

	}

}

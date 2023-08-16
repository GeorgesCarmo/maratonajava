package Dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
		String s2 = date.format(DateTimeFormatter.ISO_DATE);
		String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println();
		LocalDate parse1 = LocalDate.parse("20230809",DateTimeFormatter.BASIC_ISO_DATE);
		LocalDate parse2 = LocalDate.parse("2023-08-09",DateTimeFormatter.ISO_DATE);
		LocalDate parse3 = LocalDate.parse("2023-08-09",DateTimeFormatter.ISO_LOCAL_DATE);

		System.out.println(parse1);
		System.out.println(parse2);
		System.out.println(parse3);
		
		LocalDateTime now = LocalDateTime.now();
		String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
		System.out.println(s4);
		LocalDateTime parse4 = LocalDateTime.parse(s4);
		System.out.println(parse4);
		System.out.println();
		
		DateTimeFormatter formatterBr = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String formatBr = LocalDate.now().format(formatterBr);
		System.out.println(formatBr);
		
		DateTimeFormatter formatterUsa = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		String formatUsa = LocalDate.now().format(formatterUsa);
		System.out.println(formatUsa);
		
		DateTimeFormatter formatterJapan = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		String formatJapan = LocalDate.now().format(formatterJapan);
		System.out.println(formatJapan);
		
		DateTimeFormatter formatterGr = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMAN);
		String formatGr = LocalDate.now().format(formatterGr);
		System.out.println(formatGr);
		LocalDate parseGr = LocalDate.parse("09.August.2023", formatterGr);
		System.out.println(parseGr);
	}

}

package Dates;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest {

	public static void main(String[] args) {

		Calendar calendar = Calendar.getInstance();
		if(calendar.getFirstDayOfWeek() == Calendar.MONDAY) {
			System.out.println("Domingo é o primeiro dia da semana");
		}else {
			System.out.println("Não é domingo");
		}
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK)); // dia da semana em inteiro
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH)); // dia do mes
		System.out.println(calendar.get(Calendar.DAY_OF_YEAR)); // dia do ano
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		
		calendar.add(Calendar.DAY_OF_MONTH, 2); // adicionando 2 dias no mes
		calendar.add(Calendar.HOUR, 2); // adicionando 2 horas 
		calendar.roll(Calendar.HOUR, 12); // adiciona 12h e não rola o dia
		Date date = calendar.getTime();
		System.out.println(date);
		

	}

}

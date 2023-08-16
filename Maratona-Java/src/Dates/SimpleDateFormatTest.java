package Dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest { 

	public static void main(String[] args) {
		
		
		String pattern = "'Brasília,' dd 'de' MMMM 'de' yyyy";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
		System.out.println(sdf.format(new Date()));

	}

}

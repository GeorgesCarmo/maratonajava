package Dates;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneTest {

	public static void main(String[] args) {
		Map<String, String> shortIds = ZoneId.SHORT_IDS; // coleção de chave e valor
		System.out.println(shortIds);
		System.out.println(ZoneId.systemDefault()); // zona do sistema operacional
		ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
		System.out.println(tokyoZone);
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		ZonedDateTime zoneDateTime = now.atZone(tokyoZone); // horario de tokyo sem soma
		System.out.println(zoneDateTime);
		
		Instant nowInstant = Instant.now();
		System.out.println(nowInstant);
		ZonedDateTime zoneDateTime2 = nowInstant.atZone(tokyoZone); // horario de Tokyo com soma
		System.out.println(zoneDateTime2);
		
		System.out.println(ZoneOffset.MIN); // max que pode ser adicionado
		System.out.println(ZoneOffset.MAX); // min que pode ser adicionado
		
		ZoneOffset offsetManaus = ZoneOffset.of("-04:00");
		OffsetDateTime offsetDateTime1 = now.atOffset(offsetManaus); // settando o offset
		System.out.println(offsetDateTime1);
		OffsetDateTime offsetDateTime2 = OffsetDateTime.of(now, offsetManaus);
		System.out.println(offsetDateTime2);
		
		OffsetDateTime offsetDateTime3 =  nowInstant.atOffset(offsetManaus); // hora de Manaus
		System.out.println(offsetDateTime3);
		
		JapaneseDate japaneseDate = JapaneseDate.from(LocalDate.now());
		System.out.println(japaneseDate);
		LocalDate meijiEraLocalDate = LocalDate.of(1900, 2, 1);
		JapaneseDate meijiEra = JapaneseDate.from(meijiEraLocalDate);
		System.out.println(meijiEra);
		
		
	}

}

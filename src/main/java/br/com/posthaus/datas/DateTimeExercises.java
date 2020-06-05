package br.com.posthaus.datas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class DateTimeExercises {

	public static void main(String[] args) {
		LocalTime currentIme = LocalTime.now();
		LocalDate today = LocalDate.now();
		LocalDateTime ldt = LocalDateTime.now();
		
		LocalTime lt2 = LocalTime.now(ZoneId.of("America/Chicago")); 
		LocalDate ld3 = LocalDate.now(ZoneId.of("America/Sao_Paulo")); 
		
		LocalDateTime dateTime = LocalDateTime.now(ZoneId.of("America/Los_Angeles"));
	}
	

}

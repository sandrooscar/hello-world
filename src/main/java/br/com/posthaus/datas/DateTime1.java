package br.com.posthaus.datas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class DateTime1 {
	public static void main(String[] args) {
		/*
		 LocalDate = data sem hora
		 LocalTime = hora
		 LocalDateTime = Data e hora
		 MonthDay = dia de um mês
		 YearMonth = Mes e ano 
		 */
		LocalTime t = LocalTime.now(ZoneId.of("America/Chicago"));
		LocalTime t2 = LocalTime.now(ZoneId.of("America/Sao_Paulo"));
		
		System.out.println(t);
		System.out.println(t2);
		
		LocalTime meioDia = LocalTime.of(12, 0);  //hora de ...
		LocalDate natal2019=  LocalDate.of(2019, 12, 25);
	    LocalDate natal2020=  LocalDate.of(2020, Month.DECEMBER, 25);
	    
		LocalDateTime algumMomento = LocalDateTime.of(2014, 12, 25, 12,0); //maior para menor
		LocalDateTime almocoDeNatal = LocalDateTime.of(natal2020, meioDia);

		System.out.println(almocoDeNatal);
	}
}

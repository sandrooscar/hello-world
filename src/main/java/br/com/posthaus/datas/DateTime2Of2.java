package br.com.posthaus.datas;

import java.time.LocalDateTime;
import java.time.MonthDay;
import java.time.temporal.ChronoField;

public class DateTime2Of2 {
	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.of(2020, 5, 29, 12,0); //maior para menor
		System.out.println(ldt.getDayOfMonth());
		System.out.println(ldt.getYear());
		System.out.println(ldt.getMonth());
		System.out.println(ldt.getHour());
		
		System.out.println(ldt.get(ChronoField.DAY_OF_WEEK));  //primeiro dia da semana é segunda-feira
		System.out.println(ldt.get(ChronoField.DAY_OF_MONTH));

		//antes e depois 
		MonthDay dia1 = MonthDay.of(1,1);
		MonthDay dia2 = MonthDay.of(1,2);
		
		System.out.println(dia1.isBefore(dia2));
		System.out.println(dia1.isAfter(dia2));
	}
}

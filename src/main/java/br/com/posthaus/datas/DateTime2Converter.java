package br.com.posthaus.datas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTime2Converter {

	public static void main(String[] args) {
		
		LocalDateTime ldt = LocalDateTime.now();
		LocalDate ld = ldt.toLocalDate();
		LocalTime lt = ldt.toLocalTime();
		
		//data com a hora
		LocalDateTime ldtAtTime = ld.atTime(lt);
		System.out.println(ldtAtTime);

		//hora com a data
		LocalDateTime ldtAtDate = lt.atDate(ld);
		System.out.println(ldtAtDate);
	}

}

package br.com.posthaus.datas;

import java.util.Calendar;
import java.util.Date;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

public class DateTimeConverterDate {

	public static void main(String[] args) {
		
		//Date -> Instant -> LocalDateTime.ofInstant
		Date d = new Date();
		Instant i = d.toInstant();
		LocalDateTime ldt = LocalDateTime.ofInstant(i, ZoneId.systemDefault());
		System.out.println(ldt);

		//Calendar -> Instant -> LocalDateTime.ofInstant
		Calendar c = Calendar.getInstance();
		Instant ic = c.toInstant();
		LocalDateTime ldtc = LocalDateTime.ofInstant(ic, ZoneId.systemDefault());
		System.out.println(ldtc);
		
		//LocalDateTime -> Instant -> Date.from
		//data somente com o fuso, sem a localidade
		Instant ildt = ldt.toInstant(ZoneOffset.UTC);		
		Date dateOfldt = Date.from(ildt);
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dateOfldt);
	}

}

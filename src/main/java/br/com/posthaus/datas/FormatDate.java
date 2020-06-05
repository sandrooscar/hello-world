package br.com.posthaus.datas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatDate {

	public static void main(String[] args) {
		LocalDateTime agora = LocalDateTime.now();
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(fmt.format(agora));
		System.out.println(agora.format(fmt));
		
		LocalDate d1 = LocalDate.parse("15/10/1995", fmt);
		System.out.println(d1);
		System.out.println(fmt.format(d1));
	}

}

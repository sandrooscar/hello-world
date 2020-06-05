package br.com.posthaus.datas;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateTime3CaculateDate {

	public static void main(String[] args) {
		//calculando instantes, maximo em segundos
		Instant m1 = Instant.EPOCH;
		Instant m2 = Instant.now();
		
		long segundos = Duration.between(m1, m2).getSeconds();
		System.out.println(segundos);
		
		LocalDate dataLancamento = LocalDate.of(1995, 8, 24);
		LocalDate agora = LocalDate.now();
		
		//tempo acumulado
		System.out.println(ChronoUnit.YEARS.between(dataLancamento, agora));
		System.out.println(ChronoUnit.MONTHS.between(dataLancamento, agora));
		System.out.println(ChronoUnit.DAYS.between(dataLancamento, agora));

		//tempo fracionado, apresentação amigavel
		Period tempoPassado = Period.between(dataLancamento, agora);
		System.out.println(tempoPassado.getYears());
		System.out.println(tempoPassado.getMonths());
		System.out.println(tempoPassado.getDays());
	}

}

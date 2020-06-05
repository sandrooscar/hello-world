package br.com.posthaus.datas;

import java.time.LocalDate;

public class DateTime2SetPlusMinus {

	public static void main(String[] args) {
		//objeto imutavel, cada manipula��o retorna um novo objeto
		//chamada em cascata
		LocalDate ld = LocalDate.of(2020,05,29);
		LocalDate ld2 = ld.withDayOfMonth(11).withMonth(7);
		System.out.println(ld2);
		
		//adi��o e subtra��o de valores, soma os valores no tempo
		LocalDate data = LocalDate.of(2020, 5, 29).plusDays(5);
		System.out.println(data);
		
		data = data.plusMonths(6);
		System.out.println(data);
		
		data = data.minusYears(5); 
		System.out.println(data);
	}

}

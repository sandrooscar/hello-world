package br.com.posthaus.metodo.referencia;

import java.util.function.Supplier;

import br.com.posthaus.modelo.Pedido;

public class MetodoReferencia4Constructor {

	public static void main(String[] args) {
		Supplier<Pedido> metodoRefNew = Pedido::new;
		System.out.println(metodoRefNew.get().toString());
		
		//como ficaria em lambda?
		
	}

}

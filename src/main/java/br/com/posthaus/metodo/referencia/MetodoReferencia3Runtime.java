package br.com.posthaus.metodo.referencia;

import java.util.function.Predicate;

import br.com.posthaus.modelo.Pedido;

public class MetodoReferencia3Runtime {

	public static void main(String[] args) {
		Pedido pedido = Pedido.listar().get(0); 
		System.out.println(pedido);
		
		Predicate<Pedido> metodoRef = Pedido::isPedidoParcelado;
		System.out.println(metodoRef.test(pedido));
		
		//como ficaria em lambda?
	}

}

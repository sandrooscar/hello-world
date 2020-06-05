package br.com.posthaus.metodo.referencia;

import java.util.function.Predicate;

import br.com.posthaus.modelo.Pedido;

public class MetodoReferencia2Instancia {

	public static void main(String[] args) {
		Pedido p = Pedido.listar().get(0);
		
		Predicate<Integer> metodoPedidoEhDe = p::pedidoEhDe;
		System.out.println(metodoPedidoEhDe.test(2014));
		
		Predicate<Integer> lambdaPedidoEhDe = ano -> p.getDtPedido().getYear() == ano ; 
		System.out.println(lambdaPedidoEhDe.test(2019));

	}

}

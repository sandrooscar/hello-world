package br.com.posthaus.metodo.referencia;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import br.com.posthaus.modelo.Pedido;

public class MetodoReferencia1Estatico {

	public static void main(String[] args) {
		Comparator<Pedido> c = PedidoHelper::compararPorValor;
		
		List<Pedido> pedidos = Pedido.listar();
		pedidos.sort(c);
		System.out.println(pedidos);
		
		Consumer<List<Pedido>> methodRef1 = PedidoHelper::imprimirPedidos;
		methodRef1.accept(pedidos);
		
		Consumer<List<Pedido>> lambda = l -> l.forEach(p -> System.out.print(p));
		lambda.accept(pedidos);
	}

}

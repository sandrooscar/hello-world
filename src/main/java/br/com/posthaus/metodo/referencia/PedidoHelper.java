package br.com.posthaus.metodo.referencia;

import java.util.List;

import br.com.posthaus.modelo.Pedido;

public class PedidoHelper {
	public static int compararPorValor(Pedido p1, Pedido p2){
		return Double.compare(p1.getTotalPedido(), p2.getTotalPedido());
	}
	
	public static void imprimirPedidos(List<Pedido> pedidos){
		pedidos.forEach(p -> System.out.println(p));
	}
}

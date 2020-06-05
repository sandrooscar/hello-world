package br.com.posthaus.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import br.com.posthaus.modelo.Pedido;

public class Lambda2 {

	public static void main(String[] args) {
		//(parametros) -> { codigo } 
		Predicate<Pedido> pedidos2020 = (Pedido pedido) -> { return (pedido.getDtPedido().getYear() == 2020);};
		List<Pedido> pedidos = filtro(Pedido.listar(), pedidos2020);
		System.out.println(pedidos);
	}

	public static List<Pedido> filtro(List<Pedido> pedidos, Predicate<Pedido> filtro){
		List<Pedido> resultado = new ArrayList<>();
		for (Pedido pedido : pedidos) {
			if (filtro.test(pedido)){
				resultado.add(pedido);
			}
		}
		return resultado;
	}
}

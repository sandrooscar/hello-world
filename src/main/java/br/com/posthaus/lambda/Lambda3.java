package br.com.posthaus.lambda;

import java.time.Month;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

import br.com.posthaus.modelo.Pedido;

public class Lambda3 {

	public static void main(String[] args) {

		List<Pedido> pedidos = filtro(Pedido.listar(), (Pedido p) ->{ return p.getDtPedido().getYear() == 2020;});
		System.out.println(pedidos);
		System.out.println("\n-----\n");
		
		List<Pedido> pedidos202006 = filtro(Pedido.listar(), p -> p.getDtPedido().getYear() == 2020 && p.getDtPedido().getMonth() == Month.JUNE);
		System.out.println(pedidos202006);
		System.out.println("\n-----\n");

		List<Pedido> pedidos202006maior1000 = filtro(Pedido.listar(), p -> p.getDtPedido().getYear() == 2020 && p.getDtPedido().getMonth() == Month.JUNE && p.getTotalPedido() > 1000);
		System.out.println(pedidos202006maior1000);
		System.out.println("\n-----\n");
		
		List<Pedido> lista = Pedido.listar();
		lista.sort((p1, p2)-> p1.getDtPedido().isAfter(p2.getDtPedido()) ? 1 : p1.getDtPedido().isBefore(p2.getDtPedido())? -1 : 0);
		System.out.println(lista);
		System.out.println("\n-----\n");
		
		Comparator<Pedido> comparator= (Pedido p1, Pedido p2) -> p1.getDtPedido().isAfter(p2.getDtPedido()) ? -1 : p1.getDtPedido().isBefore(p2.getDtPedido())? 1 : 0;
		lista.sort(comparator);
		System.out.println(lista);
		
		System.out.println("\n-----\n");
		System.out.println("\nlista.forEach\n");
		lista.forEach(p->System.out.print(p));
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

package br.com.posthaus.lambda;

import java.util.ArrayList;
import java.util.List;

import br.com.posthaus.modelo.Pedido;

interface Filtro<T>{
	boolean test(T pedido);
}

public class FuncaoAnonima {

	public static List<Pedido> filtro(List<Pedido> pedidos, Filtro<Pedido> filtro){
		List<Pedido> resultado = new ArrayList<>();
		for (Pedido pedido : pedidos) {
			if (filtro.test(pedido)){
				resultado.add(pedido);
			}
		}
		return resultado;
	}

	public static void main(String[] args) {
		Filtro<Pedido> filtroAno2020 = new Filtro<Pedido>(){
			@Override
			public boolean test(Pedido pedido) {
				return (pedido.getDtPedido().getYear() == 2020);
			}
		};
		
	   System.out.println(filtro(Pedido.listar(), filtroAno2020));	
	}

}

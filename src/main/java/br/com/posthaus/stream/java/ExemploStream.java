package br.com.posthaus.stream.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import br.com.posthaus.modelo.Pedido;

public class ExemploStream {

	public static void main(String[] args) {
		List<Pedido> pedidos = Pedido.listar();
		pedidos.forEach(p -> System.out.println(p.toString()));
		pedidos.stream()
			.filter(p -> p.getTotalPedido() > 1000)
			.findAny()
			.ifPresent(p -> System.out.println(p.toString()));
		
		Stream<Pedido> st = Stream.of(pedidos.get(0), pedidos.get(1));
		st.map(Pedido::getTotalPedido).forEach(System.out::println);
		System.out.println("---");
		
		List<Pedido> pedidosVazio = new ArrayList<>();
		List<Pedido> listaPedidos1 = Arrays.asList(pedidos.get(0), pedidos.get(1), pedidos.get(2));
		List<Pedido> listaPedidos2 = Arrays.asList(pedidos.get(3));

		
		Stream<List<Pedido>> pedStream = Stream.of(listaPedidos1,pedidosVazio,listaPedidos2);
		pedStream.flatMap(lista -> lista.stream()).mapToDouble(Pedido::getTotalPedido).average().ifPresent(System.out::println);
		
		List<Pedido> pedCollect = pedidos.stream()
				.filter( p -> p.getTotalPedido() > 1500)
				.collect(Collectors.toList());
		System.out.println(pedCollect.size());
		
	       // Creating an empty HashMap 
        HashMap<Integer, Pedido> hash_map = new HashMap<Integer, Pedido>(); 
  
        // Mapping string values to int keys 
        hash_map.put(10, pedidos.get(0)); 
        hash_map.put(15, pedidos.get(1)); 
        hash_map.put(20, pedidos.get(2)); 
  
        // Displaying the HashMap 
        System.out.println("Initial Mappings are: " + hash_map); 
  
        // Using entrySet() to get the set view 
        System.out.println("The set is: " + hash_map.entrySet());
		
		
	}

}

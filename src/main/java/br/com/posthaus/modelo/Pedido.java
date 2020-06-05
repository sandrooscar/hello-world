package br.com.posthaus.modelo;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * @author Sandro Bugmann
 *
 *         DBR Hello World
 */
public class Pedido implements IEntidade {
	private static int nrLoteGlobal = 9000;
	private static int nrSqPediGlobal = 40;
	private static List<Pedido> lista;

	private Integer nrLote;
	private Integer sqPedi;
	private LocalDate dtPedido;
	private double totalPedido;
	private boolean pedidoParcelado;
	@SuppressWarnings("unused")
	private String id;
	
	public Pedido(){
		this(LocalDate.now());
	}
	
	public Pedido(LocalDate dtPedido) {
		this.nrLote = nrLoteGlobal;
		this.sqPedi = nrSqPediGlobal;
		this.dtPedido = dtPedido;
		this.totalPedido = this.sqPedi % 2 == 0 ? Math.random() * 1000 +100 : Math.random() * 1000 + 1001;
		this.pedidoParcelado = this.sqPedi % 2 == 0 ? true : false;
		this.id = gerarId();
		nrLoteGlobal++;
		nrSqPediGlobal++;
	}

	public Integer getNrLote() {
		return nrLote;
	}

	public void setNrLote(Integer nrLote) {
		this.nrLote = nrLote;
	}

	public Integer getSqPedi() {
		return sqPedi;
	}

	public void setSqPedi(Integer sqPedi) {
		this.sqPedi = sqPedi;
	}

	public LocalDate getDtPedido() {
		return dtPedido;
	}

	public void setDtPedido(LocalDate dtPedido) {
		this.dtPedido = dtPedido;
	}


	public static List<Pedido> listar() {
		if (lista == null) {
			lista = Arrays.asList(
					new Pedido(LocalDate.of(2019, 5, 26)),
					new Pedido(LocalDate.of(2019, 6, 27)),
					new Pedido(LocalDate.of(2020, 5, 28)),
					new Pedido(LocalDate.of(2020, 5, 29)),
					new Pedido(LocalDate.of(2020, 5, 30)),
					new Pedido(LocalDate.of(2020, 5, 31)),
					new Pedido(LocalDate.of(2020, 6, 1)),
					new Pedido(LocalDate.of(2020, 6, 2)),
					new Pedido(LocalDate.of(2020, 6, 3)),
					new Pedido(LocalDate.of(2019, 5, 4)),
					new Pedido(LocalDate.of(2019, 5, 5)));
		}
		return lista;
	}

	public double getTotalPedido() {
		return totalPedido;
	}


	
	public boolean pedidoEhDe(Integer ano){
		return this.dtPedido.getYear() == ano;
	}
	
	public boolean isPedidoParcelado(){
		return this.pedidoParcelado;
	}

	@Override
	public String toString() {
		return "Pedido [dtPedido=" + dtPedido + ", totalPedido="
				+ totalPedido + ", pedidoParcelado=" + pedidoParcelado + "]";
	}
}

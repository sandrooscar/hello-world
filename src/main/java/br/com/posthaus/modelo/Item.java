package br.com.posthaus.modelo;
/**
 * 
 * @author Sandro Bugmann
 *
 * DBR Hello World
 */

public class Item implements IEntidade {

	private static int seq = 0;
	private String descricao;
	private Double valor;
	private String id;
	
	
	public Item(String descricao, Double valor) {
		this.descricao = descricao;
		this.valor = valor;
		this.id = gerarId();
		seq++;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}


	@Override
	public String gerarId() {
		return "I->"+seq;
	}

	public String getId() {
		return id;
	}

}

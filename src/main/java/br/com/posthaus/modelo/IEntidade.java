package br.com.posthaus.modelo;

import java.util.UUID;

/**
 * 
 * @author Sandro Bugmann
 *
 * DBR Hello World
 */
public interface IEntidade {
	
	public default String gerarId(){
		return UUID.randomUUID().toString();
	}

}

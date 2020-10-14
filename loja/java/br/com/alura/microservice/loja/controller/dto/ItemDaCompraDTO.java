package br.com.alura.microservice.loja.controller.dto;

public class ItemDaCompraDTO {
	
	private long id;
	
	private int quantiadade;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getQuantiadade() {
		return quantiadade;
	}

	public void setQuantiadade(int quantiadade) {
		this.quantiadade = quantiadade;
	}
	
	
}

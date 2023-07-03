package com.itb.inf2am.comercio.model;

public class Produto {
	
	private Long id;
	private String nome;
	private String descricao;
	private String codigoBarras;
	private double preco;
	private boolean codStatus;
	
	// public : Acesso liberado para todas as classes. tes
	
	// private : Acesso permitido apenas para os membros
	//			 (atributos ou métodos) da própria classe.
	

	// Métodos Setter's e Getter's : Atribuir e recuperar dados
	// dos atributos "RESPECTIVAMENTE"
	// Cada atributo possui o seu método set e o seu método get
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}
	
	public String getCodigoBarras() {
		return codigoBarras;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setCodStatus(boolean codStatus) {
		this.codStatus = codStatus;
	}
	
	public boolean getCodStatus() {
		return codStatus;
	}
}

package br.microservice.gotei13.domain;

public class Shinigami {
	private Divisao divisao;
	private String nome;
	private String hierarquia;
	private String status;
	
	public Shinigami(Divisao divisao, String nome, String hierarquia, String status) {
		this.divisao 	= divisao;
		this.nome 		= nome;
		this.hierarquia = hierarquia;
		this.status 	= status;
	}
	
	public Divisao getDivisao() {
		return divisao;
	}
	public void setDivisao(Divisao divisao) {
		this.divisao = divisao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getHierarquia() {
		return hierarquia;
	}
	public void setHierarquia(String hierarquia) {
		this.hierarquia = hierarquia;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
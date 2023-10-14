package br.com.gulliver.model;

public class Hotel {

	private int id;
	private String nome;
	private String endereco;
	private String cidade;
	private String regiao;
	
	public Hotel() {
		super();
	}

	public Hotel(int id, String nome, String endereco, String cidade, String regiao) {
		super();
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.cidade = cidade;
		this.regiao = regiao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}

	@Override
	public String toString() {
		return "nome=" + nome + ", endereco=" + endereco + ", cidade=" + cidade + ", regiao="
				+ regiao;
	}	
		
}

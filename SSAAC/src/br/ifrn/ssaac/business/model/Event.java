package br.ifrn.ssaac.business.model;

public class Event {
	private long id;
	private String nome;
	private String local;
	
	public Event() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}
}
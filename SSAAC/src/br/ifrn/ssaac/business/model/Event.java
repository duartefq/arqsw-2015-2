package br.ifrn.ssaac.business.model;

public class Event {
	private long id;
	private String nome;
	private String local;
	private String date;
	
	public Event(String nome, String local, String date) {
		super();

		this.nome = nome;
		this.local = local;
		this.date = date;
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

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
}
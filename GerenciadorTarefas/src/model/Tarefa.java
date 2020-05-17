package model;

public class Tarefa implements java.io.Serializable {

private static final long serialVersionUID = 1L;
	
	private int id;
	private String titulo;
	private String descricao;
	private String emailUser;
	
	public Tarefa(int id, String titulo, String descricao, String emailUser) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
		this.emailUser = emailUser;
	}
	
	public Tarefa(String titulo, String descricao, String emailUser) {
		super();
		this.titulo = titulo;
		this.descricao = descricao;
		this.emailUser = emailUser;
	}
	
	public Tarefa() {
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getEmailUser() {
		return emailUser;
	}
	public void setEmailUser(String emailUser) {
		this.emailUser = emailUser;
	}
}
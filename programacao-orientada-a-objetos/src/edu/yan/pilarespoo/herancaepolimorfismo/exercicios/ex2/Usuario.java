package edu.yan.pilarespoo.herancaepolimorfismo.exercicios.ex2;

public abstract class Usuario {
	private String nome;
	private String email;
	private String senha;
	private boolean estadoAdministrador;
	private boolean logado = false;
		
	public Usuario(String nome, String email, String senha) {
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public Boolean getAdministrador() {
		return estadoAdministrador;
	}
	public void setAdministrador(Boolean estadoAdministrador) {
		this.estadoAdministrador = estadoAdministrador;
	}
	
	public boolean fazerLogin(String email, String senha) {
		if(this.email.equals(email) && this.senha.equals(senha)) {
			this.logado = true;
			return true;
		}
		return false;
	}
	
	public boolean fazerLogoff(String email, String senha) {
		if(this.email.equals(email) && this.senha.equals(senha)) {
			this.logado = false;
			return true;
		}
		return false;
	}
	
	public boolean alterarDados(String nome, String email) {
		if(logado) {
			this.nome = nome;
			this.email = email;
			return true;
		}
		return false;
	}
	
	public boolean verificarSeEstaLogado() {
		return this.logado;
	}
}

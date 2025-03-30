package yan.edu.collections.exercicios.set.pesquisa.ex2;

public class Tarefa {
	private String descricao;
	private boolean concluido = false;
	
	public Tarefa(String descricao) {
		// TODO Auto-generated constructor stub
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public boolean isConcluido() {
		return concluido;
	}
	public void setConcluido(boolean concluido) {
		this.concluido = concluido;
	}
	
	
}

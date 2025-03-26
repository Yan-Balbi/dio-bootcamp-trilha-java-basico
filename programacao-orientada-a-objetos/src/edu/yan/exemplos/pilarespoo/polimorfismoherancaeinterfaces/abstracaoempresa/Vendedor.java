package edu.yan.exemplos.pilarespoo.polimorfismoherancaeinterfaces.abstracaoempresa;

public non-sealed class Vendedor extends Empregado{
	private double percentualDeVenda;
	private double quantidadeVendida;

	public Vendedor(String codigo, String nome, String endereco, int idade, double salario, double porcentagemPorVenda, double quantidadeVendida) {
		super(codigo, nome, endereco, idade, salario);
		// TODO Auto-generated constructor stub
		this.percentualDeVenda = porcentagemPorVenda;
		this.setQuantidadeVendida(quantidadeVendida);
	}
	public Vendedor() {

	}
	
	@Override
	public String getCodigo() {
		return "vndr@"+super.getCodigo();
	}
	
	public double getPorcentagemPorVenda() {
		return percentualDeVenda;
	}

	public void setPorcentagemPorVenda(double porcentagemPorVenda) {
		this.percentualDeVenda = porcentagemPorVenda;
	}
	
	public double getQuantidadeVendida() {
		return quantidadeVendida;
	}
	public void setQuantidadeVendida(double quantidadeVendida) {
		this.quantidadeVendida = quantidadeVendida;
	}
	
	@Override
	public double getSalarioCompleto() {
		// TODO Auto-generated method stub
		return getSalario()+ (quantidadeVendida * percentualDeVenda / 100);
	}
	
	
}

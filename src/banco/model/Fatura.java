package banco.model;

import java.util.Date;

public class Fatura {

	private Date dataPagamento;
	private Date dataVencimento;
	private double juros;
	private boolean estado;
	private double total;
	private Cartao cartao;

	public Fatura() {

	}

	public Fatura(Date dataPagamento, Date dataVencimento, double juros, boolean estado, double total) {
		super();
		this.dataPagamento = dataPagamento;
		this.dataVencimento = dataVencimento;
		this.juros = juros;
		this.estado = estado;
		this.total = total;
		
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public double getJuros() {
		return juros;
	}

	public void setJuros(double juros) {
		this.juros = juros;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Cartao getCartao() {
		return cartao;
	}

	public void setCartao(Cartao cartao) {
		this.cartao = cartao;
	}

	@Override
	public String toString() {
		return "Fatura [dataVencimento=" + dataVencimento + ", estado=" + estado + ", total=" + total + "]";
	}
	
	

}

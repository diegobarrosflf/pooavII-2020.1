package banco.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cartao {

	private int numero;
	private Date vencimento;
	private String nomeCliente;
	private int codigo;
	private String senha;
	private List<Fatura> faturas = new ArrayList<>();
	private Conta conta;

	public Cartao() {

	}

	public Cartao(int numero, Date vencimento, String nomeCliente, int codigo, String senha, Conta conta) {
		super();
		this.numero = numero;
		this.vencimento = vencimento;
		this.nomeCliente = nomeCliente;
		this.codigo = codigo;
		this.senha = senha;
		this.conta = conta;
	}
	
	

	public Cartao(int numero, Date vencimento, String nomeCliente, int codigo, String senha) {
		super();
		this.numero = numero;
		this.vencimento = vencimento;
		this.nomeCliente = nomeCliente;
		this.codigo = codigo;
		this.senha = senha;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Date getVencimento() {
		return vencimento;
	}

	public void setVencimento(Date vencimento) {
		this.vencimento = vencimento;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public List<Fatura> getFaturas() {
		return faturas;
	}

	public void setFaturas(List<Fatura> faturas) {
		this.faturas = faturas;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	@Override
	public String toString() {
		return "Cartao [numero=" + numero + ", vencimento=" + vencimento + "]";
	}
	
	

}

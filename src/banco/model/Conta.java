package banco.model;

import java.util.ArrayList;
import java.util.List;

public class Conta {

	private int numero;
	private double saldo;
	private boolean estado;

	private Categoria categoria;
	private Cliente cliente;
	private List<Cartao> cartoes = new ArrayList<>();

	public Conta() {

	}

	public Conta(int numero, double saldo, boolean estado, Categoria categoria, Cliente cliente) {
		super();
		this.numero = numero;
		this.saldo = saldo;
		this.estado = estado;
		this.categoria = categoria;
		this.cliente = cliente;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Cartao> getCartoes() {
		return cartoes;
	}

	public void setCartoes(List<Cartao> cartoes) {
		this.cartoes = cartoes;
	}

	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", saldo=" + saldo + ", estado=" + estado + "]";
	}

	
}

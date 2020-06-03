package banco.model;

import java.util.ArrayList;
import java.util.List;

public class Categoria {

	private String nome;
	private List<Conta> contas = new ArrayList<>();

	public Categoria() {
	}

	public Categoria(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	@Override
	public String toString() {
		return "Categoria [nome=" + nome + "]";
	}

	
}

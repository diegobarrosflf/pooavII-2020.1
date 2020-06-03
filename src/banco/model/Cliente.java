package banco.model;

public class Cliente {

	private String nome;
	private String telefone;
	private String email;
	private Conta conta;

	public Cliente() {

	}

	public Cliente(String nome, String telefone, String email, Conta conta) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.conta = conta;
	}
	
	public Cliente(String nome, String telefone, String email) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.conta = conta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + "]";
	}
	
	

}

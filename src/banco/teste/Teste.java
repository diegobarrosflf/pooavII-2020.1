package banco.teste;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import banco.model.Cartao;
import banco.model.Categoria;
import banco.model.Cliente;
import banco.model.Conta;
import banco.model.Endereco;
import banco.model.Fatura;

public class Teste {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Categoria cat1 = new Categoria("Comum");
		Categoria cat2 = new Categoria("Premium");
		Categoria cat3 = new Categoria("Master");
		
		Endereco end1 = new Endereco("Rua A", "06", "Pici","Fortaleza", "Ceara");
		Endereco end2 = new Endereco("Rua B", "16", "Auto do Bode","Fortaleza", "Ceara");
		Endereco end3 = new Endereco("Rua C", "02", "Aldeota","Fortaleza", "Ceara");
		
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		Date date = sdf.parse("2020-06-01");
		
		Fatura f1 = new Fatura(date, date,0,true,1000.0);
		Fatura f2 = new Fatura(date, date,0,true,512.0);
		Fatura f3 = new Fatura(date, date,0,true,1024.0);
		
		
		Cliente cli1 = new Cliente("Diego", "123123123", "diego@gmail.com");
		
		Cartao card = new Cartao(1234,date,cli1.getNome(),321,"poo2020");
		
		Conta conta1 = new Conta(321, 1000.0, true, cat1, cli1);
		
		System.out.println(conta1);
		System.out.println(card);
		System.out.println(cli1);
		System.out.println(f1);
		System.out.println(cat1);
		
		
		
		
		
	}

}

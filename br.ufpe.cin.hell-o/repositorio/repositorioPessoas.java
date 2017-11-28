package repositorio;
import fachada.Fachada;
import main.main;
import java.util.*;
import fachada.Fachada;
import exceptions.*;
import cadastramento.*;
import interfaces.*;
import negocio.*;

public class repositorioPessoas {


	//Lista Pessoas = new Lista();

	public static class Lista {
		private String Nome;
		private String Cpf;
		private String Contato;
		private String Endereco;
		private String Salario;
		private String Conta;
		private String Produtividade;
		private String Totalcompras;
		private String Tipo;
		private String Taxa;
		
		public String getNome() {
			return this.Nome;
		}
		
		public String getCpf() {
			return this.Cpf;
		}
		
		public String getContato() {
			return this.Contato;
		}
		
		public String getProdutividade() {
			return this.Produtividade;
		}
		
		public String getTotalcompras() {
			return this.Totalcompras;
		}
		
		public String getTipo() {
			return this.Tipo;
		}
		
		public String getTaxa() {
			return this.Taxa;
		}
		Lista geral = new Lista();
		Lista nome;
		Lista cpf;
		Lista contato;
		Lista endereco;
		Lista salario;
		Lista conta;
		Lista produtividade;
		Lista totalcompras;
		Lista tipo;
		Lista taxa;

		public Lista() {
			this.nome = null;
			this.cpf = null;
			this.contato = null;
			this.endereco = null;
			this.salario = null;
			this.conta = null;
			this.produtividade = null;
			this.totalcompras = null;
			this.tipo = null;
			this.taxa = null;
			
		}
		
	}
}

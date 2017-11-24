package repositorio;
import fachada.Fachada;
public class repositorioPessoas {

	String Pessoas[][] = new String[100000][10];

	Lista Pessoas = new Lista();

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
		
		public void inserir (String Valor) {
			if (this.nome == null) {
			}
		}
	}
	
	public String getNome() {
		return this.nome;
	}

	public String getCpf() {
		return this.cpf;
	}

	public String getContato() {
		return this.contato;
	}

	public String getProdutividade() {
		return this.produtividade;
	}

	public String getTotalcompras() {
		return this.totalcompras;
	}

	public String getTipo() {
		return this.tipo;
	}

	public String getTaxa() {
		return this.taxa;
	}
}

package classes;

public class Pessoas {

	public static class Pessoa {
		private String nome;
		private String CPF;
		private String endereco;
		private String contato;

		public void nome(String nome) {
			this.nome = nome;
		}

		public String getNome() {

			return this.nome;
		}

		public void CPF(String CPF) {
			this.CPF = CPF;
		}

		public String getCPF() {

			return this.CPF;
		}

		public void endereco(String endereco) {
			this.endereco = endereco;
		}

		public String getEndereco() {

			return this.endereco;
		}

		public void contato(String contato) {
			this.contato = contato;
		}

		public String getContato() {

			return this.contato;
		}

		public Pessoa() {
			this.nome = null;
			this.CPF = null;
			this.endereco = null;
			this.contato = null;

		}
	}

	public class Funcionario extends Pessoa {
		private String produtividade;
		private String salario;
		private Funcionario proximo;

		public void produtividade(String produtividade) {
			this.produtividade = produtividade;
		}

		public String getProdutividade() {

			return this.produtividade;
		}
	}
}

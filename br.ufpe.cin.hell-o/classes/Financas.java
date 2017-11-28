package classes;

public class Financas {

	abstract static class financass {
		private String tipo;
		private String valor;

		public void tipo(String tipo) {
			this.tipo = tipo;
		}

		public String getTipo() {

			return this.tipo;
		}

		public void valor(String valor) {
			this.valor = valor;
		}

		public String getValor() {

			return this.valor;
		}

		public financass() {
			this.tipo = null;
			this.valor = null;

		}
	}

	public class Lucro extends financass {

		private String arrecadacao;
		private Lucro proximo;

		public void arrecadacao(String arrecadacao) {
			this.arrecadacao = arrecadacao;
		}

		public String getArrecadacao() {

			return this.arrecadacao;
		}

		

	public class despesa extends financass {

		private String contadestinatario;
		private despesa proximo;

		public void contadestinatario(String contadestinatario) {
			this.contadestinatario = contadestinatario;
		}

		public String getContadestinatario() {

			return this.contadestinatario;
		}

		

	}

}

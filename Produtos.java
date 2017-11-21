package classes;

public class Produtos {
	private String Preco;
	private String Qualidade;
	private String Marca;

	public Produtos() {
		this.Preco = null;
		this.Qualidade = null;
		this.Marca = null;
	}

	public void Preco(String Preco) {
		this.Preco = Preco;
	}

	public String getPreco() {
		return this.Preco;
	}

	public void Qualidade(String Qualidade) {
		this.Qualidade = Qualidade;
	}

	public String getQualidade() {
		return this.Qualidade;
	}

	public void Marca(String Marca) {
		this.Marca = Marca;
	}

	public String getMarca() {
		return this.Marca;
	}

	public class Roupa extends Produtos {
		private String Time;
		private String Versao;
		private String Tamanho;

		public Roupa() {
			this.Time = null;
			this.Versao = null;
			this.Tamanho = null;
		}

		public void Time(String Time) {
			this.Time = Time;
		}

		public String Time() {
			return this.Time;
		}

		public void Versao(String Versao) {
			this.Versao = Versao;
		}

		public String Versao() {
			return this.Versao;
		}

		public void Tamanho(String Tamanho) {
			this.Tamanho = Tamanho;
		}

		public String Tamanho() {
			return this.Tamanho;
		}

		// depois converter pra numero, e se o cara jogar uma letra
		// da um throws not a number exception

	}

	public class Calcados extends Produtos {
		private String Cor;
		private String Tamanho;

		public void Cor(String Cor) {
			this.Cor = Cor;
		}

		public String getCor() {
			return this.Cor;
		}

		public void Tamanho(String Tamanho) {
			this.Tamanho = Tamanho;
		}

		public String getTamanho() {
			return this.Tamanho;
		}
	}
}

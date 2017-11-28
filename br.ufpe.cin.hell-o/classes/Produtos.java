package classes;

public class Produtos {
	
	private String Preco;
	private String Nome;
	private String Marca;
	private String Tamanho;
	
	
	public void Preco(String Preco) {
		this.Preco = Preco;
	}

	public String getPreco() {
		return this.Preco;
	}

	public void Tamanho(String Tamanho) {
		this.Qualidade = Tamanho;
	}

	public String getTamanho() {
		return this.Tamanho;
	}

	public void Nome(String Nome) {
		this.Nome = Nome;
	}

	public String getNome() {
		return this.Nome;
	}
	
	
	public void Marca(String Marca) {
		this.Marca = Marca;
	}

	public String getMarca() {
		return this.Marca;
	}

	public class Roupa extends Produtos {
		private String Time;
		
	
		public void Time(String Time) {
			this.Time = Time;
		}

		public String Time() {
			return this.Time;
		}

		
	

		// depois converter pra numero, e se o cara jogar uma letra
		// da um throws not a number exception

	}

	public class Calcados extends Produtos {
		private String Cor;
		

		public void Cor(String Cor) {
			this.Cor = Cor;
		}

		public String getCor() {
			return this.Cor;
		}

		
	}
}

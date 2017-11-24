package repositorio;

public class repositorioFinancas {

	String Financas [] [] = new String [100000] [4];
	
	Lista Financas = new Lista();
	
	public static class Lista {
		private String tipo;
		private String valor;
		private String cadernetacontas;
		private String contadestinatario;
	}
	
	public String getTipo () {
		return this.tipo;
	}
	public String getValor () {
		return this.valor;
	}
	public String getCadernetacontas () {
		return this.cadernetacontas();
	}
	public String Contadestinatario() {
		return this.contadestinatario;
	}
}

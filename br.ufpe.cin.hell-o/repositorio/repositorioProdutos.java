package repositorio;
import Fachada.Fachada;
import main.main;

public class repositorioProdutos {

	
	
	public static class Lista{
		private String preco;
		private String qualidade;
		private String marca;
		private String cor;
		private String tamanhoC;
		private String time;
		private String versao;
		private String tamanhoR;
		
		public String getPreco () {
		return this.preco;
	}
	public String getQualidade() {
		return this.qualidade;
	}
	public String getMarca() {
		return this.marca;
	}
	public String getCor() {
		return this.cor;
	}
	public String getTamanhoC(){
		return this.tamanhoC;
	}
	public String getTime() {
		return this.time;
	}
	public String getVersao() {
		return this.versao;
	}
	public String getTamanhoR() {
		return this.tamanhoR;
	}
	}
	
	
}

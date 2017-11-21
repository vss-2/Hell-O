package repositorio;

public class repositorioProdutos {

	String Produtos [] [] = new String [100000][8];
	
	public static class Lista{
		private String preco;
		private String qualidade;
		private String marca;
		private String cor;
		private String tamanhoC;
		private String time;
		private String versao;
		private String tamanhoR;
	}
	
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
		return this.tamanho;
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

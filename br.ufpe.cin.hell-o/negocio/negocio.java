import main.main;
public class negocio {

	private Pessoas Cliente;
	private Pessoas Funcionario;
	private Pessoas Transportador;
	private Produtos Roupa;
	private Produtos Calcado;
	private Financas Lucro;
	private Financas Despesa;

	public void fazerCompra() {
		Cliente = new Pessoas();
		Funcionario = new Pessoas();
		Transportador = new Pessoas();
		Lucro = new Financas();
	}

	public void pagarTransporte() {
		Transportador = new Pesssoas();
		Despesa = new Financas();
	}

	public void reporEstoque() {
		Roupa = new Produto();
		Calcado = new Produto();
	}

	public void pagarContas() {
		Despesa = new Financa();
	}
	
}

package negocio;
import main.main;
import classes.Financas;
import classes.Pessoas;
import classes.Produtos;
public class negocio {

	private Pessoas Cliente;
	private Pessoas Funcionario;
	private Pessoas Transportador;
	private Produtos Roupa;
	private Produtos Calcado;
	private Financas Lucro;
	private Financas Despesa;

	public void Negocio(Pessoas Cliente, Pessoas Funcionario, Pessoas Transportador, Produtos Roupa, Produtos Calcado, Financas Lucro, Financas Despesa) {
		this.Cliente = Cliente;
		this.Funcionario = Funcionario;
		this.Transportador = Transportador;
		this.Roupa = Roupa;
		this.Calcado = Calcado;
		this.Lucro = Lucro;
		this.Despesa = Despesa;

	}
	
	public void fazerCompra(Pessoas Cliente) {
		
		this.fazerCompra(Cliente);
		this.pagarFuncionario(Funcionario);
		this.pagarTransporte(Transportador);
		this.lucrar(Lucro);
		
		/*Cliente = new Pessoas();
		Funcionario = new Pessoas();
		Transportador = new Pessoas();
		Lucro = new Financas();
		*/
	}

	public void pagarTransporte(Pessoas Transportador) {
		Transportador = new Pessoas();
		Despesa = new Financas();
	}

	public void reporEstoque(Produtos Roupa) {
		Roupa = new Produtos();
		Calcado = new Produtos();
	}

	public void pagarContas(Financas Despesa) {
		Despesa = new Financas();
	}

	public void pagarFuncionario(Pessoas Funcionario) {
		Despesa = new Financas();
	}
	public void lucrar (Financas Lucro) {
		Lucro = new Financas();
	}
}
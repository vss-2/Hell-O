package repositorio;

public class repositorioPessoasArray {

	static String Pessoas[][] = new String[100000][10];
	static int xp = 0;
	
	public static void preencherFuncionario(String nome, String cpfcnpj, String endereco, String contato, String salario, String conta,
			String string, String string2, String string3) {
		Pessoas[xp][0] = nome;
		Pessoas[xp][1] = cpfcnpj;
		Pessoas[xp][2] = endereco;
		Pessoas[xp][3] = contato;
		Pessoas[xp][4] = salario;
		Pessoas[xp][5] = conta;
		Pessoas[xp][6] = string;
		Pessoas[xp][7] = string2;
		Pessoas[xp][8] = string3;
		xp++;
	}

	public static void preencherCliente(String nome, String cpfcnpj, String endereco, String contato, String string,
			String string2, String cartaocredito, String string3, String string4) {
		Pessoas[xp][0] = nome;
		Pessoas[xp][1] = cpfcnpj;
		Pessoas[xp][2] = endereco;
		Pessoas[xp][3] = contato;
		Pessoas[xp][4] = string;
		Pessoas[xp][5] = string2;
		Pessoas[xp][6] = cartaocredito;
		Pessoas[xp][7] = string3;
		Pessoas[xp][8] = string4;
		xp++;
	}
	
	public static void preencherTransportador(String nome, String cpfcnpj, String endereco, String contato, String string,
			String string2, String string3, String tipo) {
		Pessoas[xp][0] = nome;
		Pessoas[xp][1] = cpfcnpj;
		Pessoas[xp][2] = endereco;
		Pessoas[xp][3] = contato;
		Pessoas[xp][4] = string;
		Pessoas[xp][5] = string2;
		Pessoas[xp][6] = "";
		Pessoas[xp][7] = string3;
		Pessoas[xp][8] = tipo;
		xp++;
	}
}

package cadastramento;

import repositorio.repositorioProdutosArray;

public class CadastroProdutos {

	public static void novoRoupa(String nomep, String preco, String marca, String tamanho, String string, String time) {
		repositorioProdutosArray.preencherRoupa(nomep, preco, marca, tamanho, string, time);
	}

	public static void novoCalcado(String nomep, String preco, String marca, String tamanho, String string, String time) {
		repositorioProdutosArray.preencherCalcado(nomep, preco, marca, tamanho, string, time);
	}

	public static void procurarRoupa(String nomep, String marca, String tamanho, String string, String time) {
		repositorioProdutosArray.procurarRoupa(nomep, marca, tamanho, string, time);
	}
	public static void procurarCalcado(String nomep, String marca, String tamanho, String string, String time) {
		repositorioProdutosArray.procurarRoupa(nomep, marca, tamanho, string, time);
	}

	public static void atualizarRoupa(String nomep, String marca, String tamanho, String string, String time,
			String preco) {
		repositorioProdutosArray.atualizarRoupa(nomep, marca, tamanho, string, time, preco);
	}
	public static void atualizarCalcado(String nomep, String marca, String tamanho, String cor, String string,
			String preco) {
		repositorioProdutosArray.atualizarRoupa(nomep, marca, tamanho, cor, string, preco);
	}

	public static void removerRoupa(String nomep, String preco, String marca, String tamanho, String string,
			String time) {
		repositorioProdutosArray.removerRoupa(nomep, preco, marca, tamanho, string, time);
	}
	public static void removerCalcado(String nomep, String preco, String marca, String tamanho, String cor,
			String string) {
		repositorioProdutosArray.removerRoupa(nomep, preco, marca, tamanho, cor, "");
	}

}

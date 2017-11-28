package repositorio;

import java.util.*;
import exceptions.*;
import cadastramento.*;
import interfaces.*;
import negocio.*;

public class repositorioProdutosArray {

	static String Produtos[][] = new String[100000][8];
	static int xo = 0;

	public static void preencherRoupa(String nomep, String preco, String marca, String tamanho, String string,
			String time) {
		Produtos[xo][0] = nomep;
		Produtos[xo][1] = preco;
		Produtos[xo][2] = marca;
		Produtos[xo][3] = tamanho;
		Produtos[xo][4] = string;
		Produtos[xo][5] = time;
		xo++;
	}

	public static void preencherCalcado(String nomep, String marca, String tamanho, String cor, String string,
			String preco) {
		Produtos[xo][0] = nomep;
		Produtos[xo][1] = preco;
		Produtos[xo][2] = marca;
		Produtos[xo][3] = tamanho;
		Produtos[xo][4] = string;
		Produtos[xo][5] = preco;
		xo++;
	}

	public static boolean procurarRoupa(String nomep, String marca, String tamanho, String string, String time) {
		int ze = 0;
		boolean z3 = false;
		while (Produtos[ze][0] != null) {
			if (Produtos[ze][0] == nomep) {
				z3 = true;
			}
		}
		return z3;
	}

	public static boolean procurarCalcado(String nomep, String marca, String tamanho, String cor, String string,
			String preco) {
		int ze = 0;
		boolean z3 = false;
		while (Produtos[ze][0] != null) {
			if (Produtos[ze][0] == nomep) {
				z3 = true;
			}
		}
		return z3;
	}

	public static void atualizarRoupa(String nomep, String marca, String tamanho, String string, String time,
			String preco) {
		while (Produtos[xo][0] != null) {
			if(Produtos[xo][0] == nomep) {
				Produtos[xo][0] = nomep;
				Produtos[xo][1] = preco;
				Produtos[xo][2] = marca;
				Produtos[xo][3] = tamanho;
				Produtos[xo][4] = string;
				Produtos[xo][5] = time;
			}
			xo++;
		}
	}

	public static void atualizarCalcado(String nomep, String marca, String tamanho, String cor, String string,
			String preco) {
		while (Produtos[xo][0] != null) {
			if(Produtos[xo][0] == nomep) {
				Produtos[xo][0] = nomep;
				Produtos[xo][1] = preco;
				Produtos[xo][2] = marca;
				Produtos[xo][3] = tamanho;
				Produtos[xo][4] = string;
				Produtos[xo][5] = preco;
			}
			xo++;
		}
	}

	public static void removerRoupa(String nomep, String preco, String marca, String tamanho, String string,
			String time) {
		while (Produtos[xo][0] != null) {
			if(Produtos[xo][0] == nomep) {
				Produtos[xo][0] = "removido";
				Produtos[xo][1] = "removido";
				Produtos[xo][2] = "removido";
				Produtos[xo][3] = "removido";
				Produtos[xo][4] = "removido";
				Produtos[xo][5] = "removido";
			}
			xo++;
		}
	}

	public static void removerCalcado(String nomep, String marca, String tamanho, String cor, String string,
			String preco) {
		while (Produtos[xo][0] != null) {
			if(Produtos[xo][0] == nomep) {
				Produtos[xo][0] = "removido";
				Produtos[xo][1] = "removido";
				Produtos[xo][2] = "removido";
				Produtos[xo][3] = "removido";
				Produtos[xo][4] = "removido";
				Produtos[xo][5] = "removido";
			}
			xo++;
		}
	}
}


package repositorio;

import java.util.*;
import fachada.Fachada;
import exceptions.*;
import cadastramento.*;
import interfaces.*;
import negocio.*;

public class repositorioFinancasArray {

	static String Financas[][] = new String[100000][4];
	static int x = 0;

	public static void preencherLucro(String tipof, String valor, String i, String string) {
		Financas[x][0] = tipof;
		Financas[x][1] = valor;
		Financas[x][2] = i;
		Financas[x][3] = string;
		x++;
	}

	public static boolean procurar(String tipof) {
		int z = 0;
		boolean z1 = false;
		while (Financas[x][0] != null) {
			if (Financas[z][0] == tipof) {
				z1 = true;
			} else {
			}
		}
		return z1;
	}

	public static void preencherPagamento(String tipof, String valor, String string, String contadestinatario) {
		Financas [x] [0] = tipof;
		Financas [x] [1] = valor;
		Financas [x] [2] = string;
		Financas [x] [3] = string;
		x++;	
	}

	public static boolean procurarPagamento(String contadestinatario) {
		int z = 0;
		boolean z1 = false;
		while (Financas[z][0] != null) {
			if (Financas[z][0] == contadestinatario) {
				z1 = true;
			}
		}
		return z1;
	}
}
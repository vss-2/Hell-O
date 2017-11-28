package repositorio;

import java.util.*;
import exceptions.*;
import cadastramento.*;
import interfaces.*;
import negocio.*;

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
	
	public static boolean procurarPessoa(String cpfcnpj) {
		boolean boo = false;
		int x3 = 0;
		while (Pessoas[x3][1] != null) {
			if(Pessoas[x3][1].equals(cpfcnpj)) {
				boo = true;
			}else {
				boo = false;
			}
			x3++;
		}
		return boo;
	}	
	
	public static void removerPessoa (String cpfcnpj) {
		int x3 = 0;
		while (Pessoas[x3][2] != null) {
			if(Pessoas[xp][x3].equals(cpfcnpj)) {
				Pessoas[xp][0] = "removido";
				Pessoas[xp][1] = "removido";
				Pessoas[xp][2] = "removido";
				Pessoas[xp][3] = "removido";
				Pessoas[xp][4] = "removido";
				Pessoas[xp][5] = "removido";
				Pessoas[xp][6] = "removido";
				Pessoas[xp][7] = "removido";
				Pessoas[xp][8] = "removido";
			}
			x3++;
		}
	}
	
	public static void atualizarPessoa (String cpfcnpj, String cartaocredito) {
		int x4 = 0;
		while (Pessoas[x4][1] != null) {
			if(Pessoas[x4][1].equals(cpfcnpj)) {
				
				
				Pessoas[x4][6] = cartaocredito;
				
				x4++;
			}
			
	}
}
}

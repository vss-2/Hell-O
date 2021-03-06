package cadastramento;

import java.util.*;
import exceptions.*;
import interfaces.*;
import negocio.*;
import repositorio.*;

public class CadastroPessoas {

	public static void novoFuncionario(String nome, String cpfcnpj, String endereco, String contato, String salario,
			String conta, String string, String string2, String string3) {
		repositorioPessoasArray.preencherFuncionario(nome, cpfcnpj, endereco, contato, salario, conta, string, string2, string3);
	}

	public static void novoCliente(String nome, String cpfcnpj, String endereco, String contato, String string,
			String string2, String cartaocredito, String string3, String string4) {
		repositorioPessoasArray.preencherCliente(nome, cpfcnpj, endereco, contato, string, string2, cartaocredito, string3, string4);
	}

	public static void Transportador(String nome, String cpfcnpj, String endereco, String contato, String string,
			String string2, String string3, String tipo) {
		repositorioPessoasArray.preencherTransportador(nome, cpfcnpj, endereco, contato, string, string2, string3, tipo);

	}

}

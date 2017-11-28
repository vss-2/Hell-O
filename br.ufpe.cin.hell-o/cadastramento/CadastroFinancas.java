package cadastramento;

import java.util.*;
import Fachada.Fachada;
import exceptions.*;
import interfaces.*;
import negocios.*;
import repositorio.*;

public class CadastroFinancas {

	public static void novoLucro(String tipof, String valor, int i, String string) {
		String i2 = i + "";
			repositorioFinancasArray.preencherLucro(tipof, valor, i2, string);
		}

	public static void procurarLucro(String tipof) {
		boolean achou = repositorioFinancasArray.procurar(tipof);
	}

	public static void novoPagamento(String tipof, String valor, String string, String contadestinatario) {
		repositorioFinancasArray.preencherPagamento(tipof, valor, string, contadestinatario);
	}

	public static void procurarPagamento(String contadestinatario) {
		repositorioFinancasArray.procurarPagamento(contadestinatario);
	}

}

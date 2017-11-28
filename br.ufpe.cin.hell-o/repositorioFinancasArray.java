package repositorio;

import java.util.*;
import Fachada.Fachada;
import exceptions.*;
import cadastramento.*;
import interfaces.*;
import negocios.*;

public class repositorioFinancasArray {
	
	static String Financas [] [] = new String [100000] [4];
	static int x = 0;
	public static void preencher(String tipof, String valor, String i, String string) {
	Financas [x] [0] = tipof;
	Financas [x] [1] = valor;
	Financas [x] [2] = i;
	Financas [x] [3] = string;
	x++;
	}
	
	public static boolean procurar(String tipof) {
		int z = 0;
		while(Financas [x][0] != null) {
			if (Financas [z][0] == tipof) {
				
			} else {
				
			}
		}
		return false;
	}
}

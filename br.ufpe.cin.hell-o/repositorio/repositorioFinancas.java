package repositorio;

import java.util.*;
import fachada.Fachada;
import exceptions.*;
import cadastramento.*;
import interfaces.*;
import negocio.*;

public class repositorioFinancas {
	
	public static class Lista {
		private String tipo;
		private String valor;
		private String cadernetacontas;
		private String contadestinatario;
		
		public String getTipo () {
			return this.tipo;
		}
		public String getValor () {
			return this.valor;
		}
		public String getCadernetacontas () {
			return this.cadernetacontas;
		}
		public String Contadestinatario() {
			return this.contadestinatario;
		}
	}
	
}

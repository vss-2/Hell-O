package classes;

import java.util.*;
import exceptions.*;
import cadastramento.*;
import interfaces.*;
import negocio.*;
import repositorio.*;

public class Pessoas {

	abstract static class Pessoa {
		private String nome;
		private String CPF;
		private String endereco;
		private String contato;

		public void nome(String nome) {
			this.nome = nome;
		}

		public String getNome() {

			return this.nome;
		}

		public void CPF(String CPF) {
			this.CPF = CPF;
		}

		public String getCPF() {

			return this.CPF;
		}

		public void endereco(String endereco) {
			this.endereco = endereco;
		}

		public String getEndereco() {

			return this.endereco;
		}

		public void contato(String contato) {
			this.contato = contato;
		}

		public String getContato() {

			return this.contato;
		}

		public Pessoa() {
			this.nome = null;
			this.CPF = null;
			this.endereco = null;
			this.contato = null;

		}
	}

	public class Cliente extends Pessoa {
		private String creditcard;
		
		private Cliente proximo;

		public void creditcard(String creditcard) {
			this.creditcard = creditcard;
		}

		public String getCreditcard() {

			return this.creditcard;
		}
		
		
		
		public class Transporte extends Pessoa {
		private String taxa;
		private String tipo;
		private Transporte proximo;

		public void taxa(String taxa) {
			this.taxa = taxa;
		}

		public String getTaxa() {

			return this.taxa;
		}
			
	 	public void tipo(String tipo) {
			this.tipo = tipo;
		}

		public String getTipo() {

			return this.tipo;
		}
			
			
			
			
			
			
			public class Funcionario extends Pessoa {
		private String produtividade;
		private String salario;
		private Funcionario proximo;

		public void produtividade(String produtividade) {
			this.produtividade = produtividade;
		}

		public String getProdutividade() {

			return this.produtividade;
		}
	}
}
	}}

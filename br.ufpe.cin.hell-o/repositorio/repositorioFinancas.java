package repositorio;

import java.util.*;
import exceptions.*;
import cadastramento.*;
import interfaces.*;
import negocio.*;

public class repositorioFinancas {
    private Integer id;
	private String tipof;
	private String valor;
	private String cadernetacontas;
	private String contadestinatario;
	private repositorioFinancas proximo;  
	  
    public repositorioFinancas() {
		this.id = null;
        this.tipof = null;  
		this.valor = null;
		this.cadernetacontas = null;
		this.contadestinatario = null;
		this.proximo = null;	
    }
	   
    public void inserirFinancas( String tipof, String valor, String cadernetacontas, String contadestinatario) {
        if (this.valor == null) {
            this.id = id;
			this.tipof = tipof;  
			this.valor = valor;
			this.cadernetacontas = cadernetacontas;
			this.contadestinatario = contadestinatario;
            this.proximo = new repositorioFinancas();
        } else {
            this.proximo.inserirFinancas(tipof, valor, cadernetacontas, contadestinatario);
        }
    }

	public String repositorioFinancas(String cpf) {
		String r = "";
		if (this.valor != null) {
			if (this.valor.equals(valor)) {
				r = this.valor;	
			} else {
				this.proximo.repositorioFinancas(cpf);
			}	
		} else {
			//CPF nao encontrado	
		}
		return r;
	}
  }
package repositorio;
import main.main;
import java.util.*;
import exceptions.*;
import cadastramento.*;
import interfaces.*;
import negocio.*;

public class repositorioProdutos {
    private Integer id;
	private String nomep;
	private String preco;
	private String marca;
	private String cor;
	private String tamanho;
	private String time;
	private repositorioProdutos proximo;  
	  
    public repositorioProdutos() {
		this.id = null;
        this.nomep = null;  
		this.preco = null;
		this.marca = null;
		this.cor = null;
		this.tamanho = null;
		this.time = null;
		this.proximo = null;	
    }
	   
    public void inserirProdutos(Integer id, String nomep, String preco, String marca, String cor, String tamanho, String time) {
        if (this.id == null) {
            this.id = id;
			this.nomep = nomep;  
			this.preco = preco;
			this.marca = marca;
			this.cor = cor;
			this.tamanho = tamanho;
			this.time = time;
            this.proximo = new repositorioProdutos();
        } else {
            this.proximo.inserirProdutos(id, nomep, preco, marca, cor, tamanho, time);
        }
    }

	public boolean procurarProdutos(String nomep, String marca, String cor, String tamanho, String time) {
		boolean f = false;
		if (this.id != null) {
            if ((this.nomep.equals(nomep) && this.marca.equals(marca) && this.tamanho.equals(tamanho)) && (this.cor.equals(cor) || this.time.equals(time))) {
				f = true;
            } else {
                this.proximo.atualizarProdutos(nomep, preco, marca, cor, tamanho, time);
            }
		} else {
			f = false;
		}
		return f;
    }
	
	public void atualizarProdutos(String nomep, String preco, String marca, String cor, String tamanho, String time) {
        if (this.id != null) {
            if ((this.nomep.equals(nomep) && this.marca.equals(marca) && this.tamanho.equals(tamanho)) && (this.cor.equals(cor) || this.time.equals(time))) {
				this.preco = preco;
            } else {
                this.proximo.atualizarProdutos(nomep, preco, marca, cor, tamanho, time);
            }
        } else {
			//produto n�o encontrado	
		}
    }
	
	public void removerProdutos(String nomep, String marca, String cor, String tamanho, String time) {
        if (this.id != null) {
            if ((this.nomep.equals(nomep) && this.marca.equals(marca) && this.tamanho.equals(tamanho)) && (this.cor.equals(cor) || this.time.equals(time))) {
                this.id = this.proximo.id;
				this.nomep = this.proximo.nomep;  
				this.preco = this.proximo.preco;
				this.marca = this.proximo.marca;
				this.cor = this.proximo.cor;
				this.tamanho = this.proximo.tamanho;
				this.time = this.proximo.time;
				this.proximo = this.proximo.proximo;
            } else {
                this.proximo.removerProdutos(nomep, marca, cor, tamanho, time);
            }
        } else {
			//produto n�o encontrado	
		}
    }
  }

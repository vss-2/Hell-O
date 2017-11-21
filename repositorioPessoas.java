package repositorio;
import fachada.Fachada;
public class repositorioPessoas {

	String Pessoas[][] = new String[100000][10];

	 public static class ListaPessoas {
		    private Integer id;
			private String nome;
			private String cpf;
			private String endereco;
			private String contato;
			private String salario;
		    private String conta;
			private String totalcompras;
			private String taxa;
			private String tipo;
			private ListaPessoas proximo;  
			  
		    public void Lista() {
				this.id = null;
		        this.nome = null;  
				this.cpf = null;
				this.endereco = null;
				this.contato = null;
				this.salario = null;
		        this.conta = null;
				this.totalcompras = null;
				this.taxa = null;
				this.tipo = null;
				this.proximo = null;	
		    }
			   
		    public void inserirPessoas(Integer id, String nome, String cpf, String endereco, String contato, String salario, String conta, String totalcompras, String taxa, String tipo) {
		        if (this.id == null) {
		            this.id = id;
					this.nome = nome;  
					this.cpf = cpf;
					this.endereco = endereco;
					this.contato = contato;
					this.salario = salario;
					this.conta = conta;
					this.totalcompras = totalcompras;
					this.taxa = taxa;
					this.tipo = tipo;
		            this.proximo = new ListaPessoas();
		        } else {
		            this.proximo.inserirPessoas(id, nome, cpf, endereco, contato, salario, conta, totalcompras, taxa, tipo);
		        }
		    }

			public boolean procurarPessoas(String cpf) {
				if (this.id != null) {
					if (this.cpf.equals(cpf)) {
						return true;	
					} else {
						this.proximo.procurarPessoas(cpf);
					}	
				}
				return false;	
			}

			public void atualizarPessoas(String nome, String cpf, String endereco, String contato, String salario, String conta, String totalcompras, String taxa, String tipo) {
				if (this.id != null) {
					if (this.cpf.equals(cpf)) {
						this.nome = nome;  
						this.endereco = endereco;
						this.contato = contato;
						this.salario = salario;
						this.conta = conta;
						this.totalcompras = totalcompras;
						this.taxa = taxa;
						this.tipo = tipo;	
					}
				}
				//CPF nao encontrado
			}
		    
			public void removerPessoas(String cpf) {
		        if (this.id != null) {
		            if (this.cpf.equals(cpf)) {
		                this.id = this.proximo.id;
						this.nome = this.proximo.nome;  
						this.cpf = this.proximo.cpf;
						this.endereco = this.proximo.endereco;
						this.contato = this.proximo.contato;
						this.salario = this.proximo.salario;
						this.conta = this.proximo.conta;
						this.totalcompras = this.proximo.totalcompras;
						this.taxa = this.proximo.taxa;
						this.tipo = this.proximo.tipo;
						this.proximo = this.proximo.proximo;
		            } else {
		                this.proximo.removerPessoas(cpf);
		            }
		        }
				//CPF nao encontrado
		    }	
		  }
}
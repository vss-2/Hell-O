package idai;
import java.util.*;
public class edae {
	
	
	
      
       abstract static class  Pessoa {
        	private String nome;
        	private String CPF;
        	private String endereco;
        	private String contato;
        	
        	public void nome (String nome ) {
        	this.nome = nome;
        	}
        	
        	public String Getnome() {
        		
        		return this.nome;
        	}
        	
        	public void CPF (String CPF ) {
            	this.CPF = CPF;
            	}
            	
            	public String GetCPF() {
            		
            		return this.CPF;
            	}
        	
            	
            	public void endereco (String endereco ) {
            		this.endereco = endereco;
            	}
            	
            	public String Getendereco() {
            		
            		return this.endereco;
            	}
            	
            	
            	public void contato (String contato ) {
                	this.contato = contato;
                	}
                	
                	public String Getcontato() {
                		
                		return this.contato;
                	}
            	
                	
                	
            public Pessoa () {
            this.nome = null;
            this.CPF = null;
            this.endereco = null;
            this.contato = null;
            
            }
       }
        	public class Funcionario extends Pessoa {
        		private String produtividade;
        		private String salario;
        		private Pessoa proximo;
        		

            	public void produtividade (String produtividade ) {
                	this.produtividade = produtividade;
                	}
                	
                	public String Getprodutividade() {
                		
                		return this.produtividade;
                	}
                	
                	public void salario (String salario ) {
                    	this.salario = salario;
                    	}
                    	
                    	public String salario() {
                    		
                    		return this.salario;
                    	}
        		
        		public Funcionario () {
        			
        			this.produtividade = null;
        			this.salario=null;
        			this.proximo = null;
        		}
        	}

        	public class Cliente extends Pessoa {
        		private String Totalcompras;
        		private Pessoa proximo;
        		

            	public void Totalcompras (String Totalcompras ) {
                	this.Totalcompras = Totalcompras;
                	}
                	
                	public String salario() {
                		
                		return this.Totalcompras;
                	}
        		
        		
        		public Cliente () {
        			
        			this.Totalcompras = null;
        			
        			this.proximo = null;
        		}
        }

            
            
       


}
         
       
	            
	   
	           
	            
	        
	        
	

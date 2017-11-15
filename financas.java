package projeto;



public class financas {

	
	 abstract static class  financass {
     	private String tipo;
     	private String valor;
     	
     	
     	public void tipo (String tipo ) {
     	this.tipo = tipo;
     	}
     	
     	public String Gettipo() {
     		
     		return this.tipo;
     	}
     	
     	public void valor (String valor ) {
         	this.valor = valor;
         	}
         	
         	public String Getvalor() {
         		
         		return this.valor;
         	}
     	
         	
         	
             	
         public financass () {
         this.tipo = null;
         this.valor = null;
         
         
         }
    }
	
	 public class Lucro extends financass {
 	
 		private Lucro proximo;
 		

     	
 		
 		public Lucro () {
 			
 			
 			this.proximo = null;
 		}
 		
 	}
	 
	 public class despesa extends financass {
		 	
		 	private String contadestinatario;
	 		private despesa proximo;
	 		
	 		public void contadestinatario (String contadestinatario) {
	 	     	this.contadestinatario = contadestinatario;
	 	     	}
	 	     	
	 	     	public String Gettipo() {
	 	     		
	 	     		return this.contadestinatario;
	 	     	}
	     	
	 		
	 		public despesa () {
	 			
	 			this.contadestinatario = null;
	 			this.proximo = null;
	 		}
	 		
	 	}
	
	
	
}

  public static class ListaFinancas {
    private Integer id;
	private String tipof;
	private String valor;
	private String cadernetacontas;
	private String contadestinatario;
	private ListaFinancas proximo;  
	  
    public ListaFinancas() {
		this.id = null;
        this.tipof = null;  
		this.valor = null;
		this.cadernetacontas = null;
		this.contadestinatario = null;
		this.proximo = null;	
    }
	   
    public void inserirFinancas(Integer id, String tipof, String valor, String cadernetacontas, String contadestinatario) {
        if (this.id == null) {
            this.id = id;
			this.tipof = tipof;  
			this.valor = valor;
			this.cadernetacontas = cadernetacontas;
			this.contadestinatario = contadestinatario;
            this.proximo = new ListaFinancas();
        } else {
            this.proximo.inserirPessoas(id, tipof, valor, cadernetacontas, contadestinatario);
        }
    }

	public static String procurarFinancas(String cpf) {
		if (this.id != null) {
			if (this.cpf.equals(cpf)) {
				return this.conta;	
			} else {
				this.proximo.procurarFinancas(cpf);
			}	
		} else {
			//CPF nao encontrado	
		}
	}
  }
package main;

public interface RepositorioPessoas {
	void inserir(String nome,String  cpfcnpj,String  endereco,String  contato, String a,String b , String cartaocredito, String  t, String  o);
	String procurar(String cpf) throws CpfJaCadastradoException;
	void atualizar(String cpf, String newconta) throws NaoEncontradoException;
	void remover(String cpf) throws NaoEncontradoException;	
}


public interface RepositorioProdutos {
	void inserir(String nomep, String preco, String marca, String tamanho,String undefined, String time  );
	String procurar(String nomep, String marca, String tamanho, String undefined, String time) throws NaoEncontradoException;
	void atualizar(String nomep, String marca, String tamanho, String undefined, String time, String preco) throws NaoEncontradoException;
	void remover(String nomep, String marca, String cor, String tamanho, String time) throws NaoEncontradoException;	
}


public interface RepositorioFinancas {
	void inserir(Integer id, String tipof, String valor, String cadernetacontas, String contadestinatario);
	String procurar(String cpf) throws NaoEncontradoException;
}
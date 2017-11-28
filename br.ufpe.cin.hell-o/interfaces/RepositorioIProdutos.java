package interfaces;

import exceptions.NaoEncontradoException;

public interface RepositorioIProdutos {
	void inserir(String nomep, String preco, String marca, String tamanho,String undefined, String time  );
	String procurar(String nomep, String marca, String tamanho, String undefined, String time) throws NaoEncontradoException;
	void atualizar(String nomep, String marca, String tamanho, String undefined, String time, String preco) throws NaoEncontradoException;
	void remover(String nomep, String marca, String cor, String tamanho, String time) throws NaoEncontradoException;	
}

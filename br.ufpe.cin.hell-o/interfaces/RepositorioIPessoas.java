package interfaces;

import exceptions.CPFJaCadastradoException;
import exceptions.NaoEncontradoException;

public interface RepositorioIPessoas {
	void inserir(String nome,String  cpfcnpj,String  endereco,String  contato, String a,String b , String cartaocredito, String  t, String  o);
	String procurar(String cpf) throws CPFJaCadastradoException;
	void atualizar(String cpf, String newconta) throws NaoEncontradoException;
	void remover(String cpf) throws NaoEncontradoException;	
}

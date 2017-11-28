package interfaces;

import exceptions.NaoEncontradoException;

public interface RepositorioIFinancas {
	void inserir(Integer id, String tipof, String valor, String cadernetacontas, String contadestinatario);
	String procurar(String cpf) throws NaoEncontradoException;
}

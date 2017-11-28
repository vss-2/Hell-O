package interfaces;

import java.util.*;
import exceptions.*;
import cadastramento.*;
import interfaces.*;
import negocio.*;
import repositorio.*;

import exceptions.NaoEncontradoException;

public interface RepositorioIFinancas {
	void inserir(Integer id, String tipof, String valor, String cadernetacontas, String contadestinatario);
	String procurar(boolean cpf) throws NaoEncontradoException;
}

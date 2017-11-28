package exceptions;

import java.util.*;
import exceptions.*;
import cadastramento.*;
import classes.Pessoas;
import interfaces.*;
import negocio.*;
import repositorio.*;
import repositorio.*;

public class CPFJaCadastradoException extends Exception{

	public CPFJaCadastradoException () {
		super("CPFJaCadastrado");
	}
}

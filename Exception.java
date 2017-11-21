package exception;

public class Exception {

	public class CorInvalidaException extends Exception {

		public CorInvalidaException() {
			super("CorInvalida");
		}
	}

	public class NomeInvalidoException extends Exception {

		public ContaNaoEncontradaException() {
			super("Nomeinvalido");
		}
	}

	public class VendaNaoConcluidaException extends Exception {

		public VendaNaoConcluidaException() {
			super("VendaNaoConcluida");
		}
	}

	public class CPFNaoEncontrado extends Exception {
		public CPFNaoEncontrado() {
			super("CPFNaoEncontrado");
		}
	}

}
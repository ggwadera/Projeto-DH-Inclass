package br.com.mgoficina.exception;

public class ObjectNotFoundException extends RuntimeException {

	private static final String MESSAGE = "Objeto não encontrado: ";

	public ObjectNotFoundException(String message) {
		super(MESSAGE + message);
	}

}

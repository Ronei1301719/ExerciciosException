package Exercicio02;

public class NomeInvalidoException extends Exception{

public String nome;
	
	public NomeInvalidoException (String message, String nome) {
		super(message);
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
}
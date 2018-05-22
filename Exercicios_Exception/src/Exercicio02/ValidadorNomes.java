package Exercicio02;

public class ValidadorNomes {

	public void ValidaNomes(String nome) throws NomeInvalidoException {
		String primeiroCaractere = String.valueOf(nome.charAt(0));
		if ("_".equals(primeiroCaractere)) {
			throw new NomeInvalidoException("O nome digitado é inválido", nome);
		}
	}
}
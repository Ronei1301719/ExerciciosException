package exercicio03;

import java.util.Scanner;

public class Validador {

	private int nomeValido = 0;
	private int nomeInvalido = 0;

	public void validarNome() throws NomeInvalidoException {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um nome: ");
		String nome = scanner.nextLine();

		String primeiroCaractere = String.valueOf(nome.charAt(0));
		if ("_".equals(primeiroCaractere)) {
			nomeInvalido = nomeInvalido + 1;
		} else {
			nomeValido = nomeValido + 1;
		}

	}

	public int getNomeValido() {
		return nomeValido;
	}

	public int getNomeInvalido() {
		return nomeInvalido;
	}

}
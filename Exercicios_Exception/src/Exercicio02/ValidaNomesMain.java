package Exercicio02;

import java.util.Scanner;

public class ValidaNomesMain {

	public static String nome;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		try {
			System.out.println("Digite um nome: ");
			String nome = scanner.nextLine();
			ValidadorNomes validadorNomes = new ValidadorNomes();
			validadorNomes.ValidaNomes(nome);

		} catch (NomeInvalidoException e) {
			System.out.println(e.getNome() + " -  " + e.getMessage());
		}

	}

}
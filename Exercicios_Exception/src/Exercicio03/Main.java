package exercicio03;

public class Main {

	public int nomeValido = 0;
	public int nomeInvalido = 0;

	public static void main(String[] args) throws NomeInvalidoException {

		Validador validadorNomes = new Validador();
		
		int vetorDeNomes [] = new int [5];
		for (int i = 0; i <= 4; i++) {

			try {

				validadorNomes.validarNome();

			} finally {

			}
		}
		System.out.println("Foram lidos " + vetorDeNomes.length + " nomes");
		System.out.println("Foram digitados " + validadorNomes.getNomeValido() + " nomes validos ");
		System.out.println("Foram digitados " + validadorNomes.getNomeInvalido() + " nomes invalidos ");
	}
}
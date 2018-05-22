package exercicio05;

import java.util.Scanner;

public class Main {

	private static double aresta1;
	private static double aresta3;
	private static double aresta2;

	public static void main(String[] args) throws ArestasInvalidasException {

		Scanner scanner = new Scanner(System.in);

		try {
			ArestasInvalidasException exc = new ArestasInvalidasException(null, 0, 0, 0);
			System.out.println("Digite a primeira aresta");
			aresta1 = scanner.nextDouble();
			
			System.out.println("Digite a segunda aresta");
			aresta2 = scanner.nextDouble();
			
			System.out.println("Digite a terceira aresta");
			aresta3 = scanner.nextDouble();

			if (aresta1 == aresta2 && aresta1 == aresta3) {
				System.out.println("Triangulo retangulo");
			}else if (aresta1 != aresta2 && aresta1 != aresta3 && aresta2 != aresta3) {
				System.out.println("Triangulo Escaleno");
			}else if (aresta1 == aresta2 || aresta1 == aresta3 || aresta2 == aresta3) {
				System.out.println("Triangulo Isosceles");
			}
			
			
			ValidadorArestas v = new ValidadorArestas();
			v.ValidaArestas(aresta1, aresta2, aresta3);

		} catch (ArestasInvalidasException e) {
			System.out.println(e.getMessage());

		}
	}

}
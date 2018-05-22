package exercicio05;

public class ValidadorArestas {

	public void ValidaArestas(double aresta1, double aresta2, double aresta3) throws ArestasInvalidasException {
		if ((aresta1 + aresta2 < aresta3) || (aresta1 + aresta3 < aresta2) || (aresta3 + aresta2 < aresta1)) {
			throw new ArestasInvalidasException("Valores informados não formam um triangulo", aresta1, aresta2, aresta3);
		}
	}
}
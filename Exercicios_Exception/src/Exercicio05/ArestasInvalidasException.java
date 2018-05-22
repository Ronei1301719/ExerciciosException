package exercicio05;

public class ArestasInvalidasException extends Exception {

	private double aresta1;
	private double aresta2;
	private double aresta3;
	
	public ArestasInvalidasException(String message, double aresta1, double aresta2, double aresta3) {
		super(message);
		this.aresta1 = aresta1;
		this.aresta2 = aresta2;
		this.aresta3 = aresta3;
	}
	

	public double getAresta1() {
		return aresta1;
	}

	public double getAresta2() {
		return aresta2;
	}

	public double getAresta3() {
		return aresta3;
	}
}
package exercicio01;
public class ValidaNome {
    public static void main(String args[]) throws NomeInvalidoException 
	{
		String nome = "Sergio";
		if (nome != "Ronei"){
		throw new NomeInvalidoException("O nome não é Ronei", nome);
	}
        }
}
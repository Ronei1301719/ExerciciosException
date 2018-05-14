public class Ex01 {
    public static void main(String args[]) throws NomeInvalidoException 
	{
		String nome = "Ronei";
		if (nome != "Ronei"){
		throw new NomeInvalidoException("O nome não é Ronei", nome);
	}
        }
}

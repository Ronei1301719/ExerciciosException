public class Ex01 {
    public static void main(String args[]) throws NomeInvalidoException 
	{
		String nome = "Paulo";
		if(!nome.contains("Ronei") || !nome.contains("RONEI") || !nome.contains("ronei"))
		throw new NomeInvalidoException();
	}
}

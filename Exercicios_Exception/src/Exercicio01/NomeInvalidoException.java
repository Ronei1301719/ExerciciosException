package exercicio01;
public class NomeInvalidoException extends Exception {

    private String nome;
    
    public NomeInvalidoException(String message, String nome){
        super(message);
        this.nome = nome;
    }
    public String getNome(){
        
        return nome;
    }
    
}
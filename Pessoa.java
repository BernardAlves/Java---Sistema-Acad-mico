

public abstract class Pessoa {
    private final String nome;
    private final String sobrenome;
    public static int totalPessoas = 0;
  
    public Pessoa (String nome, String sobrenome){
      this.nome = nome;
      this.sobrenome = sobrenome;
  
    }
    //retorna o Nome e Sobrenome
    public String getNome() {return nome;}
    public String getSobrenome() {return sobrenome;}
  
    //retorna representação String do objeto Pessoa
    @Override 
    public String toString() { 
      return String.format("Nome: %s%nSobrenome: %s", 
          getNome(), getSobrenome()); 
    } 

  
  
}
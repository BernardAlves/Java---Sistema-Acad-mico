

public class Professor extends Pessoa {

    private String disciplina ;
  
    public Professor (String nome, String sobrenome, String disciplina){
      //construtor da superclasse Pessoa
      super(nome, sobrenome);
  
      this.disciplina = disciplina ;
    }
  
    public String getDisciplina() {return disciplina;} 
     
    @Override
    public String toString() {
      return String.format("Professor %n%s%nLecionando: %s",
        super.toString(), getDisciplina());
    }
  }
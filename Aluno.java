

public class Aluno extends Pessoa {

    private String cursoGraducao ;
  
    public Aluno (String nome, String sobrenome, String cursoGraducao){
      //construtor da superclasse Pessoa
      super(nome, sobrenome);
  
      this.cursoGraducao = cursoGraducao ;
    }
  
    public String getCursoGraducao() {return cursoGraducao;} 
     
    @Override
    public String toString() {
      return String.format("Aluno %n%s%nCursando: %s",
        super.toString(), getCursoGraducao());
    }
  }
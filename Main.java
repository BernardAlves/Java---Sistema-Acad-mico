import java.util.Scanner;
import java.util.*;

class Main {
    public static void main(String[] args) {

        System.out.println("Sistema iniciado.");
        Pessoa[] listaPessoas = new Pessoa[100];

        boolean continuarLoop = true;
        do{
            try{
                Scanner scanner = new Scanner(System.in);

                System.out.println("------------------------------\n");
                System.out.println("[1] Cadastrar professor");
                System.out.println("[2] Cadastrar aluno");
                System.out.println("[3] Consultar situação de um docente/discente");
                System.out.println("[4] Sair\n");
                System.out.print("Escolha uma das opções acima: ");   
                int opcaoMenu = scanner.nextInt();
                

                if (opcaoMenu<1 || opcaoMenu>4){
                    throw new InputMismatchException();
                }
                
                System.out.println("Escolheu "+opcaoMenu);

                switch(opcaoMenu){
                    case 1:
                        if
                }

                continuarLoop = false;

            }
            catch(InputMismatchException e){
                System.err.printf(">> Somente numeros entre 1 e 4, tente novamente. (Exception: %s)%n", e);
            }

        }while(continuarLoop);

    }

    //Pessoa[] listaPessoas = new Pessoa[100];

    //Aluno aluno1 = new Aluno("John", "Smith", "ADS");

    //System.out.println(aluno1);
    
    //for (Employee currentEmployee : employees) { 
    //  System.out.println(currentEmployee)

}
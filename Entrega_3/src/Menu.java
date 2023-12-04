/* FASE 3 DO PROJETO DA DISCIPLINA DE ESTRTURA DE DADOS
* ESTUDANTES/MATRÍCULA:
* - Raí Guilherme Aurino da Silva / 01616371
* - Samuel Levi Correia Da Silva / 01618292
* - Sofia Lorena de Freitas Pereira / 01623132
* - Tomaz Arlindo Silva Ribeiro / 01619933
*/

//Classes importadas para facilitar a execução do projeto:
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) throws Exception {
        Registro reg = new Registro(0, null, 0, 0, 0);  //Instância (Chamada) da classe Registro como um objeto (reg).
        Scanner escolha = new Scanner(System.in); //Intância da classe scanner que irá "ler" o arquivo "Produto.txt".

        //Estrutura de repetição que irá conter o Menu:
        do {
            System.out.println("\n--- MENU ---"
            + "\nChamar Classe : ArrayList (1)"
            + "\nChamar Classe : Fila (2)"
            + "\nChamar Classe : Pilha (3)"
            + "\nSair do Programa (0) \n"
            + "\nDigite uma das alternativas:");

            reg.setOpcao(escolha.nextInt());

            //Sistema de escolhas dependendo da opção inserida:
            switch (reg.getOpcao()) {
                case 1:
                    System.out.println("Iniciando Classe: ArrayList...");
                    for(int x = 5; x >= 0; x--){
                        System.out.println(x);
                    }
                    Arraylist.main(args); // Chamando a classe de Array List.
                    break;
                
                case 2:
                    System.out.println("Iniciando Classe: Fila...");
                    for(int x = 5; x >= 0; x--){
                        System.out.println(x);
                    }
                    Fila.main(args); // Chamando a classe de Fila.
                    break;
                
                case 3:
                    System.out.println("Iniciando Classe: Pilha...");
                    for(int x = 5; x >= 0; x--){
                        System.out.println(x);
                    }
                    Pilha.main(args); // Chamando a classe de Pilha.
                    break;
                
                case 0:
                    System.out.println("Finalizando programa...");
                    for(int x = 5; x >= 0; x--){
                        System.out.println(x);
                    }
                    System.out.println("Sistema finalizado.");
                    break;
                default:
                    System.out.println("Insira uma opção valida. Tecle um número qualquer e aperte 'Enter' para continuar.");
                    reg.setOpcao(escolha.nextInt());
                    break;
            }
        } while(reg.getOpcao() != 0);

        escolha.close();
    }
}

/* Fase 4: Árvore
* ESTUDANTE: Samuel Levi Correia da Silva / 01618292
*/

import java.util.TreeSet;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Arvore {
    public static void main(String[] args) throws Exception {

        RegCliente registro = new RegCliente(null, null, null); //Instância (Chamada) da classe Registro como um objeto (registro).

        //Criação do objeto árvore para a estruturação dos dados do arquivo Clientes.txt:
        
        TreeSet<RegCliente> arvore = new TreeSet<>((no1, no2) -> {
            if (no1.getCodigo().compareTo(no2.getCodigo()) == -1) {
                return -1;
            }
            else if (no1.getCodigo().compareTo(no2.getCodigo()) == 1) {
                return 1;
            }
            else {
                return 2;
            }
        });

        registro.setCaminhoArquivo("Clientes.txt"); //Caminho relativo

        try {
            File arquivo_cliente = new File(registro.getCaminhoArquivo()); //Objeto criado para servir de referência do arquivo "Clientes.txt".
            Scanner leitor = new Scanner(arquivo_cliente); //Intância da classe scanner que irá "ler" o arquivo "Clientes.txt".

            //Loop criado para tratar os dados do arquivo "Clientes.txt" e armazena-los dentro da Árvore (TreeSet) da classe Registro:
            while(leitor.hasNextLine()) {
                registro.setLinha(leitor.nextLine());

                //Codigo para a atribuição de valores para as variáveis através dos métodos getters e setters.
                String[] colunas = registro.getLinha().split(";"); // Quebra a linha usando marcador ";" como referência
                registro.setCodigo(colunas[0]);
                registro.setNome(colunas[1]);
                registro.setPaisDeOrigem(colunas[2]);

                //Comando para atribuir todas as variáveis ao Fila:
                arvore.add(new RegCliente(registro.getCodigo(), registro.getNome(), registro.getPaisDeOrigem()));
            }
            leitor.close();
            System.out.println("---LISTA DE CLIENTES---");
            for (RegCliente cliente : arvore) {
                
                System.out.format("\nCodigo: %s \nNome: %s \nPaís de Origem: %s \n", 
                cliente.getCodigo(), cliente.getNome(), cliente.getPaisDeOrigem());
            }

        } catch(FileNotFoundException e) {
            System.out.println("Arquivo nâo encontrado, por favor digite o caminho certo.");
        }
}
}

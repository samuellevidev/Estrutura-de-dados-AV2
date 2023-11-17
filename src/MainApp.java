/* FASE 1 DO PROJETO DA DISCIPLINA DE ESTRTURA DE DADOS
* ESTUDANTES/MATRÍCULA:
* - Raí Guilherme Aurino da Silva / 01616371
* - Samuel Levi Correia Da Silva / 01618292
* - Sofia Lorena de Freitas Pereira / 01623132
* - Tomaz Arlindo Silva Ribeiro / 01619933
*/

//Classes importadas para facilitar a execução do projeto:
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) throws Exception {
        
        Registro reg = new Registro(0, null, 0, 0, 0); //Instância (Chamada) da classe Registro como um objeto (reg).
        Scanner leia = new Scanner(System.in); //Instância (Chamada) da classe Scanner como um objeto (leia).
        ArrayList <Registro> lista_de_produtos = new ArrayList<>(); //Arraylis que irá armazenar os dados do arquivo "Produto.txt".



        //System.out.print("Insira o caminho do arquivo 'Produto.txt': ");
        reg.setCaminhoArquivo("C:/Users/samar/OneDrive - Universidade Católica de Pernambuco/PESSOAL/SAMUEL/JavaEstudos/Projeto_ED/Estrutura_De_Dados/Produto.txt"); //C:\Users\samar\OneDrive - Universidade Católica de Pernambuco\PESSOAL\SAMUEL\JavaEstudos\Projeto_ED\Estrutura_De_Dados\Produto.txt
        leia.close();

    try{
        File arquivo_produto = new File(reg.getCaminhoArquivo()); //Objeto criado para servir de referência do arquivo "Produto.txt".
        Scanner leitor = new Scanner(arquivo_produto); //Intância da classe scanner que irá "ler" p arquivo "Produto.txt".

        //Loop criado para tratar os dados do arquivo "Produto.txt" e armazena-los dentro da ArrayList da classe Registro:
        while(leitor.hasNextLine()) {
            reg.setLinha(leitor.nextLine());

            //Codigo para a atribuição de valores para as variáveis através dos métodos getters e setters.
            reg.setCodigo(Integer.parseInt(reg.getLinha().substring(0, 2)));
            reg.setCategoria(Integer.parseInt(reg.getLinha().substring(46, 47)));
            reg.setDescricao(reg.getLinha().substring(3, 34));
            reg.setPrecoUnidade(Double.parseDouble(reg.getLinha().substring(36, 41)));
            reg.setQuantidade(Integer.parseInt(reg.getLinha().substring(43, 45)));

            //Comando para atribuir todas as variáveis ao ArrayList:
            lista_de_produtos.add(new Registro(reg.getCodigo(), reg.getDescricao(), reg.getPrecoUnidade(), reg.getQuantidade(), reg.getCategoria()));
        }
        leitor.close();
        
        //Sistema de output para mostrar ao usuario os valores dentro do arraylist:
        System.out.println("---LISTA DE PRODUTOS---");
        for (Registro produto : lista_de_produtos) {
            System.out.format("\nCodigo: %d \nDescrição: %s \nPreço/Unidade: %.2f \nQuantidade: %d \nCategoria: %d \n", 
            produto.getCodigo(), produto.getDescricao(), produto.getPrecoUnidade(), produto.getQuantidade(), produto.getCategoria());
        }
    } catch (FileNotFoundException e) {
        System.out.println("Arquivo nâo encontrado, por favor digite o caminho certo.");
    }

    }
}

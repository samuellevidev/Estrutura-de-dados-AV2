

public class Registro {

//Atributos da classe Registro:

private int codigo, categoria; //Variável responsável pela identificação dos produtos.
private String descricao, valors, linha; //Variável que define o que são os produtos, e o valor em formato string.
private double preco; //Variável que representa o valor de cada unidade de determinado produto.
private int quantidade; //Variável que define a quantidade de cada produto.
private String caminho_do_arquivo; //Variável que armazena o caminho para o arquivo Produto.


/* Métodos "Getters" e "Setters" de cada variável,
* Getters: São as funções que retornam o valor da sua respectiva variável.
* Setters: São os métodos que definem o valor da sua respectiva variável.
*/

//Variável Codigo:
public void setCodigo(int codigo) {
    this.codigo = codigo;
}
public int getCodigo() {
    return codigo;
}

//Variável Categoria:
public void setCategoria(int categoria) {
    this.categoria = categoria;
}
public int getCategoria() {
    return categoria;
}

//Variável Descrição:
public void setDescricao(String descricao) {
    this.descricao = descricao;
}
public String getDescricao() {
    return descricao;
}

//Variável Preço da unidade:
public void setPrecoUnidade(double preco) {
    this.preco = preco/100;
}
public double getPrecoUnidade() {
    return preco;
}

//Variável Quantidade:
public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
}
public int getQuantidade() {
    return quantidade;
}

//Variável Caminho do arquivo:
public void setCaminhoArquivo(String caminho) {
    this.caminho_do_arquivo = caminho;
}
public String getCaminhoArquivo() {
    return caminho_do_arquivo;
}

//Variável Linha:
public void setLinha(String linha) {
    this.linha = linha;
}
public String getLinha() {
    return linha;
}

//Variável Linha:
public void setValorString(String valors) {
    this.valors = valors;
}
public String getValorsString() {
    return valors;
}

//Métodos e Funções complementares:
public Registro(int codigo, String descricao, double preco_unidade, int quantidade, int categoria) {
    this.codigo = codigo;
    this.descricao = descricao;
    this.preco = preco_unidade;
    this.quantidade = quantidade;
    this.categoria = categoria;
}

}
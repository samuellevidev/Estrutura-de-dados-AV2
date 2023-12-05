public class RegCliente {

    //Atributos do objeto Cliente:
    private String codigo, nome, pais_origem, linha, caminho_do_arquivo; // Variáveis referentes ao Cliente.

    //Funções e Metodos Getters e Setters:

    //Variável Codigo:
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getCodigo() {
        return codigo;
    }

    //Variável Nome:
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    //Variável País de origem:
    public void setPaisDeOrigem(String pais_origem) {
        this.pais_origem = pais_origem;
    }
    public String getPaisDeOrigem() {
        return pais_origem;
    }

    //Variável linha:
    public void setLinha(String linha) {
        this.linha = linha;
    }
    public String getLinha() {
        return linha;
    }

    //Variável Caminho do arquivo:
    public void setCaminhoArquivo(String caminho_do_arquivo) {
        this.caminho_do_arquivo = caminho_do_arquivo;
    }
    public String getCaminhoArquivo() {
        return caminho_do_arquivo;
    }

    public RegCliente(String codigo, String nome, String pais_origem) {
        this.codigo = codigo;
        this.nome = nome;
        this.pais_origem = pais_origem;
    }
}
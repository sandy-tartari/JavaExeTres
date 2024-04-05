public class Produto {
    private String nome, valor, descricao;
    private int qtdEstoque;
    public Produto(String nome, String valor, String descricao, int qtdEstoque) {
        this.nome = nome;
        this.valor = valor;
        this.descricao = descricao;
        this.qtdEstoque = qtdEstoque;
    }

    public String getNome() {
        return nome;
    }
    public String getValor() { 
        return valor;
    }
    public String getDescricao() {
        return descricao;
    }
    public int getQtdEstoque() { 
        return qtdEstoque;
    }


    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setValor(String valor) {
        this.valor = valor;
    }
    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }
}

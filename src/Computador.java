public class Computador {
    private String marca;
    private int ano, velocidade;
    private boolean ehNovo;
    public Computador(String marca, int ano, int velocidade, boolean ehNovo) {
        this.marca = marca;
        this.ano = ano;
        this.velocidade = velocidade;
        this.ehNovo = ehNovo;
    }

    public String getMarca() {
        return marca;
    }
    public int getAno() {
        return ano;
    }
    public int getVelocidade() {
        return velocidade;
    }
    public boolean getehNovo() {
        return ehNovo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    public void setEhNovo(boolean ehNovo) {
        this.ehNovo = ehNovo;
    }
}

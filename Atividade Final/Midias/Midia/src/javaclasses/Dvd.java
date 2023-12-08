package javaclasses;

public class Dvd extends Midia {
    private int nFaixas;

    public Dvd() {
        super();
        this.nFaixas = 0;
    }

    public Dvd(int codigo, double preco, String nome, int nFaixas) {
        super(codigo, preco, nome);
        this.nFaixas = nFaixas;
    }

    public String getTipo() {
        return "DVD";
    }

    public String getDetalhes() {
        return String.format("%s Quantidade de Faixas: %d", super.getDetalhes(), nFaixas);
    }

    public void setFaixas(int nFaixas) {
        this.nFaixas = nFaixas;
    }

    /**
     *
     */
    @Override
    public void inserirDados() {
        super.inserirDados();
        System.out.println("Insira a quantidade de faixas:");
        this.nFaixas = Integer.parseInt(System.console().readLine());
    }

    public int getnFaixas() {
        return nFaixas;
    }

    public void setnFaixas(int nFaixas) {
        this.nFaixas = nFaixas;
    }

}
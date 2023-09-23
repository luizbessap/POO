class Filme extends ItemLocacao {
    private int duracao;

    public Filme(String titulo, double precoLocacao, int duracao) {
        super(titulo, precoLocacao);
        this.duracao = duracao;
    }
    
    public int getDuracao() {
        return duracao;
    }
}
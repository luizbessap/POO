class JogoVideoGame extends ItemLocacao {
    private String plataforma;

    public JogoVideoGame(String titulo, double precoLocacao, String plataforma) {
        super(titulo, precoLocacao);
        this.plataforma = plataforma;
    }
    
    public String getPlataforma() {
        return plataforma;
    }
}

class ItemLocacao {
    private String titulo;
    private double precoLocacao;
    
    public ItemLocacao(String titulo, double precoLocacao) {
        this.titulo = titulo;
        this.precoLocacao = precoLocacao;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public double getPrecoLocacao() {
        return precoLocacao;
    }
    
    public void setPrecoLocacao(double precoLocacao) {
        this.precoLocacao = precoLocacao;
    }
    
    public double calcularPrecoLocacao(int dias) {
        return precoLocacao * dias;
    }
}
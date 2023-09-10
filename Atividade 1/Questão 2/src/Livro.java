public class Livro {
    String titulo;
    String autor;
    int numPaginas;

    public Livro(String titulo, String autor, int numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    public void imprimirInfo() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Numero de Paginas: " + numPaginas);
    }

    public static void main(String[] args) {
        Livro meuLivro = new Livro("Jogador Numero 1", "Ernest Cline", 464);

        meuLivro.imprimirInfo();
    }
}

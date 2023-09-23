public class LocadoraApp {
    public static void main(String[] args) {
        // Criando objetos Filme e JogoVideoGame
        Filme filme1 = new Filme("Matrix", 3.0, 120);
        JogoVideoGame jogo1 = new JogoVideoGame("FIFA 22", 2.5, "PlayStation 5");
        
        // Exibindo informações
        System.out.println("Filme: " + filme1.getTitulo() + ", Duração: " + filme1.getDuracao() + " minutos");
        System.out.println("Preço de Locação do Filme por 2 dias: $" + filme1.calcularPrecoLocacao(2));
        
        System.out.println("\nJogo de Video Game: " + jogo1.getTitulo() + ", Plataforma: " + jogo1.getPlataforma());
        System.out.println("Preço de Locação do Jogo por 3 dias: $" + jogo1.calcularPrecoLocacao(3));
    }
}
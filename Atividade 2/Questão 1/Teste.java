public class Teste {
    public static void main(String[] args) {
        Animal animal1 = new Peixe("Peixe Dourado", 0.5, "Água Doce");
        Animal animal2 = new Cachorro("Rex", 10.0, "Labrador");

        System.out.println("Dados do Animal 1:");
        System.out.println(animal1.toString());

        System.out.println("\nDados do Animal 2:");
        System.out.println(animal2.toString());
    }
}
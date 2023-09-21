public class Teste {
    public static void main(String[] args) {
        Empregado empregado = new Empregado("João", 30, "Masculino", 3000.0, "12345");
        Cliente cliente = new Cliente("Maria", 25, "Feminino", 500.0, 1990);
        Gerente gerente = new Gerente("Carlos", 40, "Masculino", 6000.0, "67890", "RH");
        Vendedor vendedor = new Vendedor("Ana", 28, "Feminino", 2500.0, "54321", 1500.0, 10);

        System.out.println("Dados do Empregado:");
        System.out.println(empregado.toString());
        System.out.println("Valor INSS: " + empregado.valorInss());

        System.out.println("\nDados do Cliente:");
        System.out.println(cliente.toString());

        System.out.println("\nDados do Gerente:");
        System.out.println(gerente.toString());

        System.out.println("\nDados do Vendedor:");
        System.out.println(vendedor.toString());
    }
}
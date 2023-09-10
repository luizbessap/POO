public class FaturaTeste {
    public static void main(String[] args) {
        Fatura fatura1 = new Fatura("01", "Monitor", 5, 100);
        Fatura fatura2 = new Fatura("02", "Caixa de som");

        System.out.println("Fatura 1:");
        System.out.println("Numero: " + fatura1.getNumero());
        System.out.println("Descricao: " + fatura1.getDescricao());
        System.out.println("Quantidade: " + fatura1.getQuantidade());
        System.out.println("Preco por item: " + fatura1.getPreco());
        System.out.println("Total: " + fatura1.getTotalFatura());

        System.out.println();

        System.out.println("Fatura 2:");
        System.out.println("Numero: " + fatura2.getNumero());
        System.out.println("Descricao: " + fatura2.getDescricao());
        System.out.println("Quantidade: " + fatura2.getQuantidade());
        System.out.println("Preco por item: " + fatura2.getPreco());
        System.out.println("Total: " + fatura2.getTotalFatura());
    }
}
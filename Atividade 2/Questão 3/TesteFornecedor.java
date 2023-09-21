public class TesteFornecedor {
    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor("Pedro", "Samambaia", "(61) 98279-8655", 10000.0, 5000.0);

        System.out.println("Nome do Fornecedor: " + fornecedor.getNome());
        System.out.println("Endereço do Fornecedor: " + fornecedor.getEndereco());
        System.out.println("Telefone do Fornecedor: " + fornecedor.getTelefone());

        System.out.println("Valor de Crédito do Fornecedor: " + fornecedor.getValorCredito());
        System.out.println("Valor de Dívida do Fornecedor: " + fornecedor.getValorDivida());
        System.out.println("Saldo do Fornecedor: " + fornecedor.obterSaldo());
    }
}
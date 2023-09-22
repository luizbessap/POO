public class TesteVendedor {
    public static void main(String[] args){
        Vendedor vendedor = new Vendedor("João", "Asa-Norte", "(61)96321-8951", 123, 3000.0, 10, 10000.0, 10);

        System.out.println("Nome do vendedor: "+ vendedor.getNome());
        System.out.println("Endereço do vendedor: "+ vendedor.getEndereco());
        System.out.println("Telefone do vendedor: "+ vendedor.getNome());
        System.out.println("Salario do vendedor: "+ vendedor.calcularSalario());
    }
    
}

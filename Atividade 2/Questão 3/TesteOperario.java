public class TesteOperario {
    public static void main(String[] args){
        Operario operario = new Operario("Marcos", "Asa-Sul", "(61) 96453-9845", 123, 4000.0, 10, 2000.0, 5);

        System.out.println("Nome do operário: "+ operario.getNome());
        System.out.println("Endereço do operário: "+ operario.getEndereco());
        System.out.println("Telefone do operário: "+ operario.getNome());
        System.out.println("Salario do operário: "+ operario.calcularSalario());
    }
}

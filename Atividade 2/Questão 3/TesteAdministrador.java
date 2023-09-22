public class TesteAdministrador {
    public static void main(String[] args){
        Administrador administrador = new Administrador("Gabriel", "Ceilândia", "(61)91423-9876", 123, 6000.0, 10, 2000.0);

        System.out.println("Nome do administrador: "+ administrador.getNome());
        System.out.println("Endereço do administrador: "+ administrador.getEndereco());
        System.out.println("Telefone do administrador: "+ administrador.getNome());
        System.out.println("Salario do administrador: "+ administrador.calcularSalario());
    }
}

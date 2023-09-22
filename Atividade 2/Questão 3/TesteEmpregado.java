public class TesteEmpregado {
    public static void main(String[] args){
        Empregado empregado = new Empregado("Roberto", "Taguatinga", "(61)98233-9876)", 123, 3000.0, 30);

        System.out.println("Nome do empregado: " + empregado.getNome());
        System.out.println("Endereço do empregado: " + empregado.getEndereco());
        System.out.println("Telefone do empregado: " + empregado.getTelefone());

        
    }
    
}

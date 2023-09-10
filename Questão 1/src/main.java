import java.util.Scanner;
public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Cadastro de Pessoa");
        System.out.print("Nome: ");
        String nomePessoa = scanner.nextLine();
        System.out.print("Idade: ");
        int idadePessoa = scanner.nextInt();
        System.out.print("Altura: ");
        double alturaPessoa = scanner.nextDouble();
        scanner.nextLine();


        System.out.printf("\nDados cadastrados:");
        System.out.printf("Pessoa:\nNome: " + nomePessoa + "\nIdade: " + idadePessoa + "\nAltura: %.2f" , alturaPessoa);
        scanner.close();
    }
}

    

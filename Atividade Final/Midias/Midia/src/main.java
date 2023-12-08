import javaclasses.*;

public class main {
    public static void main(String[] args) throws Exception {

        Dvd dvd1 = new Dvd();
        dvd1.inserirDados();
        System.out.println(dvd1.getDetalhes());

        Cd cd1 = new Cd();
        cd1.inserirDados();
        System.out.println(cd1.getDetalhes());
    }
}
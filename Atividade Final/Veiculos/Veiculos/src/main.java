import javaclasses.*;

public class main {
    public static void main(String[] args) throws Exception {
        
        Moto moto = new Moto("YAMAHA XJ6", 30000, 2013);
        moto.printDados();
        
        Carro carro = new Carro("FORD Fiesta", 35000, 130000);   
        carro.printDados(); 

    }
}
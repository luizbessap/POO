public class Empregado extends Pessoa {
    private int codigoSetor;
    private double salarioBase;
    private double imposto;


    public Empregado(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto){
        super(nome, endereco, telefone);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

    public void setCodigoSetor(int codigoSetor){
        this.codigoSetor = codigoSetor;
    }

    public int getCodigoSetor(){
        return codigoSetor;
    }

    public void setSalarioBase(double salarioBase){
        this.salarioBase = salarioBase;
    }

    public double SalarioBase(){
        return salarioBase;
    }

    public void setImposto(double imposto){
        this.imposto = imposto;
    }

    public double Imposto(){
        return imposto;
    }

    public double calcularSalario(){
        return salarioBase - (salarioBase * (imposto/100));
    }

}


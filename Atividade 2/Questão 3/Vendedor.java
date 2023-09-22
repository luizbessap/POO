public class Vendedor extends Empregado {
    private double valorVendas;
    private double comissao;

    public Vendedor(String nome, String endereco, String telefone, int codigoSetor, double salarioBase,double imposto, double valorVendas, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.comissao = comissao;
        this.valorVendas = valorVendas;
    }

    public void setValorVendas(double valorVendas){
        this.valorVendas = valorVendas;
    }

    public double getValorVendas(){
        return valorVendas;
    }

    public void setComissao(double comissao){
        this.comissao = comissao;
    }

    public double getComissao(){
        return comissao;
    }

    public double calcularSalario(){
        return super.calcularSalario() + (valorVendas * (comissao / 100));
    }
    
}

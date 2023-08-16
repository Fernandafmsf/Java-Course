package entities;

public class Account {
    private int numero;
    private String nome;
    private double saldo;

    public Account(int numero, String nome, double deposito){
        this.numero=numero;
        this.nome=nome;
        this.saldo=deposito;
    }

    public Account(int numero, String nome){
        this.numero=numero;
        this.nome=nome;
        this.saldo=0;
    }

    public int getNumero(){
        return this.numero;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void deposito(double deposito){
        this.saldo+=deposito;
    }

    public void saca(double valor){
        this.saldo -= (valor + 5);
    }

    public String toString(){
        return "Account "+
                this.numero+
                ", Holder: "+
                this.nome+
                ", Balance: $ "+
                String.format("%.2f", this.saldo);
    }

}

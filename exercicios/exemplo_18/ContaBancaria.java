public class ContaBancaria {
    private String titular;
    private String numeroConta;
    private double saldo;
    public ContaBancaria(){}
    public ContaBancaria(String titular, String numeroConta){
        this.titular = titular;
        this.numeroConta = numeroConta;
    }
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public void depositar (double valor) throws Exception{
        if(valor <= 0){
            throw new Exception();
        }
        saldo = saldo + valor;
    }
    public void sacar(double valor) throws Exception{
        if(valor > saldo || valor <= 0){
            throw new Exception();
        }
        saldo = valor; // saldo = saldo - valor;
    }
}
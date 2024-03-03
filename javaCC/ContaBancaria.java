public class ContaBancaria {
    String titular;
    double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }
    
    public void depositar(double valor){
        saldo += valor;
        System.out.println("Depósito de RS: "+valor+" realizado com sucesso.");
    }

    public boolean sacar(double valor) {
        if (saldo - valor >= 0) {
            saldo -= valor;
            System.out.println("Saque de R$ "+valor+ " realizado com sucesso.");
            return true;
        }
        else {
            System.out.println("Saldo insuficiente para saque.");
            return false;
        }}

    public double getSaldo(){
        return saldo;
    }
}
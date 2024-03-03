public class main {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente("Fred", 1200, 5);

        conta1.depositar(1000);
        conta1.sacar(2000);
        System.out.println("Saldo atual: R$ "+conta1.getSaldo());
    }
}
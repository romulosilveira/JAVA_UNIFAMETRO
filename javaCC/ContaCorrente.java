class ContaCorrente extends ContaBancaria {
    private double taxaManutencao;

    public ContaCorrente(String titular, double saldo, double taxaManutencao) {
        super(titular, saldo);
        this.taxaManutencao = taxaManutencao;
    }

    public boolean sacar(double valor) {
        if (saldo - valor - taxaManutencao >= 0) {
            saldo -= (valor+taxaManutencao);
            System.out.println("Saque de R$ "+valor+ " realizado com sucesso. Taxa de manutenção de R$" +taxaManutencao+ " aplicada.");
            return true;
        }
        else {
            System.out.println("Saldo insuficiente para saque.");
            return false;
        }}
}
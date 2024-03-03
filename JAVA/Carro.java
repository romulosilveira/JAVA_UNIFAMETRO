// Carro.java

class Carro extends Veiculo {
    private String modelo;
    private int ano;
    private double preco;

    public Carro(String modelo, int ano, double preco, String marca, double quilometragem) {
        super(marca, quilometragem);
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
    }

    public void exibirInformacoes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Preço: R$" + preco);
        System.out.println("Marca: " + marca);
        System.out.println("Quilometragem: " + quilometragem);
    }
    public double calcularDepreciacao() {
        // Lógica para calcular a depreciação com base na quilometragem
        return quilometragem * 0.05; // Exemplo simples
    }
    public static void main(String[] args) {
        Carro gol = new Carro("Gol", 2020, 45000.00, "Volkswagen", 35000.00);
        Carro up = new Carro("Up", 2015, 32000.00, "Volkswagen", 75000.00);
        System.out.println("Carro 1:");
        gol.exibirInformacoes();
        System.out.println("\nCarro 2:");
        up.exibirInformacoes();
        double depre = up.calcularDepreciacao();
        System.out.println("Depreciação: " + depre);
    }
}






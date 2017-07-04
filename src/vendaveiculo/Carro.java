package vendaveiculo;

public class Carro extends Veiculo {

    public int potencia, numcilindros, numocupantes;
    public double comp, larg, altu;

    public enum Tipos {
        UTILITARIO, PICKUP, SEDAN, HATCH, ESPORTIVO
    }
    Tipos tipocarro;

    public Carro(int numchassi, int ano, int quilometragem, int peso, String marca,
            String modelo, String tipocombustivel, int status, int potencia,
            int numcilindros, int numocupantes, Tipos tipocarro, double comp, double larg, double altu) {
        super(numchassi, ano, quilometragem, peso, marca, modelo, tipocombustivel, status);
        this.potencia = potencia;
        this.numcilindros = numcilindros;
        this.numocupantes = numocupantes;
        this.tipocarro = tipocarro;
        this.altu = altu;
        this.comp = comp;
        this.larg = larg;

    }
}

package vendaveiculo;

public class Motocicleta extends Veiculo {

    public int cilindradas;

    public enum TipoMotocicleta {
        TRAIL, STREET, ESPORTIVA, CUSTOM
    }
    TipoMotocicleta motocicleta;

    public Motocicleta(int numchassi, int ano, int quilometragem, int peso,
            String marca, String modelo, String tipocombustivel, int status,
            int cilindradas, TipoMotocicleta motocicleta) {
        super(numchassi, ano, quilometragem, peso, marca, modelo, tipocombustivel, status);
        this.cilindradas = cilindradas;
        this.motocicleta = motocicleta;
    }
}

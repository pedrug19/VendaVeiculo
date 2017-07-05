package vendaveiculo;

public class Carro extends Veiculo {

    private int potencia, numcilindros, numocupantes;
    private double comp, larg, altu;
    private String tipoCarro;

    public enum Tipos {
        UTILITARIO, PICKUP, SEDAN, HATCH, ESPORTIVO
    }
    private Tipos enumtipocarro;

    public Carro(int numchassi, int ano, int quilometragem, int peso, String marca,
            String modelo, String tipocombustivel, int status, int potencia,
            int numcilindros, int numocupantes, String tipoCarro, double comp, double larg, double altu, double preco) {
        super(numchassi, ano, quilometragem, peso, marca, modelo, tipocombustivel, status, preco);
        this.potencia = potencia;
        this.numcilindros = numcilindros;
        this.numocupantes = numocupantes;
        this.tipoCarro = tipoCarro;
        this.altu = altu;
        this.comp = comp;
        this.larg = larg;
        if (tipoCarro.equals("SEDAN")) {
            enumtipocarro = Tipos.SEDAN;
        }
        if (tipoCarro.equals("UTILITARIO")) {
            enumtipocarro = Tipos.UTILITARIO;
        }
        if (tipoCarro.equals("PICKUP")) {
            enumtipocarro = Tipos.PICKUP;
        }
        if (tipoCarro.equals("HATCH")) {
            enumtipocarro = Tipos.HATCH;
        }
        if (tipoCarro.equals("ESPORTIVO")) {
            enumtipocarro = Tipos.ESPORTIVO;
        }

    }

    public String getTipoCarro() {
        return tipoCarro;
    }

    public void setPot(int potencia) {
        this.potencia = potencia;
    }

    public void setCilindros(int numcilindros) {
        this.numcilindros = numcilindros;
    }

    public void setNumOC(int numocupantes) {
        this.numocupantes = numocupantes;
    }

    public void setAltu(double altu) {
        this.altu = altu;
    }

    public void setComp(double comp) {
        this.comp = comp;
    }

    public void setLarg(double larg) {
        this.larg = larg;
    }

    public int getPot() {
        return potencia;
    }

    public int getCilindros() {
        return numcilindros;
    }

    public int getNumOc() {
        return numocupantes;
    }

    public double getAlt() {
        return altu;
    }

    public double getComp() {
        return comp;
    }

    public double getLarg() {
        return larg;
    }

    public void getTudo() {
        System.out.println("Número do chassi: " + numchassi);
        System.out.println("Marca: " + marca);
        System.out.println("Numero de ocupantes: " + numocupantes);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Tipo: " + tipoCarro);
        System.out.println("Km: " + quilometragem);
        System.out.println("Potência: " + potencia);
        System.out.println("Altura: " + altu);
        System.out.println("Comprimento: " + comp);
        System.out.println("Largura: " + larg);
        System.out.println("Tipo de combustível: " + tipocombustivel);
        System.out.println("Peso: " + peso + " Kg");
        System.out.println("Cilindradas: " + numcilindros);
        System.out.println("Preço: " + preco);
    }
}

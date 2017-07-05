package vendaveiculo;

public class Carro extends Veiculo {

    private int potencia, numcilindros, numocupantes;
    private double comp, larg, altu;

    public enum Tipos {
        UTILITARIO, PICKUP, SEDAN, HATCH, ESPORTIVO
    }
    Tipos tipocarro;

    public Carro(int numchassi, int ano, int quilometragem, int peso, String marca,
            String modelo, String tipocombustivel, int status, int potencia, double preco,
            int numcilindros, int numocupantes, Tipos tipocarro, double comp, double larg, double altu) {
        super(numchassi, ano, quilometragem, peso, marca, modelo, tipocombustivel, status, preco);
        this.potencia = potencia;
        this.numcilindros = numcilindros;
        this.numocupantes = numocupantes;
        this.tipocarro = tipocarro;
        this.altu = altu;
        this.comp = comp;
        this.larg = larg;

    }
    
    public void setPot(int potencia){
        this.potencia = potencia;
    }
    
    public void setCilindros(int numcilindros){
        this.numcilindros = numcilindros;
    }
    
    public void setNumOC(int numocupantes){
        this.numocupantes = numocupantes;
    }
    
    public void setAltu(double altu){
        this.altu = altu;
    }
    
    public void setComp(double comp){
        this.comp = comp;
    }
    
    public void setLarg(double larg){
        this.larg = larg;
    }
    
    public int getPot(){
        return potencia;
    }
    
    public int getCilindros(){
        return numcilindros;
    }
    
    public int getNumOc(){
        return numocupantes;
    }
    
    public double getAlt(){
        return altu;
    }
    
    public double getComp(){
        return comp;
    }
    
    public double getLarg(){
        return larg;
    }
    
    public void getTudo(){
        System.out.println("\nNúmero do chassi: " + numchassi);
        System.out.println("\nMarca: " + marca);
        System.out.println("\nNumero de ocupantes: " + numocupantes);
        System.out.println("\nModelo: " + modelo);
        System.out.println("\nAno: " + ano);
        System.out.println("\nTipo: " + tipocarro);
        System.out.println("\nKm: " + quilometragem);
        System.out.println("\nPotência: " + potencia);
        System.out.println("\nAltura: " + altu);
        System.out.println("\nComprimento: " + comp);
        System.out.println("\nLargura: " + larg);
        System.out.println("\nTipo de combustível: " + tipocombustivel);
        System.out.println("\nPeso: " + peso + " Kg");
        System.out.println("\nCilindradas: " + numcilindros);
        System.out.println("\nPreço: " + preco);
    }
}

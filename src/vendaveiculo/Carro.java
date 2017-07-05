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
}

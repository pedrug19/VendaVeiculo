package vendaveiculo;

public class Motocicleta extends Veiculo {

    private int cilindradas;
    private String tipomoto;

    public enum TipoMotocicleta {
        TRAIL, STREET, ESPORTIVA, CUSTOM
    }
    TipoMotocicleta enummotocicleta;

    public Motocicleta(int numchassi, int ano, int quilometragem, int peso,
            String marca, String modelo, String tipocombustivel, int status,
            int cilindradas, TipoMotocicleta motocicleta, double preco) {
        super(numchassi, ano, quilometragem, peso, marca, modelo, tipocombustivel, status, preco);
        this.cilindradas = cilindradas;
        this.enummotocicleta = motocicleta;
        switch (enummotocicleta){
                case TRAIL:
                    tipomoto = "Trail";
                    break;
                case STREET:
                    tipomoto = "Street";
                    break;
                case ESPORTIVA:
                    tipomoto = "Esportiva";
                    break;
                case CUSTOM:
                    tipomoto = "Custom";
                    break;
        }
    }
    
    public String getTipoMoto(){
        return tipomoto;
    }
    public void setCil(int cilindradas){
        this.cilindradas = cilindradas;
    }
    public void setMoto(TipoMotocicleta motocicleta){
        this.enummotocicleta = motocicleta;
        switch (enummotocicleta){
                case TRAIL:
                    tipomoto = "Trail";
                    break;
                case STREET:
                    tipomoto = "Street";
                    break;
                case ESPORTIVA:
                    tipomoto = "Esportiva";
                    break;
                case CUSTOM:
                    tipomoto = "Custom";
                    break;
        }
    }
    
    public int getCil(){
        return cilindradas;
    }
    
    public TipoMotocicleta getMoto(){
        return enummotocicleta;
    }
    
    @Override
    public void getTudo(){
        System.out.println("Número do chassi: " + numchassi);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Tipo: " + tipomoto);
        System.out.println("Km: " + quilometragem);
        System.out.println("Tipo de combustível: " + tipocombustivel);
        System.out.println("Peso: " + peso + " Kg");
        System.out.println("Cilindradas: " + cilindradas);
        System.out.println("Preço: " + preco);
    }
}

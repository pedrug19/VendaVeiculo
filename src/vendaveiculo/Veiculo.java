package vendaveiculo;

public abstract class Veiculo {

    protected int numchassi, ano, quilometragem, peso, status;//1 vendido, 0 a venda.
    protected String marca, modelo, tipocombustivel;

    public Veiculo(int numchassi, int ano, int quilometragem, int peso,
            String marca, String modelo, String tipocombustivel, int status) {
        this.numchassi = numchassi;
        this.ano = ano;
        this.quilometragem = quilometragem;
        this.peso = peso;
        this.marca = marca;
        this.modelo = modelo;
        this.tipocombustivel = tipocombustivel;
        this.status = status;
    }

    public void veiculoVendido() {
        if (status == 1) {
            System.out.println("O veículo já foi vendido \n");
        } else {
            status = 1;
        }
    }
    
    public int getChassi(){
        return numchassi;
    }
}

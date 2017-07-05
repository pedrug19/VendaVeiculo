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
    
    public void setNumChassi(int numchassi){
        this.numchassi = numchassi;
    }
    
    public void setAno(int ano){
        this.ano = ano;
    }
    
    public void setKm(int quilometragem){
        this.quilometragem = quilometragem;
    }
    
    public void setPeso(int peso){
        this.peso = peso;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public void setTipo(String tipo){
        this.tipocombustivel = tipo;
    }
    
    public void setStatus(int status){
        this.status = status;
    }
    
    public int getAno(){
        return ano;
    }
    
    public int getKm(){
        return quilometragem;
    }
    
    public int getPeso(){
        return peso;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public String getTipo(){
        return tipocombustivel;
    }
    
    public int getStatus(){
        return status;
    }
    
    public int getChassi(){
        return numchassi;
    }
}

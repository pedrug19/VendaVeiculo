package vendaveiculo;

public class Hora {

    private final int horaHoje = 12, minutoHoje = 30;
    private int hora, minuto;

    public Hora(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }
}

package vendaveiculo;

import java.util.*;
import java.io.*;

public abstract class Vendedor {

    protected int rg, diaNasc, mesNasc, anoNasc, diaAdm, mesAdm, anoAdm;
    protected String nome;
    protected double salario;
    protected int tempoServico;
    protected Data data;

    public Vendedor(int rg, int diaNasc, int mesNasc, int anoNasc, int diaAdm,
            int mesAdm, int anoAdm, String nome, double salario) {
        this.rg = rg;
        this.diaNasc = diaNasc;
        this.mesNasc = mesNasc;
        this.anoNasc = anoNasc;
        this.diaAdm = diaAdm;
        this.mesAdm = mesAdm;
        this.anoAdm = anoAdm;
        this.nome = nome;
        this.salario = salario;
        this.tempoServico = 2017 - this.anoAdm;
        this.data = new Data(diaNasc, mesNasc, anoNasc, diaAdm, mesAdm, anoAdm);
    }

    public void setRg(int rg) {
        this.rg = rg;

    }

    public void setDiaNasc(int diaNasc) {
        this.diaNasc = diaNasc;

    }

    public void setMesNasc(int mesNasc) {
        this.mesNasc = mesNasc;

    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;

    }

    public void setDiaAdm(int diaAdm) {
        this.diaAdm = diaAdm;

    }

    public void setMesAdm(int mesAdm) {
        this.mesAdm = mesAdm;

    }

    public void setAnoAdm(int anoAdm) {
        this.anoAdm = anoAdm;

    }

    public void setNome(String nome) {
        this.nome = nome;

    }

    public void setSalario(double salario) {
        this.salario = salario;

    }

    public int getRg() {
        return rg;
    }

    public int getIdade() {
        return data.getAno();
    }

    public int getTempoServico() {
        return tempoServico;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

}

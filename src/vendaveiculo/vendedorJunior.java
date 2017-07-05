package vendaveiculo;

import java.util.*;
import java.io.*;

public class vendedorJunior extends Vendedor {

    protected int tempoRest/*dias*/;
    protected String responsavel;

    public vendedorJunior(int rg, int diaNasc, int mesNasc, int anoNasc, int diaAdm,
            int mesAdm, int anoAdm, String nome, double salario, int tempoRest, String responsavel) {

        super(rg, diaNasc, mesNasc, anoNasc, diaAdm, mesAdm, anoAdm, nome, salario);

        this.tempoRest = tempoRest;
        this.responsavel = responsavel;

    }

    public void setTempoRest(int tempoRest) {
        this.tempoRest = tempoRest;

    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;

    }

    public int getTempoRest() {
        return tempoRest;

    }

    public String getResponsavel() {
        return responsavel;

    }
    
    public void getTudo(){
        System.out.println("Nome: " + nome);
        System.out.println("Data de nascimento: " + diaNasc + "/" + mesNasc + "/" + anoNasc);
        System.out.println("RG: " + rg);
        System.out.println("Data de admissão: "  + diaAdm + "/" + mesAdm + "/" + anoAdm);
        System.out.println("Salário: " + salario);
        System.out.println("Responsável: " + responsavel);
        System.out.println("Tempo restante: " + tempoRest);
    }
}

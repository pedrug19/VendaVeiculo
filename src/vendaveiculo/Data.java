package vendaveiculo;

import java.text.*;
import java.util.*;
import java.time.*;

public class Data {

    protected int diaNasc, mesNasc, anoNasc, idade, diaHoje = 1, mesHoje = 6, anoHoje = 2017, mesesTrab;
    protected int diaAdm, mesAdm, anoAdm;

    public Data(int diaNasc, int mesNasc, int anoNasc, int diaAdm, int mesAdm, int anoAdm) {
        this.diaNasc = diaNasc;
        this.mesNasc = mesNasc;
        this.anoNasc = anoNasc;
        this.diaAdm = diaAdm;
        this.mesAdm = mesAdm;
        this.anoAdm = anoAdm;
        if (this.mesNasc < this.mesHoje) {
            this.idade = this.anoHoje - this.anoNasc;
        } else {
            if (this.mesNasc > this.mesHoje) {
                this.idade = this.anoHoje - this.anoNasc - 1;

            } else if (this.diaNasc < this.diaHoje) {
                this.idade = this.anoHoje - this.anoNasc;
            } else {
                this.idade = this.anoHoje - this.anoNasc - 1;
            }
        }

        if (anoAdm == 0) {
            this.mesesTrab = 0;//é um cliente
        } else {
            this.mesesTrab = 12 - this.mesAdm + this.mesHoje + (12 * (this.anoHoje - this.anoAdm));
        }
    }

    public int getAno() {
        return idade;
    }

    public int getMesesTrab() {
        return mesesTrab;
    }

}

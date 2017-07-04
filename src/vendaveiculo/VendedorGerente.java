package vendaveiculo;

public class VendedorGerente extends Vendedor {

    public VendedorGerente(int rg, int diaNasc, int mesNasc, int anoNasc, int diaAdm,
            int mesAdm, int anoAdm, String nome, double salario) {
        super(rg, diaNasc, mesNasc, anoNasc, diaAdm, mesAdm, anoAdm, nome, salario);

        this.salario = (1.02 * salario) * data.getMesesTrab() * 2;

    }

}

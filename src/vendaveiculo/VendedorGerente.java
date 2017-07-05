package vendaveiculo;

public class VendedorGerente extends Vendedor {

    public VendedorGerente(int rg, int diaNasc, int mesNasc, int anoNasc, int diaAdm,
            int mesAdm, int anoAdm, String nome, double salario) {
        super(rg, diaNasc, mesNasc, anoNasc, diaAdm, mesAdm, anoAdm, nome, salario);

        this.salario = (1.02 * salario) * data.getMesesTrab() * 2;

    }
    
    @Override
    public void getTudo(){
        System.out.println("Nome: " + nome);
        System.out.println("Data de nascimento: " + diaNasc + "/" + mesNasc + "/" + anoNasc);
        System.out.println("RG: " + rg);
        System.out.println("Data de admissão: "  + diaAdm + "/" + mesAdm + "/" + anoAdm);
        System.out.println("Salário: " + salario);
    }

}

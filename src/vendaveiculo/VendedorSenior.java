package vendaveiculo;

public class VendedorSenior extends Vendedor {

    private int anosExp;

    public VendedorSenior(int rg, int diaNasc, int mesNasc, int anoNasc, int diaAdm,
            int mesAdm, int anoAdm, String nome, double salario) {

        super(rg, diaNasc, mesNasc, anoNasc, diaAdm, mesAdm, anoAdm, nome, salario);
        this.salario = (1.015 * salario) * data.getMesesTrab();

    }

    public void setAnosExp(int anosExp) {
        this.anosExp = anosExp;
    }

    public int getAnosExp() {
        return anosExp;
    }
    
    @Override
    public void getTudo(){
        System.out.println("Nome: " + nome);
        System.out.println("Data de nascimento: " + diaNasc + "/" + mesNasc + "/" + anoNasc);
        System.out.println("RG: " + rg);
        System.out.println("Data de admissão: "  + diaAdm + "/" + mesAdm + "/" + anoAdm);
        System.out.println("Salário: " + salario);
        System.out.println("Anos de experiência: " + anosExp);
    }
}

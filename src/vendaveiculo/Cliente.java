package vendaveiculo;

public class Cliente {

    private int CPF, dependentes, dianasc, mesnasc, anonasc;
    private double renda, desconto;
    private String nome, rua, numero, bairro, cidade;
    private Data datanasc;
    private double juros = 0;
    double parcelas = 0;

    public Cliente(int CPF, double renda, int dependentes, int dianasc, int mesnasc,
            int anonasc, String nome, String rua, String numero, String bairro, String cidade) {
        this.CPF = CPF;
        this.renda = renda;
        this.dependentes = dependentes;
        this.datanasc = new Data(dianasc, mesnasc, anonasc, 0, 0, 0);
        this.nome = nome;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
    }

    public void setCpf(int cpf) {
        this.CPF = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNasc(Data datanasc) {
        this.datanasc = datanasc;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    public void setDep(int dependentes) {
        this.dependentes = dependentes;
    }

    public String getNome() {
        return nome;
    }

    public double getRenda() {
        return renda;
    }

    public int getDependentes() {
        return dependentes;
    }

    public double getDesconto(double preco) {
        if (renda < 1000) {
            this.desconto = preco * 0.1;//10%
        } else {
            if (renda < 3000) {
                this.desconto = preco * 0.07;//7%

            } else {
                this.desconto = preco * 0.05;//5%
            }
        }

        return desconto;
    }

    public double getParcelas(double preco) {
        if (dependentes == 1) {
            parcelas = preco/12;
            System.out.println("12x de R$ " + (preco) / 12 + "cada!");
        }
        if (dependentes == 2) {
            parcelas = preco/24;
            System.out.println("24x de R$ " + (preco) / 24 + "cada!");
        }
        if (dependentes == 3) {
            parcelas = preco/36;
            System.out.println("36x de R$ " + (preco) / 36 + "cada!");
        }
        if (dependentes >= 4) {
            parcelas = preco/48;
            System.out.println("48x de R$ " + (preco) / 48 + "cada!");
        }
        
        if(renda < 1000){
            System.out.println("Juros de 1% por parcela.");
            juros = 0.01;
        } else {
            if(renda < 3000) {
                juros = 0.025;
                System.out.println("Juros de 2,5% por parcela.");
            } else {
                juros = 0.045;
                System.out.println("Juros de 4,5% por parcela.");
            }
        }
        return parcelas;
    }

    public int getCpf() {
        return CPF;
    }
}

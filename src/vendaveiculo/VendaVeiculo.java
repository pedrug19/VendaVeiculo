package vendaveiculo;

import java.util.*;
import java.io.*;

/*
Autores: Gustavo Molina
Luis Marcello
Pedrenrique Gonçalves
 */
public class VendaVeiculo {

    //listas
    static ArrayList<vendedorJunior> vendJuniors = new ArrayList<>();
    static ArrayList<VendedorSenior> vendSeniors = new ArrayList<>();
    static ArrayList<VendedorGerente> gerentes = new ArrayList<>();
    static ArrayList<Carro> carros = new ArrayList<>();
    static ArrayList<Motocicleta> motocicletas = new ArrayList<>();
    static ArrayList<Cliente> clientes = new ArrayList<>();
    
    static Scanner e = new Scanner(System.in);

    static int opcLogin = 0, opcGer = 0, opcVen = 0, auxLogin, i;
    static int cpfCliente = 0, numchassi = 0, rgVendedor, veriCli = 0, veriVei = 0;
    static int opcCad = 0, indiceVen, j = 0, indiceClient;

    static int RG, diaNasc = 0, mesNasc = 0, anoNasc = 0, diaAdm = 0, mesAdm = 0, anoAdm = 0, tempoRest, cpf, dependentes;
    static String nome, responsavel, numero, bairro, rua, cidade;
    static double salario, renda, preco;

    static Data dataNasc;

    public static void realizarVenda() {
        System.out.println("\n Realizar venda \n");
        System.out.println("\n Venda: \n");
        if (clientes.isEmpty() || carros.isEmpty() || motocicletas.isEmpty()) {
            System.out.println("\n é necessário cadastrar pelo menos um cliente ou"
                    + " um carro ou uma moto! \n");
        } else {//pode relizar a venda
            veriCli = 0;
            System.out.println("\n Digite o CPF do cliente: \n");
            cpf = Integer.parseInt(e.nextLine());
            for (i = 0; i < clientes.size() && veriCli == 0; i++) {
                if (cpf == clientes.get(i).getCpf()) {
                    veriCli = i;
                    System.out.println("\n CPF encontrado! \n");
                }
            }
            if (veriCli == 0) {
                System.out.println("Cliente não encontrado!");
            } else {
                veriVei = 0;
                System.out.println("\n Digite o Número do chassi do veículo: \n");
                numchassi = Integer.parseInt(e.nextLine());
                for (i = 0; i < carros.size() && veriVei == 0; i++) {
                    if (numchassi == carros.get(i).getChassi()) {
                        veriVei = i;
                        System.out.println("\n Número do carro encontrado! \n");
                        System.out.println("Detalhes do carro: ");
                        carros.get(veriVei).getTudo();
                        if (carros.get(veriVei).verificaStatus()) {
                            System.out.println("Veículo já foi vendido!");
                        } else {
                            carros.get(veriVei).setStatus(1);
                            System.out.println("Realizando venda para " + clientes.get(veriCli).getNome());
                            preco = carros.get(veriCli).getPreco();
                            System.out.println("");
                        }
                    }
                }
                for (i = 0; i < motocicletas.size() && veriVei == 0; i++) {
                    if (numchassi == motocicletas.get(i).getChassi()) {
                        veriVei = 1;
                        System.out.println("\n Número da moto encontrado! \n");
                    }
                }
                if (veriVei == 0) {
                    System.out.println("Veículo não encontrado!");
                }
            }
        }

    }
    
    public static void cadastraVeiculo(){
        
    }

    public static void lerArqClientes(FileReader arqRead) {
        try {
            BufferedReader a = new BufferedReader(arqRead);
            String linha = a.readLine();
            clientes.clear();
            while (linha != null) {
                nome = linha;
                linha = a.readLine();
                cpf = Integer.parseInt(linha);
                linha = a.readLine();
                diaNasc = Integer.parseInt(linha);
                linha = a.readLine();
                mesNasc = Integer.parseInt(linha);
                linha = a.readLine();
                anoNasc = Integer.parseInt(linha);
                linha = a.readLine();
                renda = Double.parseDouble(linha);
                linha = a.readLine();
                dependentes = Integer.parseInt(linha);
                linha = a.readLine();
                rua = linha;
                linha = a.readLine();
                numero = linha;
                linha = a.readLine();
                bairro = linha;
                linha = a.readLine();
                cidade = linha;
                linha = a.readLine();
                Cliente cliente = new Cliente(cpf, renda, dependentes, diaNasc, mesNasc, anoNasc, nome, rua, numero, bairro, cidade);
                clientes.add(cliente);
            }
        } catch (IOException ex) {//mistério
            System.out.println("\n O programa será fechado, favor consultar a equipe de TI.\n ");
            System.exit(1);
        }
    }

    public static void lerArqGerentes(FileReader arqRead) {
        try {
            BufferedReader a = new BufferedReader(arqRead);
            String linha = a.readLine();
            gerentes.clear();
            while (linha != null) {
                nome = linha;
                linha = a.readLine();
                RG = Integer.parseInt(linha);
                linha = a.readLine();
                diaNasc = Integer.parseInt(linha);
                linha = a.readLine();
                mesNasc = Integer.parseInt(linha);
                linha = a.readLine();
                anoNasc = Integer.parseInt(linha);
                linha = a.readLine();
                diaAdm = Integer.parseInt(linha);
                linha = a.readLine();
                mesAdm = Integer.parseInt(linha);
                linha = a.readLine();
                anoAdm = Integer.parseInt(linha);
                linha = a.readLine();
                salario = Double.parseDouble(linha);
                linha = a.readLine();
                VendedorGerente gerente = new VendedorGerente(RG, diaNasc, mesNasc, anoNasc, diaAdm,
                        mesAdm, anoAdm, nome, salario);
                gerentes.add(gerente);
            }
        } catch (IOException ex) {//mistério
            System.out.println("\n O programa será fechado, favor consultar a equipe de TI.\n ");
            System.exit(1);
        }
    }
    public static void lerArqSeniors(FileReader arqRead){
        try {
            BufferedReader a = new BufferedReader(arqRead);
            String linha = a.readLine();
            vendSeniors.clear();
            while (linha != null) {
                nome = linha;
                linha = a.readLine();
                RG = Integer.parseInt(linha);
                linha = a.readLine();
                diaNasc = Integer.parseInt(linha);
                linha = a.readLine();
                mesNasc = Integer.parseInt(linha);
                linha = a.readLine();
                anoNasc = Integer.parseInt(linha);
                linha = a.readLine();
                diaAdm = Integer.parseInt(linha);
                linha = a.readLine();
                mesAdm = Integer.parseInt(linha);
                linha = a.readLine();
                anoAdm = Integer.parseInt(linha);
                linha = a.readLine();
                salario = Double.parseDouble(linha);
                linha = a.readLine();
                VendedorSenior senior = new VendedorSenior(RG, diaNasc, mesNasc, anoNasc, diaAdm,
                        mesAdm, anoAdm, nome, salario);
                vendSeniors.add(senior);
            }
        } catch (IOException ex) {//mistério
            System.out.println("\n O programa será fechado, favor consultar a equipe de TI.\n ");
            System.exit(1);
        }
    }
    
    public static void lerArqJuniors(FileReader arqRead){
        try {
            BufferedReader a = new BufferedReader(arqRead);
            String linha = a.readLine();
            vendJuniors.clear();
            while (linha != null) {
                nome = linha;
                linha = a.readLine();
                RG = Integer.parseInt(linha);
                linha = a.readLine();
                diaNasc = Integer.parseInt(linha);
                linha = a.readLine();
                mesNasc = Integer.parseInt(linha);
                linha = a.readLine();
                anoNasc = Integer.parseInt(linha);
                linha = a.readLine();
                diaAdm = Integer.parseInt(linha);
                linha = a.readLine();
                mesAdm = Integer.parseInt(linha);
                linha = a.readLine();
                anoAdm = Integer.parseInt(linha);
                linha = a.readLine();
                salario = Double.parseDouble(linha);
                linha = a.readLine();
                tempoRest = Integer.parseInt(linha);
                linha = a.readLine(); 
                responsavel = linha;
                linha = a.readLine();                
                vendedorJunior junior = new vendedorJunior(RG, diaNasc, mesNasc, anoNasc, diaAdm,
                        mesAdm, anoAdm, nome, salario, tempoRest, responsavel);
                vendJuniors.add(junior);
            }
        } catch (IOException ex) {//mistério
            System.out.println("\n O programa será fechado, favor consultar a equipe de TI.\n ");
            System.exit(1);
        }
    }

    public static void lerArqCarros(FileReader arqCar){
        
    }
   
    public static void lerArqMotocicletas(FileReader arqRead){
        try {
            BufferedReader a = new BufferedReader(arqRead);
            String linha = a.readLine();
            vendJuniors.clear();
            while (linha != null) {
                numchassi = Integer.parseInt(linha);
                linha = a.readLine();
                ano = Integer.parseInt(linha);
                linha = a.readLine();
                quilometragem = Integer.parseInt(linha);
                linha = a.readLine();
                peso = Integer.parseInt(linha);
                linha = a.readLine();
                marca = linha;
                linha = a.readLine();             
                modelo = linha;
                linha = a.readLine();                
                tipocombustivel = linha;
                linha = a.readLine();                                
                status = Integer.parseInt(linha);
                linha = a.readLine();
                cilindradas = Integer.parseInt(linha);
                linha = a.readLine();
                moto = linha;
                linha = a.readLine();   
                preco = Double.parseDouble(linha);
                linha = a.readLine();                
                Motocicleta motocicleta = new Motocicleta(numchassi, ano, quilometragem, peso, marca,
                        modelo, tipocombustivel, status, cilindradas, moto, preco);
                motocicletas.add(motocicleta);
            }
        } catch (IOException ex) {//mistério
            System.out.println("\n O programa será fechado, favor consultar a equipe de TI.\n ");
            System.exit(1);
        }
    }
    
    public static void arquivos() {
        try {
            File arqCli = new File("C:\\Users\\User\\Documents\\Programas Java\\vendaVeiculo\\src\\vendaveiculo\\banco\\clientes.txt");
            File arqGer = new File("C:\\Users\\User\\Documents\\Programas Java\\vendaVeiculo\\src\\vendaveiculo\\banco\\gerentes.txt");
            File arqSen = new File("C:\\Users\\User\\Documents\\Programas Java\\vendaVeiculo\\src\\vendaveiculo\\banco\\vendsenior.txt");
            File arqJun = new File("C:\\Users\\User\\Documents\\Programas Java\\vendaVeiculo\\src\\vendaveiculo\\banco\\vendjunior.txt");
            File arqCar = new File("C:\\Users\\User\\Documents\\Programas Java\\vendaVeiculo\\src\\vendaveiculo\\banco\\carros.txt");
            File arqMot = new File("C:\\Users\\User\\Documents\\Programas Java\\vendaVeiculo\\src\\vendaveiculo\\banco\\motos.txt");
            File arqVenda = new File("C:\\Users\\User\\Documents\\Programas Java\\vendaVeiculo\\src\\vendaveiculo\\banco\\vendas.txt");
            File arqRelaComum = new File("C:\\Users\\User\\Documents\\Programas Java\\vendaVeiculo\\src\\vendaveiculo\\banco\\relatorioComum.txt");
            File arqRelaGerente = new File("C:\\Users\\User\\Documents\\Programas Java\\vendaVeiculo\\src\\vendaveiculo\\banco\\relatorioGerente.txt");

            //objetos para escrita
            FileWriter wArqCli = new FileWriter(arqCli, false);
            FileWriter wArqGer = new FileWriter(arqGer, false);
            FileWriter wArqSen = new FileWriter(arqSen, false);
            FileWriter wArqJun = new FileWriter(arqJun, false);
            FileWriter wArqCar = new FileWriter(arqCar, false);
            FileWriter wArqMot = new FileWriter(arqMot, false);
            FileWriter wArqVenda = new FileWriter(arqVenda, false);
            FileWriter wArqRelaComum = new FileWriter(arqRelaComum, false);
            FileWriter wArqRelaGerente = new FileWriter(arqRelaGerente, false);

            //objetos para leitura
            FileReader rArqCli = new FileReader(arqCli);
            FileReader rArqGer = new FileReader(arqGer);
            FileReader rArqSen = new FileReader(arqSen);
            FileReader rArqJun = new FileReader(arqJun);
            FileReader rArqCar = new FileReader(arqCar);
            FileReader rArqMot = new FileReader(arqMot);
            FileReader rArqVenda = new FileReader(arqVenda);
            FileReader rArqRelaComum = new FileReader(arqRelaComum);
            FileReader rArqRelaGerente = new FileReader(arqRelaGerente);

            if (!arqCli.canRead() || !arqGer.canRead() || !arqSen.canRead() || !arqJun.canRead() || !arqCar.canRead()
                    || !arqVenda.canRead() || !arqMot.canRead()) {
                System.out.println("\n Arquivos do banco não podem ser lidos!");
            } else {
                lerArqClientes(rArqCli);
                lerArqGerentes(rArqGer);
            }
        } catch (IOException ex) {//mistério

            System.out.println("\n O programa será fechado, favor consultar a equipe de TI.\n ");
            System.exit(1);

        }
    }

    public static void main(String[] args) {

        boolean achou = false;

        //Criando e lendo arquivos
        arquivos();

        //Instanciando um gerente administrador
        VendedorGerente gerenteMaster;
        gerenteMaster = new VendedorGerente(987654321, 1, 1, 1970, 1, 1, 2000, "Mestre", 1000);
        // adicionando como primeiro da Lista de Gerentes.
        gerentes.add(gerenteMaster);

        //objetos;        
        vendedorJunior junior;
        VendedorSenior senior;
        VendedorGerente gerente;
        Cliente cliente;
        Carro carro;
        Motocicleta moto;

        System.out.println("\n Bem-Vindo ao sistema da Foghette! \n");
        while (opcLogin != -1) {

            System.out.println("\n Login: (RG) \n");
            System.out.println("\n -1 p/ fechar:\n");
            auxLogin = Integer.parseInt(e.nextLine());
            if (auxLogin == -1) {
                System.out.println("\n Saindo...\n");
                System.exit(1);
            }
            //verificando se é gerente
            for (i = 0; i < gerentes.size(); i++) {
                if (auxLogin == gerentes.get(i).rg) {
                    opcLogin = 1;
                    break;
                }
            }
            //verificando se é junior
            for (i = 0; i < vendJuniors.size(); i++) {
                if (auxLogin == vendJuniors.get(i).rg) {
                    opcLogin = 3;
                    break;
                }
            }
            //verificando se é senior
            for (i = 0; i < vendSeniors.size(); i++) {
                if (auxLogin == vendSeniors.get(i).rg) {
                    opcLogin = 2;
                    break;
                }
            }
            rgVendedor = auxLogin;
            if (opcLogin == 0) {
                System.out.println("\n Login inválido! \n");
            }

            if (opcLogin == 1) {
                System.out.println("\n Logado como gerente com sucesso! \n");
            }

            if (opcLogin == 2) {
                System.out.println("\n Logado como vendedor senior com sucesso! \n");
            }

            if (opcLogin == 3) {
                System.out.println("\n Logado como vendedor junior com sucesso! \n");
            }

            if (opcLogin == 1) {
                while (opcGer != -1) {
                    System.out.println("\n Menu: \n");
                    System.out.println("\n 1 p/ Cadastrar vendedor: \n");
                    System.out.println("\n 2 p/ Alterar vendedor: \n");
                    System.out.println("\n 3 p/ Excluir vendedor: \n");
                    System.out.println("\n 4 p/ Cadastrar cliente: \n");
                    System.out.println("\n 5 p/ Alterar cliente: \n");
                    System.out.println("\n 6 p/ Excluir cliente: \n");
                    System.out.println("\n 7 p/ Cadastrar veiculo: \n");
                    System.out.println("\n 8 p/ Alterar veiculo: \n");
                    System.out.println("\n 9 p/ Excluir veiculo: \n");
                    System.out.println("\n 10 p/ Realizar uma venda: \n");
                    System.out.println("\n 11 p/ Ver relatório completo: \n");
                    System.out.println("\n -1 p/ deslogar \n");
                    opcGer = Integer.parseInt(e.nextLine());
                    if (opcGer < -1 || opcGer > 11) {
                        System.out.println("\n Opção Inválida! \n");
                    }

                    switch (opcGer) {
                        case 1:
                            while (opcCad != 1 || opcCad != 2 || opcCad != 3) {
                                System.out.println("\n Digite o tipo de vendedor: \n");
                                System.out.println("\n Digite 1 p/ Junior: \n");
                                System.out.println("\n Digite 2 p/ Senior: \n");
                                System.out.println("\n Digite 3 p/ Gerente: \n");
                                opcCad = Integer.parseInt(e.nextLine());
                            }
                            System.out.println("\n Digite o nome: \n");
                            nome = e.nextLine();
                            System.out.println("\n Digite o RG: \n");
                            RG = Integer.parseInt(e.nextLine());
                            while (diaNasc < 1 || diaNasc > 31) {
                                System.out.println("\n Digite o dia de nascimento: \n");
                                diaNasc = Integer.parseInt(e.nextLine());
                            }
                            while (diaNasc < 1 || diaNasc > 12) {
                                System.out.println("\n Digite o mes de nascimento: \n");
                                mesNasc = Integer.parseInt(e.nextLine());
                            }
                            while (anoNasc < 1900 || anoNasc > 2017) {
                                System.out.println("\n Digite o ano de nascimento: \n");
                                anoNasc = Integer.parseInt(e.nextLine());
                            }
                            while (diaAdm < 1 || diaAdm > 31) {
                                System.out.println("\n Digite o dia de admissão: \n");
                                diaAdm = Integer.parseInt(e.nextLine());
                            }
                            while (mesAdm < 1 || mesAdm > 12) {
                                System.out.println("\n Digite o mes de admissão: \n");
                                mesAdm = Integer.parseInt(e.nextLine());
                            }
                            while (anoAdm < 1980 || anoAdm > 2017) {
                                System.out.println("\n Digite o ano de admissão: \n");
                                anoAdm = Integer.parseInt(e.nextLine());
                            }
                            System.out.println("\n Digite o salário: \n");
                            salario = Double.parseDouble(e.nextLine());

                            if (opcCad == 1) {//junior
                                System.out.println("\n Digite tempo restante: (dias) \n");
                                tempoRest = Integer.parseInt(e.nextLine());
                                System.out.println("\n Digite o responsável: \n");
                                responsavel = e.nextLine();
                                junior = new vendedorJunior(RG, diaNasc, mesNasc, anoNasc, diaAdm,
                                        mesAdm, anoAdm, nome, salario, tempoRest, responsavel);
                                vendJuniors.add(junior);

                            }
                            if (opcCad == 2) {//senior

                                senior = new VendedorSenior(RG, diaNasc, mesNasc, anoNasc, diaAdm,
                                        mesAdm, anoAdm, nome, salario);
                                vendSeniors.add(senior);
                            }
                            if (opcCad == 3) {//gerente

                                gerente = new VendedorGerente(RG, diaNasc, mesNasc, anoNasc, diaAdm,
                                        mesAdm, anoAdm, nome, salario);
                                gerentes.add(gerente);
                            }
                            opcCad = 0;
                            break;
                        case 2:
                            while (opcCad != 1 || opcCad != 2 || opcCad != 3) {
                                System.out.println("\n Digite o tipo de vendedor para alterar: \n");
                                System.out.println("\n Digite 1 p/ Junior: \n");
                                System.out.println("\n Digite 2 p/ Senior: \n");
                                System.out.println("\n Digite 3 p/ Gerente: \n");
                                opcCad = Integer.parseInt(e.nextLine());
                            }

                            System.out.println("\n Digite o novo nome: \n");
                            nome = e.nextLine();
                            System.out.println("\n Digite o novo RG: \n");
                            RG = Integer.parseInt(e.nextLine());
                            do {
                                System.out.println("\n Digite o novo dia de nascimento: \n");
                                diaNasc = Integer.parseInt(e.nextLine());
                            } while (diaNasc < 1 || diaNasc > 31);
                            do {
                                System.out.println("\n Digite o novo mes de nascimento: \n");
                                mesNasc = Integer.parseInt(e.nextLine());
                            } while (mesNasc < 1 || mesNasc > 12);
                            do {
                                System.out.println("\n Digite o novo ano de nascimento: \n");
                                anoNasc = Integer.parseInt(e.nextLine());
                            } while (anoNasc < 1900 || anoNasc > 2017);
                            do {
                                System.out.println("\n Digite o novo dia de admissão: \n");
                                diaAdm = Integer.parseInt(e.nextLine());
                            } while (diaAdm < 1 || diaAdm > 31);
                            do {
                                System.out.println("\n Digite o novo mes de admissão: \n");
                                mesAdm = Integer.parseInt(e.nextLine());
                            } while (mesAdm < 1 || mesAdm > 12);
                            do {
                                System.out.println("\n Digite o novo ano de admissão: \n");
                                anoAdm = Integer.parseInt(e.nextLine());
                            } while (anoAdm < 1980 || anoAdm > 2017);
                            System.out.println("\n Digite o novo salário: \n");
                            salario = Double.parseDouble(e.nextLine());

                            if (opcCad == 1) {//junior
                                System.out.println("\n Digite tempo restante: (dias) \n");
                                tempoRest = Integer.parseInt(e.nextLine());
                                System.out.println("\n Digite o responsável: \n");
                                responsavel = e.nextLine();
                                while (j == 0) {
                                    System.out.println("\n Digite o RG do vendedor a ser alterado: \n");
                                    indiceVen = Integer.parseInt(e.nextLine());
                                    for (i = 0; i < vendJuniors.size(); i++) {
                                        if (indiceVen == vendJuniors.get(i).getRg()) {
                                            j = 1;
                                            System.out.println("\n Dados do vendedor alterados!: \n");
                                            break;
                                        }
                                    }
                                }
                                junior = new vendedorJunior(RG, diaNasc, mesNasc, anoNasc, diaAdm,
                                        mesAdm, anoAdm, nome, salario, tempoRest, responsavel);
                                vendJuniors.remove(i);
                                vendJuniors.add(junior);
                                j = 0;
                            }
                            if (opcCad == 2) {//senior
                                while (j == 0) {
                                    System.out.println("\n Digite o RG do vendedor a ser alterado: \n");
                                    indiceVen = Integer.parseInt(e.nextLine());
                                    for (i = 0; i < vendSeniors.size(); i++) {
                                        if (indiceVen == vendSeniors.get(i).getRg()) {
                                            j = 1;
                                            System.out.println("\n Dados do vendedor alterados!: \n");
                                            break;
                                        }
                                    }
                                }
                                senior = new VendedorSenior(RG, diaNasc, mesNasc, anoNasc, diaAdm,
                                        mesAdm, anoAdm, nome, salario);
                                vendSeniors.remove(i);
                                vendSeniors.add(senior);
                                j = 0;
                            }
                            if (opcCad == 3) {//gerente

                                while (j == 0) {
                                    System.out.println("\n Digite o RG do vendedor a ser alterado: \n");
                                    indiceVen = Integer.parseInt(e.nextLine());
                                    for (i = 0; i < gerentes.size(); i++) {
                                        if (indiceVen == gerentes.get(i).getRg()) {
                                            j = 1;
                                            System.out.println("\n Dados do gerente alterados!: \n");
                                            break;
                                        }
                                    }
                                }
                                gerente = new VendedorGerente(RG, diaNasc, mesNasc, anoNasc, diaAdm,
                                        mesAdm, anoAdm, nome, salario);
                                gerentes.remove(i);
                                gerentes.add(gerente);
                                j = 0;
                            }
                            opcCad = 0;
                            break;
                        case 3:
                            while (opcCad != 1 || opcCad != 2 || opcCad != 3) {
                                System.out.println("\n Digite o tipo de vendedor para excluir: \n");
                                System.out.println("\n Digite 1 p/ Junior: \n");
                                System.out.println("\n Digite 2 p/ Senior: \n");
                                System.out.println("\n Digite 3 p/ Gerente: \n");
                                opcCad = Integer.parseInt(e.nextLine());
                            }
                            System.out.println("\n Digite o RG dele: \n");
                            indiceVen = Integer.parseInt(e.nextLine());
                            achou = false;
                            if (opcCad == 1) {
                                for (i = 0; i < vendJuniors.size() && achou == false; i++) {
                                    if (indiceVen == vendJuniors.get(i).getRg()) {
                                        achou = true;
                                        vendJuniors.remove(i);
                                        System.out.println("\n Vendedor removido! \n");
                                    }
                                }
                                if (!achou) {
                                    System.out.println("\n Vendedor não encontrado! \n");
                                }
                            }

                            if (opcCad == 2) {
                                for (i = 0; i < vendSeniors.size() && achou == false; i++) {
                                    if (indiceVen == vendSeniors.get(i).getRg()) {
                                        achou = true;
                                        vendSeniors.remove(i);
                                        System.out.println("\n Vendedor removido! \n");
                                    }
                                }
                                if (!achou) {
                                    System.out.println("\n Vendedor não encontrado! \n");
                                }

                            }
                            if (opcCad == 3) {
                                for (i = 0; i < gerentes.size() && achou == false; i++) {
                                    if (indiceVen == gerentes.get(i).getRg()) {
                                        achou = true;
                                        gerentes.remove(i);
                                        System.out.println("\n Vendedor removido! \n");
                                    }
                                }
                                if (!achou) {
                                    System.out.println("\n Vendedor não encontrado! \n");
                                }
                            }
                            opcCad = 0;
                            break;

                        case 4:
                            System.out.println("\n Cadastrar cliente \n");
                            System.out.println("\n Digite o nome: \n");
                            nome = e.nextLine();
                            System.out.println("\n Digite o CPF: \n");
                            cpf = Integer.parseInt(e.nextLine());
                            do {
                                System.out.println("\n Digite o dia de nascimento: \n");
                                diaNasc = Integer.parseInt(e.nextLine());
                            } while (diaNasc < 1 || diaNasc > 31);
                            do {
                                System.out.println("\n Digite o mes de nascimento: \n");
                                mesNasc = Integer.parseInt(e.nextLine());
                            } while (mesNasc < 1 || mesNasc > 12);
                            do {
                                System.out.println("\n Digite o ano de nascimento: \n");
                                anoNasc = Integer.parseInt(e.nextLine());
                            } while (anoNasc < 1900 || anoNasc > 2017);

                            System.out.println("\n Digite a renda: \n");
                            renda = Double.parseDouble(e.nextLine());
                            System.out.println("\n Digite o número de dependentes: \n");
                            dependentes = Integer.parseInt(e.nextLine());
                            System.out.println("\n Digite a rua: \n");
                            rua = e.nextLine();
                            System.out.println("\n Digite o numero da casa: \n");
                            numero = e.nextLine();
                            System.out.println("\n Digite o bairro: \n");
                            bairro = e.nextLine();
                            System.out.println("\n Digite a cidade: \n");
                            cidade = e.nextLine();
                            cliente = new Cliente(cpf, renda, dependentes, diaNasc, mesNasc, anoNasc, nome, rua, numero, bairro, cidade);
                            clientes.add(cliente);
                            break;
                        case 5:
                            System.out.println("\n Alterar cliente \n");
                            System.out.println("Digite o CPF do cliente a ser alterado: ");
                            cpf = Integer.parseInt(e.nextLine());
                            achou = false;
                            for (i = 0; i < clientes.size() && achou == false; i++) {
                                if (clientes.get(i).getCpf() == cpf) {
                                    achou = true;
                                }
                            }
                            if (achou) {
                                System.out.println("\n Digite o nome: \n");
                                clientes.get(i - 1).setNome(e.nextLine());
                                System.out.println("\n Digite o CPF: \n");
                                clientes.get(i - 1).setCpf(Integer.parseInt(e.nextLine()));
                                do {
                                    System.out.println("\n Digite o dia de nascimento: \n");
                                    diaNasc = Integer.parseInt(e.nextLine());
                                } while (diaNasc < 1 || diaNasc > 31);
                                do {
                                    System.out.println("\n Digite o mes de nascimento: \n");
                                    mesNasc = Integer.parseInt(e.nextLine());
                                } while (mesNasc < 1 || mesNasc > 12);
                                do {
                                    System.out.println("\n Digite o ano de nascimento: \n");
                                    anoNasc = Integer.parseInt(e.nextLine());
                                } while (anoNasc < 1900 || anoNasc > 2017);
                                dataNasc = new Data(diaNasc, mesNasc, anoNasc, 0, 0, 0);
                                clientes.get(i - 1).setDataNasc(dataNasc);
                                System.out.println("\n Digite a renda: \n");
                                clientes.get(i - 1).setRenda(Double.parseDouble(e.nextLine()));
                                System.out.println("\n Digite o número de dependentes: \n");
                                clientes.get(i - 1).setDep(Integer.parseInt(e.nextLine()));
                                System.out.println("\n Digite a rua: \n");
                                clientes.get(i - 1).setRua(e.nextLine());
                                System.out.println("\n Digite o numero da casa: \n");
                                clientes.get(i - 1).setNumero(e.nextLine());
                                System.out.println("\n Digite o bairro: \n");
                                clientes.get(i - 1).setBairro(e.nextLine());
                                System.out.println("\n Digite a cidade: \n");
                                clientes.get(i - 1).setCidade(e.nextLine());
                            } else {
                                System.out.println("Cliente não cadastrado!");
                            }
                            break;
                        case 6:
                            System.out.println("\n Excluir cliente \n");
                            System.out.println("Digite o CPF do cliente a ser removido:");
                            indiceClient = Integer.parseInt(e.nextLine());
                            achou = false;
                            for (i = 0; i < clientes.size() && achou == false; i++) {
                                if (clientes.get(i).getCpf() == indiceClient) {
                                    achou = true;
                                    clientes.remove(i);
                                    System.out.println("Cliente removido com sucesso!");
                                }
                            }
                            if (!achou) {
                                System.out.println("Cliente não encontrado.");
                            }
                            break;
                        case 7:
                            System.out.println("\n Cadastrar veículo \n");
                            break;
                        case 8:
                            System.out.println("\n Alterar veículo \n");
                            break;
                        case 9:
                            System.out.println("\n Excluir veículo \n");
                            System.out.println("Digite o número do chassi do veículo: ");
                            numchassi = Integer.parseInt(e.nextLine());
                            achou = false;
                            for (i = 0; i < carros.size() && achou == false; i++) {
                                if (carros.get(i).getChassi() == numchassi) {
                                    achou = true;
                                    carros.remove(i);
                                }
                            }
                            for (i = 0; i < motocicletas.size() && achou == false; i++) {
                                if (motocicletas.get(i).getChassi() == numchassi) {
                                    achou = true;
                                    motocicletas.remove(i);
                                }
                            }
                            if (achou) {
                                System.out.println("Veículo removido com sucesso!");
                            } else {
                                System.out.println("Veículo não encontrado.");
                            }
                            break;
                        case 10:
                            //função específica para realizar venda
                            realizarVenda();
                            break;
                        case 11:
                            System.out.println("\n relatório completo \n");
                            break;
                    }

                }//fim - while
            }//fim if
            if (opcLogin == 2 || opcLogin == 3) {//para o caso de vendedor
                while (opcVen != -1) {

                    System.out.println("\n Menu: \n");
                    System.out.println("\n 1 p/ realizar uma venda: \n");
                    System.out.println("\n 2 p/ ver relatório parcial: \n");
                    System.out.println("\n -1 p/ deslogar: \n");
                    opcVen = Integer.parseInt(e.nextLine());

                    if (opcVen < -1 || opcVen > 2) {
                        System.out.println("\n Entrada Inválida! \n");
                    } else {
                        if (opcVen == 1) {
                            realizarVenda();
                        }// fim do if venda
                        if (opcVen == 2) {
                            System.out.println("\n Relatório: \n");

                        }

                    }
                }
            }

        }//fim while
        System.out.println("\n Saindo...\n");
    }
}

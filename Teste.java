package af;

import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.DayOfWeek;

public class Teste {

    public static void main(String[] args) {

        ArrayList <Cliente> clientes = new ArrayList<Cliente>();
        ArrayList <Veiculo> veiculos = new ArrayList<Veiculo>();
        ArrayList <Reserva> reservas = new ArrayList<Reserva>();
        Scanner a = new Scanner(System.in);
        int menuop=0;

        while(menuop!=4)
        {
            System.out.println("\t\t*****MENU*****\n");
            System.out.println("1. Cadastrar um novo cliente;");
            System.out.println("2. Cadastrar um novo veiculo;");
            System.out.println("3. Reservar um veiculo;");
            System.out.println("4. Sair do sistema.\n");
            menuop= Integer.parseInt(a.nextLine());

            if(menuop==1)
            {
                Cliente cli= new Cliente();
                System.out.println("\nInforme o nome do cliente: ");
                cli.setNome(a.nextLine());
                System.out.println("\nInsira o codigo do cliente");
                int xc= Integer.parseInt(a.nextLine());
                int ct2=0;

                for(Cliente xa: clientes)
                {
                    if(xa.getCodigo()!=xc)
                    {
                        ct2+=1;
                    }
                }
                 if(ct2==clientes.size())
                {
                    cli.setCodigo(xc);
                    System.out.println("\nInforme o CPF do cliente: ");
                   // int cpf= Integer.parseInt(a.nextLine());
                    cli.setCpf(a.nextLine());
                    clientes.add(cli);
                }
                else
                {
                    System.out.println("CODIGO JA CADASTRADO! Informe outro codigo nao cadastrado.");
                }
            }
            else if(menuop==2)
            {
                Veiculo v= new Veiculo();
                System.out.println("\nInsira o codigo do carro:");
                int vc= Integer.parseInt(a.nextLine());
                System.out.println("\nInforme o modelo do veiculo: ");
                v.setModelo(a.nextLine());
                int ct1=0;

                for(Veiculo va: veiculos)
                {
                    if(va.getCodigo()!=vc)
                    {
                        ct1+=1;
                    }
                }

                if(ct1==veiculos.size())
                {
                    v.setCodigo(vc);
                    System.out.println("\nInforme o valor da diaria:");
                    v.setValorDiaria(Double.parseDouble(a.nextLine()));
                    veiculos.add(v);
                }
                else
                {
                    System.out.println("CODIGO JA CADASTRADO! Informe outro codigo nao cadastrado.");
                }
            }
            else if(menuop==3)
            {
                Reserva r= new Reserva();
                System.out.println("\nInforme o numero da reserva: ");
                int rn= Integer.parseInt(a.nextLine());
                int ct3=0;

                for(Reserva ra: reservas)
                {
                    if(ra.getNumero()!=rn)
                    {
                        ct3+=1;
                    }
                }

                if(ct3==reservas.size())
                {
                    int nc2;
                    System.out.println("\nInforme o numero do cliente desejado: ");
                    nc2= Integer.parseInt(a.nextLine());
                    int nv2;
                    System.out.println("\nInforme o numero do veiculo desejado: ");
                    nv2= Integer.parseInt(a.nextLine());
                    int qtd;
                    System.out.println("\nInforme os dias alugados: ");
                    qtd= Integer.parseInt(a.nextLine());

                    if(nc2==clientes.size() && nv2==veiculos.size())
                    {
                        r.setNumero(rn);
                        LocalDateTime inicio = LocalDateTime.now();
                        LocalDateTime fim = inicio.plusDays(qtd);
            
                        System.out.println(inicio);
                        System.out.println(fim);
            
                        if(fim.getDayOfWeek().equals(DayOfWeek.SUNDAY))
                        System.out.println("Domingo");

                        if(fim.isAfter(inicio))
                        {
                            System.out.println("Data de fim maior que a data de início");
                            System.out.println("Dias corridos: " + fim.compareTo(inicio));
                            System.out.println("Dias corridos: " + inicio.compareTo(fim));
                        }
                    
                        reservas.add(r);
                    }
                }
                else
                {
                    System.out.println("CODIGO JA CADASTRADO! Informe outro codigo nao cadastrado.");
                }
            }
            System.out.println("\n"+clientes+"\n");
            System.out.println("\n"+veiculos+"\n");
            System.out.println("\n"+reservas+"\n");
        }
        a.close();

    }

}

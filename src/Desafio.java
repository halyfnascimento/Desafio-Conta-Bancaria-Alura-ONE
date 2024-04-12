import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Dados iniciais do cliente:
        String nome = "Kaleo Halyf";
        String conta = "Corrente";
        double saldoInicial = 2500;
        int digito = 0;


        System.out.println("*****************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo da conta: " + conta);
        System.out.println("Saldo inicial: R$ " + saldoInicial);


        String menu =("""
                    Operações:
                                    
                    1 - Consultar saldo
                    2 - Depositar Valor
                    3 - Transferir valor
                    4 - Sair
                                    
                    Digite a opção desejado:
                    """);


        while (digito != 4) {
            System.out.println(menu);
            digito = teclado.nextInt();

            switch (digito) {
                case 1:
                    System.out.printf("\nSaldo Atualizado: R$ %.2f  \n", saldoInicial );
                    break;
                case 2:
                    System.out.println("Digite o valor á ser depositado");
                    double deposito = teclado.nextDouble();
                    saldoInicial = saldoInicial + deposito;

                    System.out.printf("\nSaldo Atualizado: R$ %.2f  \n", saldoInicial );
                    break;
                case 3:
                    System.out.println("Digite o valor á ser transferido");
                    double transfer = teclado.nextDouble();
                   if (saldoInicial >= transfer ){
                       saldoInicial = saldoInicial - transfer;
                   }
                   else{
                       System.out.println("Valor Insuficiente");
                   }

                    System.out.printf("\nSaldo Atualizado: R$ %.2f  \n", saldoInicial );
                    break;

                case 4:
                    System.out.println("Operação encerrada");
                    break;


                default:
                    System.out.println("Opção invalida");
            }
        }
    }
}


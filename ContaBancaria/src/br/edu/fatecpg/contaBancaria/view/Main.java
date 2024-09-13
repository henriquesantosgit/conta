package br.edu.fatecpg.contaBancaria.view;

import java.util.Scanner;
import br.edu.fatecpg.contaBancaria.model.Conta;

public class Main {

    public static void main(String[] args) {
        String titular;
        int opcao;
        double valor;
        double saldoInicial = 0.0;
        
        Scanner scan = new Scanner(System.in);

        // Solicita o nome do titular
        System.out.println("Digite o titular da conta:");
        titular = scan.nextLine();

        // Cria a conta para o titular com saldo inicial zero
        Conta contaPessoa = new Conta(titular, saldoInicial);

        // Menu de operações
        do {
            System.out.println("\nEscolha uma operação:");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Ver saldo");
            System.out.println("4 - Sair");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    // Operação de depósito
                    System.out.println("Digite o valor a ser depositado:");
                    valor = scan.nextDouble();
                    contaPessoa.deposita(valor);
                    break;
                    
                case 2:
                    // Operação de saque
                    System.out.println("Digite o valor a ser sacado:");
                    valor = scan.nextDouble();
                    contaPessoa.sacar(valor);
                    break;

                case 3:
                    // Exibe o saldo atual
                    System.out.println("Saldo atual: R$" + contaPessoa.getSaldo());
                    break;

                case 4:
                    // Sai do programa
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    // Opção inválida
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4); // O menu continuará sendo exibido até o usuário escolher sair

        scan.close(); // Fecha o scanner ao encerrar o programa
    }
}

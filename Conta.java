import java.util.Scanner;

public class Conta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Dados iniciais do cliente (podem ser substituídos por entrada do usuário futuramente)
        String nome = "Ezequiel Macedo";
        String tipoConta = "Corrente";
        double saldo = 2500.0;

        // Exibe os dados iniciais do cliente
        System.out.println("**************************");    // Menu de Opções de Operações
        System.out.println("Dados iniciais do Cliente:\n ");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo de Conta: " + tipoConta);
        System.out.println("Saldo Inicial: R$ " + saldo);
        System.out.println("**************************\n");

        // Loop principal: continua até o usuário escolher sair (opção 4)
        int opcao = 0; // Inicializa com valor diferente de 4 para entrar no loop
        while (opcao != 4) {
            System.out.println("Operações\n");
            System.out.println("1 - Consultar Saldos ");
            System.out.println("2 - Receber Valor ");
            System.out.println("3 - Transferir Valor ");
            System.out.println("4 - Sair \n");
            System.out.println("Digite a Opção Desejada: ");
            opcao = scanner.nextInt();

            // Verifica a opção escolhida e executa a operação correspondente
            if (opcao == 1) {
                // Consulta o saldo atual
                System.out.println("Seu Saldo é: " + saldo + "\n");
            } else if (opcao == 2) {
                // Recebe um valor e atualiza o saldo
                System.out.println("Informe o valor a receber: \n");
                double valorRecebido;
                valorRecebido = scanner.nextDouble();
                saldo += valorRecebido;
                System.out.println("Saldo Atualizado \n");
            } else if (opcao == 3) {
                // Transfere um valor, verificando se há saldo suficiente
                System.out.println("Informe o valor que deseja transferir: \n");
                double valorTransferido = scanner.nextDouble();
                if (valorTransferido <= saldo) {
                    // Saldo suficiente: realiza a transferência
                    saldo -= valorTransferido;
                    System.out.println("Transferência realizada! Saldo Atualizado: R$ " + saldo + "\n");
                } else {
                    // Saldo insuficiente: exibe mensagem de erro
                    System.out.println("Não há saldo suficiente para fazer essa transferência.\n");
                }
            } else if (opcao == 4) {
                // Encerra o programa
                System.out.println("Encerrando aplicação.\n");

            }
        }
    }
}
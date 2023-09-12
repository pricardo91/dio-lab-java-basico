import java.util.Scanner;

/**
 * <h1>Conta Banco</h1>
 * <p>
 * <b>Note:</b> Projeto realizado com o intuito de demonstrar conhecimento nos ensinamentos passados pelo instrutor <b>Gleyson Sampaio</b> na aula de Java Basico<p>
 * <b>ToDo List:</b> Conhecer e importar a classe Scanner<p>
 * Exibir as mensagens para o nosso usuário<p>
 * Obter pela scanner os valores deigitados no terminal<p>
 * Exibir a mensagem da conta criada<p>
 * @author Ricardo Silva
 * @version 1.0
 * @since 12/09/2023
  */

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero = 0;
        String agencia = "";
        String nomeCliente = "";
        double saldo = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, informe o seu nome!");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, informe a sua agencia!");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da sua conta!");
        numero = scanner.nextInt();

        System.out.println("Por favor, informe o seu saldo inicial!");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo  " + saldo + " já está disponível para saque.");
    }
}

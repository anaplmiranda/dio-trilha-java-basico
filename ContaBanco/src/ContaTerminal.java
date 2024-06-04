import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner conta = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência!");
        int numero = conta.nextInt();

        System.out.println("Por favor, digite a Agência!"); 
        String agencia = conta.next();

        System.out.println("Por favor, digite seu nome!");
        String nome_cliente = conta.next();

        System.out.println("Por favor, digite o saldo");
        double saldo = conta.nextDouble();


        System.out.println("Olá " + nome_cliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

    }
}

import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Insira o número da sua conta bancária: ");
        int numero = scanner.nextInt();

        System.out.println("Insira o número da sua agência: ");
        String agencia = scanner.next();

        System.out.println("Insira o nome do cliente: ");
        String nome = scanner.next();

        System.out.println("Insira o saldo do cliente: ");
        double saldo = scanner.nextDouble();

        scanner.close();

        System.out.println("Olá ".concat(nome) + ", obrigado por criar um conta em nosso banco, sua agência é ".concat(agencia) + " conta ".concat(Integer.toString(numero)) + " e seu saldo ".concat(Double.toString(saldo)) + " já está disponível");
        System.out.println("para saque.");


    }
}

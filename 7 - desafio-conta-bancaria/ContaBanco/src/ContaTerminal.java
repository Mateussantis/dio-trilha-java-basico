import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(new Locale("pt", "BR"));

        System.out.println("Digite o numero da conta:");
        int numero = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Digite o numero da agencia:");
        String agencia = scanner.nextLine();

        System.out.println("Digite o seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite o saldo:");
        double saldo = scanner.nextDouble();

        scanner.close();

        DecimalFormat df = new DecimalFormat("#,###");
        String saldoFormatado = df.format(saldo);

        String mensagem = "Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldoFormatado + " já está disponível para saque!"; 

        System.out.println(mensagem);
    }
}

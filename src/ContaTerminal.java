import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal{
    public static void main(String[] args) throws Exception {
        
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)){
            
           System.out.println("Número da agência: ");
                int agencia = scanner.nextInt();
            System.out.println("Número da conta: ");
                String conta = scanner.next();
            System.out.println("Digite seu nome: ");
                String nome = scanner.next();
            System.out.println("Deposite um valor para ativar sua conta: (minímo R$5.00) ");
                double saldo = scanner.nextDouble();
            
        
            System.out.println("Olá " + nome + ", obrigado por criar sua conta em nosso banco, sua agência é: " 
                + agencia + " conta: " + conta + " e seu saldo: R$" + saldo + " já está disponível para saque." );
             
        }

    }
}

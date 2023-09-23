import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) throws Exception {
        double saldo = 1000;
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Por favor, digite o numero da conta");
            int numero = scanner.nextInt();

            System.out.println("Por favor, digite o numero da Agência !");
            int agencia = scanner.nextInt();

            System.out.println("Por favor, digite seu nome");
            String nome = scanner.next();

           

             //imprimindo os dados obtidos pelo usuario
               
             System.out.println("Ola, " + nome + " Obrigado por criar uma conta em nosso banco, sua agência e " + agencia + " Conta " + numero +
             " e seu saldo R$ "+ saldo +" ja esta disponivel para saque." );
          
     }
        
    }
  }


import java.util.Scanner;
import javax.swing.JOptionPane;

public class ContaTerminal {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in, "UTF-8")) {
            
        	System.out.print("Por favor, digite o numero da conta: ");
        	int conta = sc.nextInt();
        	sc.nextLine();
        	
            System.out.print("Por favor, digite o numero da agencia: ");
            int numero = sc.nextInt();
            sc.nextLine();

            System.out.print("Por favor, digite o nome do cliente: ");
            String nomeCliente = sc.nextLine();

            System.out.print("Por favor, digite o saldo da conta: ");
            double saldo = sc.nextDouble();
            sc.nextLine();
            
           

            JOptionPane.showMessageDialog(null, " Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco! ");
            JOptionPane.showMessageDialog(null, "Sua agencia é " + numero + ", conta " + conta + " e seu saldo é de R$" + saldo + ".");
            
            //System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco!");
            //System.out.println("Sua agência é " + numero + ", conta " + conta + " e seu saldo é de R$" + saldo + ".");
            sc.close();
        }
    }
}



       
    



import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner sc = new Scanner(System.in);   

        System.out.print("Insira seu nome: ");
        nomeCliente = sc.nextLine();

        System.out.print("Insira sua agencia: ");
        agencia = sc.nextLine();

        System.out.print("Insira o numero da agencia: ");
        numero = sc.nextInt();

        System.out.print("Insira o saldo inicial: ");
        saldo = sc.nextDouble();
        sc.close();

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque.");
    }
}

import java.util.Scanner;

public class MinhaClasse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Insira seu nome: ");
        String nome = sc.nextLine();
        

        System.out.println("Insira sua idade: ");
        int idade = sc.nextInt();
        sc.nextLine();
        System.out.println("Insira seu trabalho: ");
        String cargo = sc.nextLine();
        
        System.out.println("Olá me chamo " + nome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("E trabalho com " + cargo);

        sc.close();
    }
}

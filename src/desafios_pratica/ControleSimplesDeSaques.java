package desafios_pratica;

import java.util.Scanner;


public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double limiteDiario = scanner.nextDouble();
        for (int i = 1; i > 0;){
            double valor = scanner.nextDouble();

            if (valor == 0){
                --i;
                System.out.println("Transacoes encerradas.");
                break;
            }

            if(limiteDiario > valor){
                limiteDiario -= valor;
                System.out.println("Saque realizado. Limite restante: "+ limiteDiario);
            }else{
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
            }
        }
        scanner.close();
    }
}




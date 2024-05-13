package ex_contador;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o parametro 1:");
        int parametroUm = sc.nextInt();

        System.out.print("Insira o parametro 2:");
        int parametroDois = sc.nextInt();

        sc.close();
        
        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        } 
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if (parametroUm < parametroDois) 
            throw new ParametrosInvalidosException();
        for(int iteracao = 0; iteracao < parametroUm - parametroDois; iteracao++){
            System.out.println("Imprimindo o numero " + (iteracao + 1));
        } 
    }
}

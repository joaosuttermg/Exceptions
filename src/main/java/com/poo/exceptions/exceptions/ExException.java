package com.poo.exceptions.exceptions;
import java.util.Scanner;

public class ExException {
    public static void divisao() {
        
        Scanner sc = new Scanner(System.in);
        
        int numEscolhido;
        int divisor;
        int result;
        System.out.println("Escolha um numero: ");
        numEscolhido = sc.nextInt();
        System.out.println("escolha um divisor: ");
        divisor = sc.nextInt();
        sc.close();

        try {
            result = numEscolhido / divisor;
            System.out.println("o resultado é: "+ result);

        } catch (ArithmeticException e) {
            System.out.println(numEscolhido + " não pode ser dividido por "+ divisor);
        }
        
    }
    public static void verlista() {
        Scanner sc = new Scanner(System.in);
        String[] nomes = { "Lucas", "Enzo", "Eloisa" };
        for(int i = 0; i<=2; i++){
            System.out.println(nomes[i]);
        }
        System.out.println("escolha um indice para selecionar um nome: ");
        int indice = sc.nextInt();

        try {
              
                System.out.println("Nome escolhido: " + nomes[indice]);

        } catch (Exception e) {
            System.out.println("Insira um índice válido ");
        }
       

    }

}

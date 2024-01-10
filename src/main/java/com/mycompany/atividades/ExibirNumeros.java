package com.mycompany.atividades;

import java.util.Scanner;
/**
 *
 * @author tiago.nascimento
 */

public class ExibirNumeros {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");

        int numeroInteiro = scanner.nextInt();
        
        System.out.println("Número lido: " + numeroInteiro);
    }
}

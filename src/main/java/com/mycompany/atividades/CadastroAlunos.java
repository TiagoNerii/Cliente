/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividades;

/**
 *
 * @author tiago.nascimento
 */
import java.util.Scanner;

public class CadastroAlunos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroDeAlunos = 3;
        String[] codigosAlunos = new String[numeroDeAlunos];
        double[] notasAlunos = new double[numeroDeAlunos];

        for (int i = 0; i < numeroDeAlunos; i++) {
            System.out.print("Informe o código do aluno " + (i + 1) + ": ");
            codigosAlunos[i] = scanner.next();
            System.out.print("Informe a nota do aluno " + (i + 1) + ": ");
            notasAlunos[i] = scanner.nextDouble();
        }

        for (int i = 0; i < numeroDeAlunos; i++) {
            System.out.println("\nCódigo e nota do Aluno " + (i + 1) + ":");
            System.out.println("Código: " + codigosAlunos[i]);
            System.out.println("Nota: " + notasAlunos[i]);
        }
    }
}


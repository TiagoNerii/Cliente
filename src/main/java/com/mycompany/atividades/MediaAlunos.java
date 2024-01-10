package com.mycompany.atividades;

import java.util.Scanner;

/**
 *
 * @author tiago.nascimento
 */
public class MediaAlunos {
    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);
        
        double[] mediaDisciplinas = new double[5];
        double somaMedias = 0;
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Informe a média da disciplina " + (i + 1) + ": ");
            mediaDisciplinas[i] = scanner.nextDouble();
            somaMedias += mediaDisciplinas[i];
        }
        double mediaPeriodo = somaMedias / mediaDisciplinas.length;
        
        System.out.println("\nMédia do período: " + mediaPeriodo);
    }
}
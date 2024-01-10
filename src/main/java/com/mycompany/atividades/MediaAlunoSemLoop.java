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

public class MediaAlunoSemLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] mediasDisciplinas = new double[5];

        System.out.print("Informe a média da disciplina 1: ");
        mediasDisciplinas[0] = scanner.nextDouble();

        System.out.print("Informe a média da disciplina 2: ");
        mediasDisciplinas[1] = scanner.nextDouble();

        System.out.print("Informe a média da disciplina 3: ");
        mediasDisciplinas[2] = scanner.nextDouble();

        System.out.print("Informe a média da disciplina 4: ");
        mediasDisciplinas[3] = scanner.nextDouble();

        System.out.print("Informe a média da disciplina 5: ");
        mediasDisciplinas[4] = scanner.nextDouble();

        double somaMedias = mediasDisciplinas[0] + mediasDisciplinas[1] + mediasDisciplinas[2] + mediasDisciplinas[3] + mediasDisciplinas[4];
        double mediaPeriodo = somaMedias / mediasDisciplinas.length;

        System.out.println("\nMédia do Período: " + mediaPeriodo);
    }
}

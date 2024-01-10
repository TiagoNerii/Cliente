/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividades;

import java.util.Scanner;

/**
 *
 * @author tiago.nascimento
 */
public class ResistenciaEqui {
public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("Digite o valor de R1:");
        double R1 = scanner.nextDouble();

        System.out.println("Digite o valor de R2:");
        double R2 = scanner.nextDouble();

        System.out.println("Digite o valor de R3:");
        double R3 = scanner.nextDouble();

        System.out.println("Digite o valor de R4:");
        double R4 = scanner.nextDouble();

        double resistenciaEquivalente = ((R1 * R2) / (R1 + R2) + R3) + (((R1 * R2) / (R1 + R2) + R3) * R4) + (R2 * R1);

        System.out.println("A resistência equivalente é: " + resistenciaEquivalente);
        }
    }
}

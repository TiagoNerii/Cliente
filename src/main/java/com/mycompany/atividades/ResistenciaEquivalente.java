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

public class ResistenciaEquivalente {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Informe o valor do resistor R1:");
            double r1 = scanner.nextDouble();
            System.out.println("Informe o valor do resistor R2:");
            double r2 = scanner.nextDouble();
            System.out.println("Informe o valor do resistor R3:");
            double r3 = scanner.nextDouble();
            System.out.println("Informe o valor do resistor R4:");
            double r4 = scanner.nextDouble();
            
            double parte1 = ((r1 * r2) / (r1 + r2)) + r3;
            double parte2 = parte1 * r4 + (r2 * r1);
            double resistenciaEquivalente = parte1 + parte2;
            
            System.out.println("A resistência equivalente é: " + resistenciaEquivalente );
        }
    }
}




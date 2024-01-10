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
public class ConversorDolarReal {
    public static void main(String[] args) {
    
    double cotacaoDolar = 4.89;
    
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o valor em dolar: ");
            double valorDolar = scanner.nextDouble();
            
            double valorReal = valorDolar * cotacaoDolar;
            System.out.println("\n=== Resultados ===");
            System.out.println("Cotação do dólar: " + cotacaoDolar);
            System.out.println("Valor em dólares: " + valorDolar);
            System.out.println("Valor em reais: " + valorReal);
        }                
    }
}    

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

public class ConversaoDolarReal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double cotacaoDolar = 4.89;
        
        System.out.print("Digite o valor em dólar: ");
        double valorDolar = scanner.nextDouble();


        double valorReal = valorDolar * cotacaoDolar;

        System.out.println("\nResultados:");
        System.out.println("Cotação do dólar: " + cotacaoDolar);
        System.out.println("Valor em dólar: " + valorDolar);
        System.out.println("Valor convertido para real: " + valorReal);
    }
}


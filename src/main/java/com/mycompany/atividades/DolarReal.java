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
public class DolarReal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double cotacaoDolar = 4.89;
        
        System.out.println("Digite o valor em dolar : ");
        
        double valorDolar = scanner.nextDouble();
        
        double valorReal = valorDolar * cotacaoDolar;
        
        System.out.println("\nResultados");
        System.out.println("Cotação do Dolar: "+ cotacaoDolar);
        System.out.println("Valor em dolar: "+ valorDolar);
        System.out.println("Resultado conversão: "+ valorReal);
    }
}

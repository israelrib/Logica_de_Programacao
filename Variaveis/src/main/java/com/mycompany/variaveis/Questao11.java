/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.variaveis;

import java.util.Scanner;

/* QUESTÃO 11: Solicite 3 número decimais ao usuário, e devolva a ele a soma, a multiplicação e a divisão
do primeiro com último número.*/
public class Questao11 {
    public static void main(String[] args) {
        
        int num1 , num2 , num3 , soma, mult , div;
        
        Scanner entradaNumero = new Scanner(System.in);
        
        System.out.println("Informe o 1 numero: ");
        num1 = entradaNumero.nextInt();
        
        System.out.println("Informe o 2 numero: ");
        num2 = entradaNumero.nextInt();
        
        System.out.println("Informe o 3 numero: ");
        num3 = entradaNumero.nextInt();
        
        // SOMA
        soma = num1 + num2 + num3;
        System.out.println("A soma dos valores informados e: "+soma);  
        // MULTIPLICAÇÃO
        mult = num1 * num2 * num3;
        System.out.println("A multiplicacao dos valores informados e: "+mult);
        // DIVISÃO
        div = num1 / num3;
        System.out.println("A divisao dos valores informados e: "+div);
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.variaveis;

import java.util.Scanner;

/**
 *
 * @author IsraelSantos
 */
public class CalculosBasicos {
    
    public static void main(String[] args) {
        
        // TRABALHAR COM CALCULO DE SOMA
        int numero1 , numero2 , resultadoResto;
        double resultadoSoma , resultadoSub , resultadoMult , resultadoDiv;
        Scanner entradaNumero = new Scanner(System.in);
        
        System.out.println("Digite um valor inteiro: ");
        numero1 = entradaNumero.nextInt();
        
        System.out.println("Digite outro valor inteiro: ");
        numero2 = entradaNumero.nextInt();
        
        // SOMA
        resultadoSoma = numero1 + numero2;
        
        System.out.println("A soma dos numero informados e: "+resultadoSoma);
        
        // SUBTRAÇÃO
        resultadoSub = numero1 - numero2;
        System.out.println("A subtracao dos numeros informados e: "+resultadoSub);
        
        // MULTIPLICAÇÃO
        resultadoMult = numero1 * numero2;
        System.out.println("A multiplicacao dos numeros informados e: "+resultadoMult);
        
        // DIVISÃO 
        resultadoDiv = numero1 / numero2;
        System.out.println("A divisao dos numeros informados e: "+resultadoDiv);
        
        // CÁLCULO DE RESTO        
        resultadoResto = numero1 % numero2;
        System.out.println("O resto da divisao dos numeros e: "+resultadoResto);
    }
}

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
public class SomarDoisNumeros {
    public static void main(String[] args) {
        int num1;
        int num2;
        int soma;
        
        Scanner entradaNumero = new Scanner(System.in);
        
        System.out.println("Informe um numero: ");
        num1 = entradaNumero.nextInt();
        System.out.println("Informe um segundo numero: ");
        num2 = entradaNumero.nextInt();
        
        soma = num1 + num2;
        
        System.out.println("A soma dos numeros informados e: "+soma);
    }
}

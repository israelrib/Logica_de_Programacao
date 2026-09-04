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
public class CalculoMedia {
    public static void main(String[] args) {
        double nota1;
        double nota2;
     
        
        Scanner entradaNumero = new Scanner(System.in);
        
        System.out.println("Informe um numero: ");
        nota1 = entradaNumero.nextDouble();
        
        System.out.println("Informe um segundo numero: ");
        nota2 = entradaNumero.nextDouble();
        
        double media = (nota1+nota2)/2;
        
        System.out.println("A media e: " +media);
    }
}

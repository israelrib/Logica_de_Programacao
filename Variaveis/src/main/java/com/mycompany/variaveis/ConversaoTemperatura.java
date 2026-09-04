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
public class ConversaoTemperatura {
    public static void main(String[] args) {
        
        double temp;
        
        Scanner entradaNumero = new Scanner(System.in);
        
        System.out.println("Informe uma temperatura em graus Celsius: ");
        temp = entradaNumero.nextDouble();
        
        System.out.println("A temperatura informada foi: " +temp+ " ºC");
    }
}

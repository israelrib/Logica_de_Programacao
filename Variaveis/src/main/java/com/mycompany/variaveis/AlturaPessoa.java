/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.variaveis;

import java.util.Scanner;

public class AlturaPessoa {
    public static void main(String[] args) {
        float altura;
        
        Scanner entradaNumero = new Scanner(System.in);
        
        System.out.println("Informe sua altura em metros: ");
        altura = entradaNumero.nextFloat();
        
        System.out.println("Sua altura e " +altura+ " metros");
    }
}

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
public class CadastroCompleto {
    public static void main(String[] args) {
        
        String nome;
        int idade;
        float altura;
        
        Scanner entradaTexto = new Scanner(System.in);
        Scanner entradaNumero = new Scanner(System.in);
        
        System.out.println("Informe seu nome: ");
        nome = entradaTexto.nextLine();
        
        System.out.println("Informe sua idade: ");
        idade = entradaNumero.nextInt();
        
        System.out.println("Informe sua altura: ");
        altura = entradaNumero.nextFloat();
        
        System.out.println("Ola, "+nome+" . Sua idade e "+idade+" e a sua altura e "+altura);
    }
}

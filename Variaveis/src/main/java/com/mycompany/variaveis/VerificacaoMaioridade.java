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
public class VerificacaoMaioridade {
    public static void main(String[] args) {
        
        int idade;
        boolean maiorIdade;
        
        Scanner entradaNumero = new Scanner (System.in);
                
        System.out.println("Informe sua idade: ");
        idade = entradaNumero.nextInt();
        
        maiorIdade = idade >= 18;
        
        System.out.println("Maior de idade: "+ maiorIdade);
    }
}

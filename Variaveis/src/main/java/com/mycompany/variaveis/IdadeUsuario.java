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
public class IdadeUsuario {
    public static void main(String[] args) {
        int idade;
        Scanner entradaNumero = new Scanner(System.in);
        System.out.println("Informe sua idade: ");
        idade = entradaNumero.nextInt();
        System.out.println("Voce tem "+idade+ " anos.");
    }
}

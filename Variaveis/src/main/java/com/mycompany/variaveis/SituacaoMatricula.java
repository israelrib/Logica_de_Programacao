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
public class SituacaoMatricula {
    public static void main(String[] args) {
        
        boolean matriculado;
        
        Scanner entradaLogica = new Scanner(System.in);
        
        System.out.println("O aluno esta matriculado? Digite true ou false:");
        matriculado = entradaLogica.nextBoolean();

        System.out.println("Aluno matriculado: " + matriculado);
    }
}

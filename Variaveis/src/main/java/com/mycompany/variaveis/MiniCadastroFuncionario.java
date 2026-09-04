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
public class MiniCadastroFuncionario {
    public static void main(String[] args) {
        
        String nome;
        int idade;
        double salario;
        boolean carteiraAssinada;
        
        Scanner entradaTexto = new Scanner (System.in);
        Scanner entradaNumero = new Scanner(System.in);
        Scanner entradaLogica = new Scanner(System.in);
        
        System.out.println("Informe o nome do funcionario: ");
        nome = entradaTexto.nextLine();
        
        System.out.println("Informe a idade do funcionario: ");
        idade = entradaNumero.nextInt();
        
        System.out.println("Informe o salario do funcionario: ");
        salario = entradaNumero.nextDouble();
        
        System.out.println("Esse funcionario possui carteira assinada? Digite true ou false: ");
        carteiraAssinada = entradaLogica.nextBoolean();
        
        System.out.println("Nome do funcionario: "+nome);
        System.out.println("Idade do funcionario "+idade);
        System.out.println("Salario do funcionario "+salario);
        System.out.println("Possui carteira assinada? "+carteiraAssinada);
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.condicional;

import java.util.Scanner;

/**
 *
 * @author IsraelSantos
 */
public class Desafio01 {
    public static void main(String[] args) {
        String nome, tipoIngresso;
        int idade;
        boolean autorizacao = false;
        
        Scanner entradaTexto = new Scanner(System.in);
        Scanner entradaNumero = new Scanner(System.in);
        Scanner entradaLogica = new Scanner(System.in);
        
        System.out.println("Informe o seu nome:");
        nome = entradaTexto.nextLine();
        
        System.out.println("Informe sua idade:");
        idade = entradaNumero.nextInt();
        
        System.out.println("Qual tipo de ingresso?");
        tipoIngresso = entradaNumero.nextLine();
        
        System.out.println("Voce possui autorizacao? Digite 'True' para SIM e 'False' para NAO");
        autorizacao = entradaLogica.nextBoolean();
        
        if(idade >= 18 && tipoIngresso.equals("Vip")) {
            System.out.println("Acesso VIP liberado!");
        }else if(idade >= 18 && tipoIngresso.equals("Comum")){
            System.out.println("Acesso comum liberado!");
        }else if((idade == 16 || idade == 17) && autorizacao==true){
            System.out.println("Acesso liberado com autorização!");
        }else if(tipoIngresso.equals("Professor") || tipoIngresso.equals("Funcionario")){
            System.out.println("Acesso Especial Liberado!");
        }else{
            System.out.println("Acesso Negado!");
        }
        System.out.println("Ola "+nome+", voce possui "+idade+" anos");
    }
}

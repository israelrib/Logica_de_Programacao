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
public class DesafioSwitchCase {
    public static void main(String[] args) {
        
        int numProduto, qtdProduto;
        double valorTotal;
        
        Scanner entradaNumero = new Scanner(System.in);
        
        System.out.println("============== LANCHONETE ==============");
        System.out.println("Seja bem vindo(a). Faca seu pedido!");
        System.out.println("1 - Hamburguer ......... R$ 15,00\n2 - Pizza .............. R$ 25,00\n3 - Cachorro-quente .... R$ 12,00\n4 - Refrigerante ....... R$ 6,00\n5 - Suco ............... R$ 8,00");
        System.out.println("Qual sua opcao? ");
        numProduto = entradaNumero.nextInt();
        System.out.println("Informe a quantidade do produto selecionado: ");
        qtdProduto = entradaNumero.nextInt();
        
        
        switch(numProduto){
            case 1:
                valorTotal = 15 * qtdProduto;
                System.out.println("O pedido escolhido foi o Hambúrguer\nValor: R$ 15,00\nQuantidade: "+qtdProduto+"\nTotal a pagar: R$ "+valorTotal); break;
            case 2:
                valorTotal = 25 * qtdProduto;
                System.out.println("O pedido escolhido foi a Pizza\nValor: R$ 25,00\nQuantidade: "+qtdProduto+"\nTotal a pagar: R$ "+valorTotal); break;
            case 3:
                valorTotal = 12 * qtdProduto;
                System.out.println("O pedido escolhido foi o Cachorro-quente\nValor: R$ 12,00\nQuantidade: "+qtdProduto+"\nTotal a pagar: R$ "+valorTotal); break;
            case 4:
                valorTotal = 6 * qtdProduto;
                System.out.println("O pedido escolhido foi o Refrigerante\nValor: R$ 6,00\nQuantidade: "+qtdProduto+"\nTotal a pagar: R$ "+valorTotal); break;
            case 5:
                valorTotal = 8 * qtdProduto;
                System.out.println("O pedido escolhido foi o Suco\nValor: R$ 8,00\nQuantidade: "+qtdProduto+"\nTotal a pagar: R$ "+valorTotal); break;
            default:
                System.out.println("A opcao escolhida e invalida!");
        }
    }
}

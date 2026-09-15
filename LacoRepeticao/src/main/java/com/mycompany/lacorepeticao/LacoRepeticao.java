/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lacorepeticao;

import java.util.Scanner;

/**
 *
 * @author IsraelSantos
 */
public class LacoRepeticao {

    public static void main(String[] args) {
        // laco de repeticao FOR
        
        String [] listaConvidados = new String[20];
        Scanner entradaTexto = new Scanner(System.in);
        
        // SOLICITAR QUE A DONA DA FESTA PREENCHA A LISTA
        
        for(int cont =0;cont<=19;cont++){
            System.out.println("Digite o nome do convidado: ");
            listaConvidados[cont] = entradaTexto.nextLine();
        }
        for(int cont = 0; cont<=19;cont++){
            System.out.println("Convidado "+cont+" : "+listaConvidados[cont]);
        }
    }
}

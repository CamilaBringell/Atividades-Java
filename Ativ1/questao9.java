/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.questao_9;

/**
 *
 * @author Camila Bringel
 */
import java.util.Scanner;
public class Questao_9 {

    public static void main(String[] args) {
        int cont = 0;
        float soma = 0,nota;
        Scanner ler = new Scanner (System.in);
        while ( cont < 3){
            System.out.println("Digite nota:");
            nota = ler.nextFloat();
            soma += nota;
            cont++;
        }
        System.out.println("A media é:"+soma/3);
    }
}

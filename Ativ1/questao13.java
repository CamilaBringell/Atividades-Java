/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.questao13;

/**
 *
 * @author Camila Bringel
 */
import java.util.Scanner;
public class Questao13 {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int numero = 0;
        
        do {
            System.out.print("Digite um número: ");
            numero = ler.nextInt();
        } while (numero > 1);
        
        System.out.println("Conseguiu!");
        
        ler.close();
        
    }

}
     
    


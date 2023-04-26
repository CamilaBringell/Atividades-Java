/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.questao14;

/**
 *
 * @author Camila Bringel
 */
import java.util.Scanner;
public class Questao14 {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int numero, cont = 0;
        
        do {
            System.out.print("Digite um número: ");
            numero = ler.nextInt();
            cont += numero;
        } while (numero != 0);
        
        System.out.println("Total:"+cont);
        
        ler.close();
        
    }

}
     
    


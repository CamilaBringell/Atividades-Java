/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.questao11;

/**
 *
 * @author Camila Bringel
 */
import java.util.Scanner;
public class Questao11 {

    public static void main(String[] args) {
        int num;
        Scanner ler = new Scanner (System.in);
            System.out.println("Informe um numero de 12 a 20:");
            num = ler.nextInt();
        while (num < 12 || num > 20){
            System.out.println("entrada inválida");
            System.out.println("Informe um numero de 12 a 20:");
            num = ler.nextInt();
            
        }
        if(num >=12 && num <=20){
            System.out.println(num);
        }
    }
}

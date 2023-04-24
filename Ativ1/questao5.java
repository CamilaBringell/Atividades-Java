/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.questao5;

/**
 *
 * @author Camila Bringel
 */
import java.util.Scanner;
public class Questao5 {
   
    public static void main(String[] args) {
         int impar = 0, par =0 ,n;
         Scanner ler = new Scanner (System.in); 
        
        for (int i = 1; i < 11; i++){
            System.out.println("Digite um numero de 1 a 10:");
		n = ler.nextInt();
                if (n % 2 == 0){
                par++;             
                }
                else if (n % 2 >= 1){
                    impar++;
                }
            }
        System.out.println("Quantidade de pares:"+par);
        System.out.println("Quantidade de impares:"+impar);
        }
        
    }


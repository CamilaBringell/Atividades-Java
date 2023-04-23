/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.questao6;

/**
 *
 * @author Camila Bringel
 */
import java.util.Scanner;
public class Questao6 {
        
    public static void main(String[] args) {
        int num, dentro = 0, fora = 0;
        Scanner ler = new Scanner (System.in);
        for (int i = 0; i < 10; i++){
            System.out.println("Informe um numero de 1 a 10:");
            num = ler.nextInt();
            if (num >= 10 && num <= 20){
                dentro = i+1;        
            }
            else{
                fora = i+1;
        }
            
    }
         System.out.println("Estão no intervalo de 10 a 20:"+dentro);
         System.out.println("Estão fora do intervalo de 10 a 20:"+fora);
}
}

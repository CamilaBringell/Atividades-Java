/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.questao4;

/**
 *
 * @author Camila Bringel
 */
import java.util.Scanner;
public class Questao4 {

    public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade ;
		int soma = 0;
		
		for (int i = 0; i <= 15; i++) {
                System.out.println("Digite a idade "+i+":");
		idade = ler.nextInt();
                soma += idade;
		}
                System.out.println("Sua média é:" + soma/16);
	}
}


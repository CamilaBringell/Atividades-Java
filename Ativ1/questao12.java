/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.questao12;

/**
 *
 * @author Camila Bringel
 */
import java.util.Scanner;
public class Questao12 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int qtdHabitantes = 0;
        int maiorId = 0, menorId = Integer.MAX_VALUE;
        double somaSalario = 0, menorSalario = Double.MAX_VALUE;
        int qtdMulheres = 0, idMenorSalario = 0;
        char sexMenorSalario = ' ';
        
        while (qtdHabitantes <= 0) {
            
            System.out.print("Digite a quantidade de habitantes da região: ");
            qtdHabitantes = ler.nextInt();
  
            if (qtdHabitantes <= 0) {
                System.out.println("A quantidade de habitantes deve ser maior do que zero!");
            }
            
        }
        for (int i = 1; i <= qtdHabitantes; i++) {
            
            System.out.println("Dados do habitante " + i + ":");
            
            System.out.print("Digite a idade: ");
            int idade = ler.nextInt();
            
            if (idade > maiorId) {
                maiorId = idade;
            }
            
            if (idade < menorId) {
                menorId = idade;
            }
            
            System.out.print("Digite o sexo (M/F): ");
            char sexo = ler.next().charAt(0);
            
            if (sexo == 'F') {
                qtdMulheres++;
            }
            
            System.out.print("Digite o salário: ");
            double salario = ler.nextDouble();
            
            somaSalario += salario;
            
            if (salario < menorSalario) {
                menorSalario = salario;
                idMenorSalario = idade;
                sexMenorSalario = sexo;
            }
            
        }
        
        double mediaSalarios = somaSalario / qtdHabitantes;
        
        System.out.println("Média dos salários: " + mediaSalarios);
        System.out.println("Maior idade: " + maiorId);
        System.out.println("Menor idade: " + menorId);
        System.out.println("Quantidade de mulheres: " + qtdMulheres);
        System.out.println("Idade e sexo da pessoa com menor salário: " + idMenorSalario + ", " + sexMenorSalario);
        
        ler.close();
    }
}

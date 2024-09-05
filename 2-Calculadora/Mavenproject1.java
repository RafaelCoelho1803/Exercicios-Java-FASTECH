/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;
import java.util.Scanner; 

/**
 *
 * @author rcoel
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        calculadora ca = new calculadora();
        //Leitura do calculo
        Scanner cal = new Scanner(System.in);
        System.out.println("Soma = 1 , Subtração = 2 , Divisão = 3 e Multiplicação = 4");
        int calculo = cal.nextInt();
        
        //Leitura do primeiro número
        Scanner N1 = new Scanner(System.in);
        System.out.println("Digite o Primeiro Número:");
        int numero1 = N1.nextInt();
        
        //Leitura do segundo número
        Scanner N2 = new Scanner(System.in);
        System.out.println("Digite o Segundo Número:");
        int numero2 = N2.nextInt();
		
		
		
		//int calculo = 4;
		switch (calculo) {
		  case 1:
			System.out.println("Resultado da Soma ="+ca.Soma(numero1, numero2));
			break;
		  case 2:
			System.out.println("Resultado da Subtração ="+ca.Subtração(numero2, numero1));
			break;
		  case 3:        
                        try {
                    System.out.println("Resultado da Divisão = " + ca.Divisao(numero2, numero1));
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                }
                break;

		  case 4:
			System.out.println("Resultado da Multiplicação ="+ca.Multiplicacao(numero1, numero2));
			break;
		  default:
			System.out.println("Digite um valor de 1 a 4!");

		}
    }
}

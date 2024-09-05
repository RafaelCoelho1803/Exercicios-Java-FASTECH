/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author rcoel
 */
public class calculadora {
    private int numero1;
    int calculo;
	private int numero2;
	
	
	public int getNumero1() {
		return numero1;
	}
	public int getNumero2() {
		return numero2;
	}
	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}
	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}
        public int Soma(int numero2,int numero1) {
		calculo = numero1+numero2;
                return calculo;
	}
        public int Subtração(int numero2,int numero1) {
		calculo = numero1-numero2;
                return calculo;
	}
        public int Multiplicacao(int numero2,int numero1) {
		calculo = numero1*numero2;
                return calculo;
	}
        public int Divisao(int numero2,int numero1) {
		calculo = numero1/numero2;
                return calculo;
	}

	
}
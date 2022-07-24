package br.com.rizia;
/*2. Escreva um sistema que receba valores de base e altura de um triângulo e verifique
se são valores válidos (positivos maiores que zero). Em caso afirmativo, calcule e
imprima na tela a área do triângulo*/
public class Triangulo {
	double base;
	double altura;
		
public void area (double base, double altura) {
		if (base>0 && altura>0){
		double area = (base*altura)/2;
		System.out.println("A area do seu triângulo é: " + area);
		}
		else {
		System.out.println("O(s) número(s) não são válido(s)");
		}
	}
}

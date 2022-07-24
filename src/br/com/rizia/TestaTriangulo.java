package br.com.rizia;

import java.util.Scanner;

public class TestaTriangulo {

		public static void main(String[] args) {
			double base;
			double altura;
			
			Scanner entrada = new Scanner(System.in);
			Triangulo c = new Triangulo();
			
			System.out.print("Digite o valor da base do triângulo: ");
			base = entrada.nextDouble();
			System.out.print("Digite o valor da altura do triângulo: ");
			altura = entrada.nextDouble();
			
			c.area(base,altura);
		}
	}
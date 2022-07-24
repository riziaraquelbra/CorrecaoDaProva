package br.com.rizia;

import java.util.Scanner;

public class TestaNumeroZero {

		public static void main(String[] args) {
			int numero;
			
			Scanner entrada = new Scanner(System.in);
			NumeroZero n = new NumeroZero();
			
			do {
				System.out.println("Digite um número qualquer: ");
				numero = entrada.nextInt();
				//entrada.nextLine();
				if(numero == 0) {
					break;
				}
				else {
				n.somar(numero);	
				}
			}
			while(numero != 0);
			System.out.println("A soma é: " + n.soma);
			entrada.close();
		}
}

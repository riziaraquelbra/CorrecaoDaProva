package br.com.rizia;

import java.util.Scanner;

public class TestaCustoConsumidor {

	public static void main(String[] args) {
		double custoFabrica;
		
		Scanner entrada = new Scanner(System.in);
		CustoConsumidor c = new CustoConsumidor();
		
		System.out.print("Digite o custo de fábrica do carro: ");
		custoFabrica = entrada.nextDouble();
		
		c.custo(custoFabrica);
		
		entrada.close();
	}
}


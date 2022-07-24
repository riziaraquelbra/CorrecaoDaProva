package br.com.rizia;
/*1. O custo ao consumidor de um carro novo, é a soma do custo de fábrica com a percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo
que a percentagem do distribuidor seja de 28% e os impostos de 45%, escreva um sistema que leia o custo de fábrica de um carro e imprima na tela o custo ao
consumidor.*/
public class CustoConsumidor {
	private double custoFabrica;
	final double percentDist = 0.28;
	final double imposto = 0.45;
	
	public double getCustoFabrica() {
		return custoFabrica;
	}

	public void setCustoFabrica(double custoFabrica) {
		this.custoFabrica = custoFabrica;
	}
	
public void custo (double custoFabrica) {
	
	double custoCarroNovo = custoFabrica + (custoFabrica*percentDist) + (custoFabrica*imposto);
	
	System.out.println("O valor do custo ao consumidor é: " + custoCarroNovo);
	
		}
}


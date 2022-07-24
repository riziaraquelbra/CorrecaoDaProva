package br.com.rizia;
/*Crie uma um programa para trabalhar com estoque de uma loja, o 
 * programa deverá trabalhar com Collection do tipo ArrayList do Java para manipular os dados desse
estoque, o programa deverá atender as seguintes funcionalidades:
 Armazenar dados da ArrayList
 Remover dados da ArrayList;
 Atualizar dados da ArrayList. 
 Apresentar todos os dados da ArrayList.*/

import java.util.ArrayList;
import java.util.Scanner;

public class TestaEstoque {
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Produto> listaDeProdutos = new ArrayList<>();
		char escolhaMenu;
		
		do { 
			mostrarMenu();
			System.out.println("Digite uma opção: ");
			escolhaMenu = Character.toLowerCase(sc.next().charAt(0)); // Ler o primeiro caractere
			sc.nextLine();
			
			while(escolhaMenu != 'a' && escolhaMenu != 'b' && escolhaMenu != 'c' && escolhaMenu != 'd' && escolhaMenu != 'e') {
				System.out.println("Digite uma opção válida: ");
				escolhaMenu = Character.toLowerCase(sc.next().charAt(0));
				sc.nextLine();
			}
			
			switch (escolhaMenu) {
			
			case 'a': {
				System.out.println("Digite o nome do produto: ");
				String nomeTemp = sc.nextLine();
				System.out.println("Digite a quantidade do produto: ");
				int qtdTemp = sc.nextInt();
				sc.nextLine();
				Produto pt = new Produto ();
				pt.setNome(nomeTemp);
				pt.setQuant(qtdTemp);
				listaDeProdutos.add(pt);
				System.out.println();
				break;
			}
			case 'b': {
				int i = 0; 
				String nomeBuscar;
				System.out.println("Digite o nome do produto que deseja remover: ");
				nomeBuscar = sc.nextLine();
				if(listaDeProdutos.size() == 0) {
					System.out.println("Não existe produto cadastrado.");
				} else {
					for(Produto produto: listaDeProdutos) {
						if(produto.getNome().equals(nomeBuscar)) {
							listaDeProdutos.remove(i);
							System.out.println("Seu produto foi removido.");
							break;
						}
						else{
							i++;
						}
					}
					}
				if (i == listaDeProdutos.size()-1) {
					System.out.println("Este produto não existe na lista. ");
				}
				break;
				}
			case 'c': {
				int i = 0; 
				String nomeBuscar;
				System.out.println("Digite o nome do produto que deseja atualizar: ");
				nomeBuscar = sc.nextLine();
				if(listaDeProdutos.size() == 0) {
					System.out.println("Não existe produto cadastrado.");
					}
				else {
					for(Produto produto: listaDeProdutos) {
						if (produto.getNome().equals(nomeBuscar)) {	
							System.out.println("Escolha o que deseja atualizar: a) Nome do produto / b) Quantidade do produto / c) Sair");
							char escolhaAtualizar = Character.toLowerCase(sc.next().charAt(0));
							sc.nextLine();
							while(escolhaAtualizar != 'a' && escolhaAtualizar != 'b' && escolhaAtualizar != 'c') {
								System.out.println("Opção inválida digite novamente.");
								escolhaAtualizar = Character.toLowerCase(sc.next().charAt(0));
								sc.nextLine();
							}					
							if (escolhaAtualizar == 'a') {
								System.out.println("Digite um novo nome para o produto: ");
								String nomeTemp = sc.nextLine();
								Produto prodTemp = produto; // criando um produto objeto baseado no produto referenciado da lista.
								prodTemp.setNome(nomeTemp);
								listaDeProdutos.set(i,prodTemp);
								System.out.println("O nome do seu produto foi atualizado.");
							}
							else if (escolhaAtualizar == 'b') {	
									System.out.println("Digite a quantidade de estoque: ");
									int quantTemp = sc.nextInt();
									sc.nextLine();
									Produto prodTemp = produto; // criando um produto objeto baseado no produto referenciado da lista.
									prodTemp.setQuant(quantTemp);
									listaDeProdutos.set(i,prodTemp);
									System.out.println("A quantidade do produto foi atualizado.");
							}
							else {	
								break;
							}

						} else {
							i++;
						}
						
					}
					
				}
			
				break;
				}
			case 'd': {
				if(listaDeProdutos.size() == 0) {
					System.out.println("Não existe produto cadastrado.");
				} else {
					for(Produto produto: listaDeProdutos) {
					System.out.println(produto.toString());
					System.out.println();
				}
			}
			break;
			}
			case 'e': {
				break;
			}
			}
				
			
		}while(escolhaMenu != 'e');
		
		/*System.out.println("Digite o nome do produto: ");
		String nomeTemp = sc.nextLine();
		System.out.println("Digite a quantidade do produto: ");
		int qtdTemp = sc.nextInt();
		//Produto pt = new Produto (nomeTemp, qtdTemp);
		Produto pt = new Produto ();
		pt.setNome(nomeTemp);
		pt.setQuant(qtdTemp);
		System.out.println(pt.getNome());
		System.out.println(pt.getQuant());*/
}
		public static void mostrarMenu() {
			System.out.println("a) Armazenar dados do produto;");
			System.out.println("b) Remover dados do produto;");
			System.out.println("c) Atualizar dados do produto;");
			System.out.println("d) Apresentar todos os dados do produto;");
			System.out.println("e) sair;");
			System.out.println();
		}
}
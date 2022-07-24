package br.com.rizia;

public class Produto {
	
private int quant;
private String nome;

Produto() {
	
};

Produto(String nm, int qtd) {
	this.quant = qtd;
	this.nome = nm;
};

public int getQuant() {
	return quant;
}
public void setQuant(int quant) {
	this.quant = quant;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
@Override
public String toString() {
	return "Produto [quant =" + quant + ", nome =" + nome + "]";
}
}

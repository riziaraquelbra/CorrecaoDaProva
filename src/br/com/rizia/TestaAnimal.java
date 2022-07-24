package br.com.rizia;

public class TestaAnimal {

	public static void main(String[] args) {
		Cachorro c = new Cachorro();
		Cavalo cv = new Cavalo();
		Preguica p = new Preguica();
		
		c.emitirSom();
		cv.emitirSom();
		p.emitirSom();
		
		c.correr();
		cv.correr();
		
		p.subiremarvores();
	}

}

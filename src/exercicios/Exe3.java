package exercicios;

import java.util.LinkedList;

public class Exe3 {
	public static void main(String[] args) {

		int maior = 0;
		int menor = 100;
		int media = 0;

		LinkedList<Integer> lista = new LinkedList<Integer>();
		lista.add(50);
		lista.add(40);
		lista.add(30);
		lista.add(20);
		lista.add(10);

		for (Integer integer : lista) {

			if (integer > maior)
				maior = integer;

		}

		for (Integer integer : lista) {

			if (integer < menor)
				menor = integer;

		}

		for (Integer integer : lista) {
			media = media + integer;
		}
		media = media / lista.size();
		
		System.out.println("Maior valor: " + maior);
		System.out.println("Menor valor: " + menor);
		System.out.println("Média:" + media);
	}

}

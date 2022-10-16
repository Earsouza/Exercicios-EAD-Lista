package exercicios;

import java.util.LinkedList;

public class Exe11 {

	public static void main(String[] args) {
		int pares = 0;
		int maior = 0;
		LinkedList<Integer> lista = new LinkedList<Integer>();
		lista.add(5);
		lista.add(4);
		lista.add(3);
		lista.add(2);
		lista.add(1);

		for (Integer integer : lista) {

			if (integer > maior)
				maior = integer;

		}
		System.out.println("Maior valor: " + maior);

		System.out.printf("Valores pares: ");
		for (Integer integer : lista) {
			if (integer % 2 == 0) {
				pares = integer;
				System.out.printf("%d ",pares);

			}

		}
	}
}

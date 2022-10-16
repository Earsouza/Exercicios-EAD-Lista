package exercicios;

import java.util.LinkedList;

public class Exe9 {

	public static void main(String[] args) {
		int pares;
		LinkedList<Integer> lista = new LinkedList<Integer>();
		lista.add(5);
		lista.add(4);
		lista.add(3);
		lista.add(2);
		lista.add(1);
		
		for (Integer integer : lista) {
			if(integer%2 == 0) {
				pares = integer;
				System.out.println(pares);
			}
		}
		
	}

}

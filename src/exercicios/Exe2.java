package exercicios;

import java.util.Collections;
import java.util.LinkedList;

public class Exe2 {

	public static void main(String[] args) {
		
		LinkedList<Integer> lista = new LinkedList<Integer>();
		lista.add(5);
		lista.add(4);
		lista.add(3);
		lista.add(2);
		lista.add(1);
		Collections.sort(lista);
		System.out.println("Lista ordenada de forma crescente: " + lista);
		
		
		
	}

}

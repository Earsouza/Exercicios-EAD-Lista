package exercicios;

import java.util.LinkedList;

public class Exe7 {

	public static void main(String[] args) {

		LinkedList<Integer> lista = new LinkedList<Integer>();
		lista.add(50);
		lista.add(40);
		lista.add(30);
		lista.add(20);
		lista.add(10);
		
		System.out.println("Lista" + lista);
		//pega o valor e remove da lista
		System.out.println(lista.pollFirst());
		//lista.removeFirst();
		
		System.out.println("Lista após remoção: "+ lista);

	}

}

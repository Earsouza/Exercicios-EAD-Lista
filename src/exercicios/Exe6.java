package exercicios;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Exe6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> lista = new LinkedList<String>();
		lista.add("Carlos");
		lista.add("Joao");
		lista.add("Eduardo");

		Queue<String> fila = new LinkedList<>();
		fila.addAll(lista);

		Stack<LinkedList<String>> pilha = new Stack<LinkedList<String>>();
		pilha.add(lista);

		System.out.println("Lista original");
		for (String string : lista) {
			System.out.println(string);
		}
		System.out.println("\nPilha: ");
		for (LinkedList<String> linkedList : pilha) {
			System.out.println(linkedList);
		}
		
		System.out.println("\nFila: ");
		for (String string : fila) {
		System.out.println(string);	
		}
	}

}

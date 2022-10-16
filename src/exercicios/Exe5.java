package exercicios;

import java.util.LinkedList;
import java.util.Queue;

public class Exe5 {
	public static void main(String[] args) {

		Queue<Integer> fila1 = new LinkedList<>();
		Queue<Integer> fila2 = new LinkedList<>();
		Queue<Integer> fila3 = new LinkedList<>();

		fila1.add(2);
		fila1.add(3);
		fila1.add(4);

		fila2.add(4);
		fila2.add(5);
		fila2.add(6);

		System.out.println("Fila 1 - " + fila1);
		System.out.println("Fila 2 - " + fila2);

		for (Integer integer : fila1) {
			fila3.add(integer);
		}
		for (Integer integer2 : fila2) {

			if (!fila3.contains(integer2)) {
				fila3.add(integer2);
			}
		}
		System.out.println("Fila 3 - " + fila3);

	}
}

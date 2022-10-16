package exercicios;

import java.util.LinkedList;
import java.util.Queue;

public class Exe4 {
	public static void main(String[] args) {

		 Queue<Integer> fila1 = new LinkedList<>();
		 Queue<Integer> fila2 = new LinkedList<>();

		 fila1.add(1);
		 fila1.add(2);
		 fila1.add(3);
		 fila1.add(4);
		 fila1.add(5);
		 fila1.add(6);
		 
		 fila2.add(1);
		 fila2.add(2);
		 fila2.add(3);
		 fila2.add(4);
		 fila2.add(5);
		 
		 if(fila1.size()>fila2.size()) {
			 System.out.println("A primeira fila tem mais elementos");
		 }else if(fila2.size()>fila1.size()) {
			 System.out.println("A segunda fila tem mais elementos");
		 }else {
			 System.out.println("As duas filas tem a mesma quantidade de elementos");
		 }
		 
		
	}
}

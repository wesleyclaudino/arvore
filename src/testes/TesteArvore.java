package testes;

import java.util.Scanner;

import controller.ListaDeNodosControladora;
import model.Nodo;

public class TesteArvore {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ListaDeNodosControladora listaNodos = new ListaDeNodosControladora();
		Nodo nodo = null;
		
		for (int i = 0; i < 4; i++) {
			nodo = new Nodo();
			nodo.valor = scan.nextInt();
			Nodo.inserir(nodo);
			
			listaNodos.add(nodo);
		}
		listaNodos.listarOrdem(listaNodos.get(0));
	}
}
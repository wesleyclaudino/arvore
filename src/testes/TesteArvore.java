package testes;

import java.util.Scanner;

import controller.ListaDeNodosControladora;
import model.Nodo;
/*
 * @author: Wesley Claudino Rodrigues - 0014950
 */

// Classe para testes da árvore
public class TesteArvore {
	public static void main(String[] args) {
		// Inicializando os objetos para o uso
		Scanner scan = new Scanner(System.in);
		ListaDeNodosControladora listaNodos = new ListaDeNodosControladora();
		Nodo nodo = null;

		// Inserção de nodos na árvore
		for (int i = 0; i < 4; i++) {
			nodo = new Nodo();
			nodo.valor = scan.nextInt();
			Nodo.inserir(nodo);

			listaNodos.add(nodo);
		}

		// Listagem dos nodos nas 3 ordens
		listaNodos.listarOrdem(listaNodos.get(0));
	}
}
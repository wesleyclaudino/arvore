package testes;

import java.util.Scanner;

import model.Nodo;
/**
 * @author Wesley Claudino Rodrigues
 * @author Matheus André Pereira Góes
 **/
// Classe para testes da árvore
public class TesteArvore {
	public static void main(String[] args) {		
		// Inicializando os objetos para o uso
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite quantos nodos deseja inserir: ");
		int quantNodos = scan.nextInt();
		
		// Inserção de nodos na árvore
		for (int i = 0; i < quantNodos; i++) {
			Nodo nodo = new Nodo(scan.nextInt());
			Nodo.inserir(nodo.valor);
		}
		
		System.out.println("\n Pré-Ordem: ");
		Nodo.preOrdem(Nodo.raiz);
		System.out.println("\n Em-Ordem: ");
		Nodo.emOrdem(Nodo.raiz);
		System.out.println("\n Pós-Ordem: ");
		Nodo.posOrdem(Nodo.raiz);
		System.out.println("\n Nível: ");
		Nodo.nivel(Nodo.raiz);
	}
}
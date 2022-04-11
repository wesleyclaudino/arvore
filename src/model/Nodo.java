package model;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author Wesley Claudino Rodrigues
 * @author Matheus Andr� Pereira G�es
 **/
public class Nodo {
	public int valor;
	public Nodo nodoEsquerda, nodoDireita;
	public int maisAlto;

	public Nodo(int valor) {
		this.valor = valor;
	}
	public static Nodo raiz;
	
	// M�todos de inser��o de nodos
	public static void inserir(int valor) {
		inserir(raiz, valor);
	}
	
	public static void inserir(Nodo nodo, int valor) {
		if (nodo == null) {
			System.out.println("Raiz " + valor);
			raiz = new Nodo(valor);
		} else {
			if (valor < nodo.valor) {
				if (nodo.nodoEsquerda != null) {
					inserir(nodo.nodoEsquerda, valor);
				}else {
					System.out.println("Inserindo " + valor + " a esquerda de " + nodo.valor);
					nodo.nodoEsquerda = new Nodo(valor);
				}
			}else {
				if (nodo.nodoDireita != null) {
					inserir(nodo.nodoDireita, valor);
				}else {
					System.out.println("Inserindo " + valor + " a direita de " + nodo.valor);
					nodo.nodoDireita = new Nodo(valor);
				}
			}
		}
	}
	
	// Listagem na Pr�-Ordem
		// Pr�-ordem: o primeiro n� � o n� raiz, seguido pela sub-�rvore � esquerda e por fim pela sub-�rvore � direita.
	public static void preOrdem(Nodo nodo) {
		if (nodo != null) {
			System.out.print(nodo.valor + ", ");
			preOrdem(nodo.nodoEsquerda);
			preOrdem(nodo.nodoDireita);
		}
	}
	
	// Listagem Em-Ordem
		// Em-ordem: l�-se primeiro a sub-�rvore � esquerda, seguido pelo n� raiz e por fim pela sub-�rvore � direita.
	public static void emOrdem(Nodo nodo) {
		if (nodo != null) {
			emOrdem(nodo.nodoEsquerda);
			System.out.print(nodo.valor + ", ");
			emOrdem(nodo.nodoDireita);
		}
	}
	
	// Listagem na P�s-Ordem
		// P�s-ordem: l�-se os n�s da sub-�rvore � esquerda, depois os n�s da sub-�rvore � direita e por fim o n� raiz.
	public static void posOrdem(Nodo nodo) {
		if (nodo != null) {
			posOrdem(nodo.nodoEsquerda);
			posOrdem(nodo.nodoDireita);
			System.out.print(nodo.valor + ", ");
		}
	}
	
	// M�todo para mostrar n�vel da �rvore
		// N�vel: � o n�mero de n�s no caminho da raiz at� o n� desejado
	public static void nivel(Nodo nodo) {
		if (nodo == null) {
			System.out.println("Fila n�o existente.");
		} else {
			Deque<Nodo> fila = new ArrayDeque<>();
			fila.add(nodo);
			while (!fila.isEmpty()) {
				Nodo atual = fila.removeFirst();
				System.out.print(atual.valor + ", ");
				if (atual.nodoEsquerda != null) {
					fila.add(atual.nodoEsquerda);
				}
				if (atual.nodoDireita != null) {
					fila.add(atual.nodoDireita);
				}
			}
		}
	}
}
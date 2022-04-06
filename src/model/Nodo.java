package model;

public class Nodo {
	private static Nodo raiz;
	private Nodo pai;
	
	public int valor;
	private Nodo esquerda;
	private Nodo direita;
	
	// Método de inserção de nodos
	public static void inserir(Nodo nodo) {
		nodo.direita = null;
		nodo.esquerda = null;
		nodo.pai = null;
		if(raiz == null) {
			raiz = nodo;
		}else {
			Nodo aux = raiz;
			while(aux != null) {
				if(nodo.valor < aux.valor) {
					if (aux.esquerda == null) {
						aux.esquerda = nodo;
						break;
					}
					aux = aux.esquerda;
				}else {
					if(aux.direita == null) {
						aux.direita = nodo;
						break;
					}
					aux = aux.direita;
				}
			}
			nodo.pai = aux;
		}
	}
	
	// Listagem na Pré-Ordem
	public static void preOrdem(Nodo nodo) {
		System.out.print(nodo.valor + " ");
		if (nodo.esquerda != null) {
			preOrdem(nodo.esquerda);
		}
		if (nodo.direita != null) {
			preOrdem(nodo.direita);
		}
	}
	
	// Listagem Em-Ordem
	public static void emOrdem(Nodo nodo) {
		if (nodo.esquerda != null) {
			emOrdem(nodo.esquerda);
		}
		System.out.print(nodo.valor + " ");
		if (nodo.direita != null) {
			emOrdem(nodo.direita);
		}
	}
	
	// Listagem na Pós-Ordem
	public static void posOrdem(Nodo nodo) {
		if (nodo.esquerda != null) {
			emOrdem(nodo.esquerda);
		}
		if (nodo.direita != null) {
			emOrdem(nodo.direita);
		}
		System.out.print(nodo.valor + " ");
	}
}
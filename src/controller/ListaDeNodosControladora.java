package controller;

import java.util.ArrayList;

import model.Nodo;

public class ListaDeNodosControladora extends ArrayList<Nodo> {
	private static final long serialVersionUID = 1L;

	// Listagem dos nodos
	public void listarOrdem(Nodo nodo) {
		System.out.println("\nPr�-Ordem");
		Nodo.preOrdem(nodo);
		System.out.println("\nEm-Ordem");
		Nodo.emOrdem(nodo);
		System.out.println("\nP�s-Ordem");
		Nodo.posOrdem(nodo);
	}
}
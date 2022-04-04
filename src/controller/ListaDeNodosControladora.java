package controller;

import java.util.ArrayList;

import model.Nodo;

public class ListaDeNodosControladora extends ArrayList<Nodo> {
	private static final long serialVersionUID = 1L;

	public void listarOrdem(Nodo nodo) {
		System.out.println("\nPré-Ordem");
		Nodo.preOrdem(nodo);
		System.out.println("\nEm-Ordem");
		Nodo.emOrdem(nodo);
		System.out.println("\nPós-Ordem");
		Nodo.posOrdem(nodo);
		
//		switch (escolha) {
//			case 1: {
//				System.out.println("\nPré-Ordem");
//				Nodo.preOrdem(nodo);
//			}
//
//			case 2: {
//				System.out.println("\nEm-Ordem");
//				Nodo.emOrdem(nodo);
//			}
//
//			case 3: {
//				System.out.println("\nPós-Ordem");
//				Nodo.posOrdem(nodo);
//			}
//		}
	}
}
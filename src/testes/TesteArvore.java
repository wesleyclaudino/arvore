package testes;

import java.util.Scanner;

import model.Nodo;
/**
 * @author Wesley Claudino Rodrigues
 * @author Matheus Andr� Pereira G�es
 **/
// Classe para testes da �rvore
public class TesteArvore {
	public static void main(String[] args) {		
		// Inicializando os objetos para o uso
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite quantos nodos deseja inserir: ");
		int quantNodos = scan.nextInt();
		
		// Inser��o de nodos na �rvore
		for (int i = 0; i < quantNodos; i++) {
			Nodo nodo = new Nodo(scan.nextInt());
			Nodo.inserir(nodo.valor);
		}
		
		System.out.println("\n Pr�-Ordem: ");
		Nodo.preOrdem(Nodo.raiz);
		System.out.println("\n Em-Ordem: ");
		Nodo.emOrdem(Nodo.raiz);
		System.out.println("\n P�s-Ordem: ");
		Nodo.posOrdem(Nodo.raiz);
		System.out.println("\n N�vel: ");
		Nodo.nivel(Nodo.raiz);
	}
}
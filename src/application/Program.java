package application;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		// Criando uma lista de Strings
		List<String> minhaLista = new ArrayList<>();

		// Adicionando elementos à lista
		minhaLista.add("Maçã");
		minhaLista.add("Banana");
		minhaLista.add("Morango");

		// Imprimindo a lista
		System.out.println("Lista inicial: " + minhaLista);

		// Acessando e modificando elementos
		String primeiroElemento = minhaLista.get(0);
		System.out.println("Primeiro elemento: " + primeiroElemento);

		minhaLista.set(1, "Pêra");
		System.out.println("Lista após a modificação: " + minhaLista);

		// Verificando a presença de um elemento
		boolean contemMorango = minhaLista.contains("Morango");
		System.out.println("Contém Morango? " + contemMorango);

		// Removendo um elemento
		minhaLista.remove("Banana");
		System.out.println("Lista após a remoção: " + minhaLista);

		// Verificando o tamanho da lista
		int tamanho = minhaLista.size();
		System.out.println("Tamanho da lista: " + tamanho);

		// Verificando se a lista está vazia
		boolean listaVazia = minhaLista.isEmpty();
		System.out.println("A lista está vazia? " + listaVazia);

		// Limpando a lista
		minhaLista.clear();
		System.out.println("Lista após limpar: " + minhaLista);
	}

}

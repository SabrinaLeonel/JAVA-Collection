package collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Iterator;

public class CollectionSetExercicio3 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Criar um HashSet para armazenar os números inteiros
	        Set<Integer> meuSet = new HashSet<>();

	        System.out.println("Digite 10 valores inteiros não repetidos:");

	        // Solicitar ao usuário para inserir 10 valores inteiros não repetidos
	        for (int i = 0; i < 10; i++) {
	            System.out.print("Digite o valor " + (i + 1) + ": ");
	            int numero;

	            // Garantir que o usuário forneça um valor inteiro
	            while (true) {
	                try {
	                    numero = Integer.parseInt(scanner.nextLine());
	                    break; // Se a conversão for bem-sucedida, sair do loop
	                } catch (NumberFormatException e) {
	                    System.out.println("Por favor, digite um valor inteiro válido.");
	                    System.out.print("Digite novamente o valor " + (i + 1) + ": ");
	                }
	            }

	            // Adicionar o número ao Set
	            meuSet.add(numero);
	        }

	        // Exibir o conjunto resultante
	        System.out.println("\nListar dados do Set:");
	        Iterator<Integer> iterator = meuSet.iterator();
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }

	        // Fechar o Scanner para evitar vazamentos de recursos
	        scanner.close();
	}

}


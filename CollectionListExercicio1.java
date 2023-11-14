package collections;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionListExercicio1 {

	public static void main(String[] args) {
		String cor;
		Scanner leia = new Scanner(System.in);
					
		List<String> minhaLista = new ArrayList<String>();
		
		for (int i = 0; i <5; i ++) {
			System.out.println("Digite o nome da " +(i+1)+ "° cor: ");
			cor = leia.next();
			minhaLista.add(cor);
		}
		System.out.println("\nListar todas as cores: \n");
		
		
		for (int i =0; i <5; i++) {
			System.out.println(""+minhaLista.get(i));
		}
		
		System.out.println("\nOrdenar as cores: \n");
		Collections.sort(minhaLista);
		for(int i =0; i <5; i++) {
			System.out.println(minhaLista.get(i));
		}
		leia.close();
	}

}


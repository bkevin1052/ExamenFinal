import java.util.Scanner;

import gt.edu.url.problema2.ArrayList;
import gt.edu.url.problema2.ImplArrayManipulator;
import gt.edu.url.problema3.Animal;
import gt.edu.url.problema3.ArrayStack;
import gt.edu.url.problema3.CircularLinkedList;
import gt.edu.url.problema3.LeakyStack;

public class Main 
{

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		int opt;
		System.out.println("EXAMEN FINAL");
		System.out.println("1. problema 1");
		System.out.println("2. problema 2");
		opt = leer.nextInt();
		
		switch(opt)
		{
		case 1:
			System.out.println("**Permutaciones**");
			ArrayList<Integer> lista = new ArrayList<>();
			ImplArrayManipulator<Integer> ListaP = new ImplArrayManipulator<>();
			
			lista.add(0, 2);
			lista.add(1, 3);
			lista.add(2, 4);			
			System.out.println(ListaP.subsets(lista));	
			
			break;
		case 2:
			System.out.println("**Animal**");
			CircularLinkedList<Animal> listaAnimales = new CircularLinkedList<>();
			Animal nuevoAnimal = new Animal("bambi", 9, 3.90, "rojo");
			Animal nuevoAnimal2 = new Animal("leon", 8, 4.90, "amarillo");
			Animal nuevoAnimal3 = new Animal("tortuga", 10, 5.2, "verde");
			
			ArrayStack<Animal> pilaAnimal = new ArrayStack<>(3);
			
			listaAnimales.addFirst(nuevoAnimal);
			pilaAnimal.push(nuevoAnimal);
			listaAnimales.addLast(nuevoAnimal2);
			pilaAnimal.push(nuevoAnimal2);
			listaAnimales.addLast(nuevoAnimal3);
			pilaAnimal.push(nuevoAnimal3);
			
			pilaAnimal.saveHistory(nuevoAnimal);
			pilaAnimal.saveHistory(nuevoAnimal2);
			pilaAnimal.saveHistory(nuevoAnimal3);
			
			System.out.println("ACTUAL");
			System.out.println(pilaAnimal.actual().toString());
			
			System.out.println("DESHACER");
			System.out.println(pilaAnimal.undo());		
			
			
			for(int i = 0; i < pilaAnimal.size(); i++)
			{
				System.out.println(pilaAnimal.pop().toString());
			}
			
			System.out.println("**NUEVO ANIMAL INSERTADO**");
			Animal nuevoAnimal4 = new Animal("PERRO", 10, 6.2, "cafe");
			if( pilaAnimal.isEmpty() == true)
			{
				listaAnimales.addLast(nuevoAnimal4);
				pilaAnimal.push(nuevoAnimal4);
				pilaAnimal.saveHistory(nuevoAnimal4);			
				System.out.println("**NUEVO ANIMAL INSERTADO**");
				System.out.println("**HISTORIAL**");
				
			}else
			{
				System.out.println("No hay espacio");
			}
		
			for(int i =0; i < pilaAnimal.size(); i++)
			{
				System.out.println(pilaAnimal.pop().toString());
			}			
			break;
		}

	}

}

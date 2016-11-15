import java.util.Random;

public class LinkedList
{
	public static int generate_random(int min, int max)
	{
		Random rand = new Random();
    	int randomNum = rand.nextInt((max - min) + 1) + min;
    	return randomNum;
	}

	public static void main(String [] args)
	{
		// Testing Purpose
		// generate a list with 10 random numbers
		int rand_number;
		Lista list = new Lista();
		Lista list2 = new Lista();
		list.insertarCabeza(0);
		list.insertarCabeza(1);
		list.insertarCabeza(2);
		list2.insertarCabeza(0);
		list2.insertarCabeza(1);
		list2.insertarCabeza(2);
		if(list.equals(list2))
		{
			System.out.println("Son iguales");
		}
		else
		{
			System.out.println("Son Diferentes");
		}
		/*
		for(int i = 0; i < 3; i++)
		{
			rand_number = generate_random(1,100);
			list.insertarCabeza(rand_number);
		}
		// list.insertarCabeza(5);
		list.imprimirLista();
		// System.out.println("Status : " + list.buscarPorValor(5));
		*/
	}
}
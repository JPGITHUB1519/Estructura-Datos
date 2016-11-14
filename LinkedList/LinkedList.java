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
		// generate a list with 10 random numbers
		int rand_number;
		Lista list = new Lista();
		for(int i = 0; i < 3; i++)
		{
			rand_number = generate_random(1,100);
			list.insertarCabeza(rand_number);
		}
		// list.insertarCabeza(5);
		list.imprimirLista();
		// System.out.println("Status : " + list.buscarPorValor(5));
	}
}
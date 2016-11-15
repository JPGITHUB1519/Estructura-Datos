/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg1.linked.list.project;
import java.util.Random;
/**
 *
 * @author Programador
 */

public class Project1LinkedListProject 
{
    
    public static int generate_random(int min, int max)
    {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }

    /**
     * @param args the command line arguments
     */
    public boolean isSubstring(String subs, String word)
    {
        return word.contains(subs);
    }
    public static void main(String[] args) 
    {
        // generate a list with 10 random numbers
        /*
        int rand_number;
        Lista list = new Lista();
        for(int i = 0; i < 3; i++)
        {
            list.insertarCabeza(i);
        }
        list.eliminarNodo(2);
        list.imprimirLista();
        */
        
        //Files.append_file("prueba.txt", "adios");
        
        String str1 = "pan";
        String str2 = "pan";
        
        if(str2.contains(str1))
        {
            System.out.println("Exito");
        }
         
    }   
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicelinkedlist;

/**
 *
 * @author Programador
 */
public class Lista 
{
    Nodo first;
    
    public Lista()
    {
        
    }
    
    public Lista(Nodo first)
    {
        this.first = first;
    }
    
    public boolean isEmpty()
    {
        if(this.first == null)
        {
            return true;
        }
        return false;
    }
    
    public void insertarNodoCabeza(Object value)
    {
        Nodo nuevo = new Nodo();
        nuevo.setValue(value);
        if(isEmpty())
        {
            this.first = nuevo;
        }
        else
        {
            nuevo.link = this.first;
            this.first = nuevo;
        }
    }
    
    public void insertarNodoCola(Object value)
    {
        Nodo nuevo = new Nodo();
        nuevo.value = value;
        if(isEmpty())
        {
            first = nuevo;
        }
        else
        {
            for(Nodo n = first; n != null; n = n.getLink())
            {
                if(n.link == null)
                {
                    n.link = nuevo;
                }
            }
        }
    }
    
    public void imprimirLista()
    {
        for(Nodo n = first; n != null; n = n.getLink())
        {
            System.out.println(n.value);
        }
    }
    
}

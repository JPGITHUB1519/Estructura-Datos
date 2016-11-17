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
public class Nodo 
{
    Object value;
    Nodo link;
    
    public Nodo()
    {
        
    }
    
    public Nodo(Object value)
    {
        this.value = value;
    }
    
    public Nodo(Object value, Nodo link)
    {
        this.value = value;
        this.link = link;
    }
    
    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Nodo getLink() {
        return link;
    }

    public void setLink(Nodo link) {
        this.link = link;
    }  
}

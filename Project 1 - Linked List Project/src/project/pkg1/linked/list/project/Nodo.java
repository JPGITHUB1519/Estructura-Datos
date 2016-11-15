package project.pkg1.linked.list.project;
public class Nodo
{
    Producto value;
    Nodo link;

    public Nodo()
    {
            this.value = null;
            this.link = null;
    }

    public Nodo(Producto value, Nodo node)
    {
            this.value = value;
            this.link = node;
    }

    public Nodo(Producto value)
    {
            this.value = value;
            this.link = null;
    }

    // getters
    public Object getvalue()
    {
            return this.value;
    }

    public Nodo getLink()
    {
            return this.link;
    }

    // setters
    public void setValue(Producto value)
    {
            this.value = value;
    }

    public void setLink(Nodo node)
    {
            this.link = node;
    }
}
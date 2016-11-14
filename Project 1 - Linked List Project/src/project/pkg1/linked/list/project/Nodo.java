package project.pkg1.linked.list.project;
public class Nodo
{
    Object value;
    Nodo link;

    public Nodo()
    {
            this.value = null;
            this.link = null;
    }

    public Nodo(Object value, Nodo node)
    {
            this.value = value;
            this.link = node;
    }

    public Nodo(Object value)
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
    public void setValue(Object value)
    {
            this.value = value;
    }

    public void setLink(Nodo node)
    {
            this.link = node;
    }
}
public class Lista
{
	// refers to the first node of the list
	private Nodo first;
	private int size;

	public Lista()
	{
		this.first = null;
	}

	// check if the list is empty
	public boolean isEmpty()
	{
		if(this.first == null)
			return true;
		return false;
	}

	// Insert to a new node to the list and mark this as the first
	public void insertarCabeza(Object value)
	{
		Nodo nuevo = new Nodo();
		nuevo.setValue(value); 
		// referir el nuevo al primero de la lista
		nuevo.link = first; 
		// poner como primero al nuevo
		first = nuevo;
		// incrementar tamanio de la lista
		size++;
	}

	public void insertarCola(Object value)
	{
		Nodo ultimo = this.getCola();
		Nodo nuevo = new Nodo();
		nuevo.setValue(value);
		ultimo.link = nuevo;
		ultimo = ultimo.link;
	}

	// obtener referencia al primer nodo
	public Nodo getCabeza()
	{
		return this.first;
	}

	// obtener la referencia ultimo nodo
	public Nodo getCola()
	{
		Nodo n = new Nodo();
		n.link = first;
		while(true)
		{
			if(n.link == null)
			{
				return n;
			}
			else
			{
				n = n.link;
			}
		}
	}

	public Nodo buscarPorValor(Object value)
	{
		Nodo n = new Nodo(first);
		boolean encontrado = false;
		while(true)
		{
			System.out.println(n.value);
			if(n.value == value)
			{
				return n;
			}
			if(n.link == null)
			{
				break;
			}
			else
			{
				n = n.link;
			}	
		}
		return null;
	}

	public void imprimirLista()
	{
		Nodo node;
		node = first;
		while(node != null)
		{
			System.out.println(node.value);
			node = node.link;
		}
	}
}
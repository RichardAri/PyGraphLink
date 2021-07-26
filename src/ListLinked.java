public class ListLinked<T> {

	private Node<T> first;
	private int count;

	public ListLinked() {
		this.first = null;
	}

	//Getter Setters
	
	public Node<T> getFirst() {
		return first;
	}

	public void setFirst(Node<T> first) {
		this.first = first;
	}

	public int getCount() {
		return count;
	}
	

	public void setCount(int count) {
		this.count = count;
	}
	
	// 

	public Boolean isEmptyList() {
		return this.first == null;
	}

	public int length() {
		return this.count;
	}

	public void destroyList() {
		while (this.first != null)
			this.first = this.first.getNext();
	}

	public int search(T x) {
		Node<T> aux = this.first;
		for (int i = 0; aux != null; aux = aux.getNext(), i++)
			if (aux.getData().equals(x))
				return i;
		return -1;
	}
	
	public T searchData (T data) {
		Node<T> nodo = this.first;
		while(nodo !=null && !nodo.data.equals(data))
			nodo = nodo.getNext();
		if(nodo!=null)
			return nodo.data;
		return null;
	}

	public void insertFirst(T x) {
		this.first = new Node<T>(x, this.first);
		count++;
	}

	public void insertLast(T x) {
		if (isEmptyList()) {
			this.insertFirst(x);
		} else {
			Node<T> lastNode = getLastNode();
			lastNode.setNext(new Node<T>(x));
			count++;
		}
	}

	// PreCondition: List is not empty
	private Node<T> getLastNode() {
		Node<T> aux = this.first;
		while (aux.getNext() != null)
			aux = aux.getNext();
		return aux;
	}

	public void eliminar(T x) {
		if (isEmptyList())
			toString();
		else {
			if (this.first.getData().equals(x))
				this.first = this.first.getNext();
			else {
				Node<T> aux = this.first;
				while (!aux.getNext().getData().equals(x)) {
					aux = aux.getNext();
				}
				Node<T> next = aux.getNext().getNext();
				aux.setNext(next);
			}
		}
	}

	@Override
	public String toString() {
		String str = "";
		Node<T> aux = this.first;
		for (int i = 0; aux != null; aux = aux.getNext(), i++)
			str += aux.getData() ;
		return str;
	}
	
}

import java.util.Stack;

public class GraphLink<E> {
	
	protected ListLinked<Vertex<E>> listVertex;
	public GraphLink() {
		listVertex = new ListLinked<Vertex<E>>();
	}
	
	public void insertVertex(E data) {
		Vertex<E> nuevo = new Vertex<E>(data);
		if (listVertex.search(nuevo)!=-1) {
			System.out.println("El vertice fue insertado anteriormente...");
			return;
		}
		listVertex.insertFirst(nuevo);
		
	}
	
	public void insertEdge(E verOri,E verDes) {
		insertEdge(verOri, verDes, -1);
	}
	
	public void insertEdge(E verOri, E verDes,int weight) {
		Vertex<E> refOri = listVertex.searchData(new Vertex<E>(verOri));
		Vertex<E> refDes= listVertex.searchData(new Vertex<E>(verDes));
		if(refOri==null || refDes == null ) {
			System.out.println("Vertice origen y/o destino no existen...");
			return;
		}
		if (refOri.listAdj.search(new Edge<E>(refDes))!=-1) {
			System.out.println("Arista fue insertada anteriormente...");
			return;
		}
		refOri.listAdj.insertFirst(new Edge<E>(refDes,weight));
		refDes.listAdj.insertFirst(new Edge<E>(refOri,weight));
	}
	
	public Stack<E> dfs(E verOri) {
		Vertex<E> refOri = listVertex.searchData(new Vertex<E>(verOri));
		Stack<E> pila = new Stack<E>();
		if(refOri==null)
			System.out.println("Origen no Existe ...");
		else {
			//convertimos el vertice origen en un nodo para poder recorrer sus vertices adyacentes
			Node<E> aux = new Node<E>((E) refOri);
			for (; aux != null; aux = aux.getNext()) {
				pila.add(aux.getData());
			}
		}
		return pila;
	}
	
	public Stack<E> bfs(E verOri) {
		Vertex<E> refOri = listVertex.searchData(new Vertex<E>(verOri));
		Stack<E> pila = new Stack<E>();
		if(refOri==null)
			System.out.println("Origen no Existe ...");
		else {
			//convertimos el vertice origen en un nodo para poder recorrer sus vertices adyacentes
			Node<E> aux = new Node<E>((E) refOri);
			for (; aux != null; aux = aux.getNext()) {
				pila.add(aux.getData());
			}
		}
		return pila;
	}

	public boolean searchVertex(E verOri) {
		Vertex<E> refOri = listVertex.searchData(new Vertex<E>(verOri));
		if (refOri!=null)
			return true;
		return false;
	}
	
	public boolean searchEdge(E verOri,E verDes) {
		Vertex<E> refOri = listVertex.searchData(new Vertex<E>(verOri));
		Vertex<E> refDes= listVertex.searchData(new Vertex<E>(verDes));
		if(refOri.listAdj.search(new Edge<E>(refDes))!=-1)
			return true;
		return false;
	}
	
	public int dfsPath(E verOri, E verDes) {
		Vertex<E> refOri = listVertex.searchData(new Vertex<E>(verOri));
		Vertex<E> refDes= listVertex.searchData(new Vertex<E>(verDes));
		//refOri.listAdj.search(new Edge<E>(refDes));
		return refOri.listAdj.search(new Edge<E>(refDes));
	}
	
	public int connectComponent() {
		return listVertex.getCount();
	}
	
	public String toString() {
		return this.listVertex.toString();
	}
}

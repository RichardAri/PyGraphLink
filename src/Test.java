
public class Test {
	public static void main(String[] args) {
		
		GraphLink<String> g1 = new GraphLink<String>();
		
		g1.insertVertex("A");
		g1.insertVertex("B");
		g1.insertVertex("C");
		g1.insertVertex("D");
		g1.insertVertex("E");
		g1.insertVertex("F");
		g1.insertVertex("G");
		g1.insertVertex("H");
		
		g1.insertEdge("A","H");
		g1.insertEdge("A","B");
		g1.insertEdge("B","D");
		g1.insertEdge("C","G");
		g1.insertEdge("A","D");
		g1.insertEdge("B","E");
		g1.insertEdge("H","G");
		g1.insertEdge("H","D");
		g1.insertEdge("H","B");
		g1.insertEdge("C","E");
		g1.insertEdge("B","C");
		g1.insertEdge("G","E");
		g1.insertEdge("B","G");
		g1.insertEdge("H","F");
		g1.insertEdge("C","F");
		g1.insertEdge("D","E");
		g1.insertEdge("A","C");
		
		System.out.println("Recorrido DFS : "+g1.dfs("B"));
		
		GraphLink<String> g = new GraphLink<String>();
		
		/*g.insertVertex("Cusco");
		g.insertVertex("Lima");
		g.insertVertex("Aqp");
		g.insertVertex("Tacna");
		g.insertVertex("Piura");
		//g.insertVertex("Piura");*/
		
		//----------Grafo Ponderado
		//---------- Vertices
		g.insertVertex("A");
		g.insertVertex("B");
		g.insertVertex("C");
		g.insertVertex("D");
		g.insertVertex("E");
		g.insertVertex("F");
		g.insertVertex("G");
		g.insertVertex("H");
		//----------- Aristas
		g.insertEdge("A","H",10);
		g.insertEdge("A","B",3);
		g.insertEdge("B","D",8);
		g.insertEdge("C","G",9);
		g.insertEdge("A","D",2);
		g.insertEdge("B","E",4);
		g.insertEdge("H","G",3);
		g.insertEdge("H","D",14);
		g.insertEdge("H","B",6);
		g.insertEdge("C","E",1);
		g.insertEdge("B","C",5);
		g.insertEdge("G","E",15);
		g.insertEdge("B","G",6);
		g.insertEdge("H","F",9);
		g.insertEdge("C","F",7);
		g.insertEdge("D","E",12);
		g.insertEdge("A","C",5);
		
		/*g.insertEdge("Cusco", "Lima",30);
		g.insertEdge("Lima", "Piura",7);
		g.insertEdge("Lima", "Tacna",10);
		g.insertEdge("Aqp", "Lima",3);
		g.insertEdge("Aqp", "Cusco",6);
		g.insertEdge("Piura", "Tacna",9);
		g.insertEdge("Tacna", "Aqp",25);
		g.insertEdge("Lima", "Cusco",4);*/
		
		//System.out.println("Grafo ciudades:\n\n"+g);
		//System.out.println("Existe Vertex : "+g.searchVertex("Puno"));
		//System.out.println("Existe Edge : "+g.searchEdge("Aqp", "Lima"));
		
		/*System.out.println("Grafo G2 Ponderado\n");
		
		System.out.println(g);
		
		System.out.println("Existe Edge : "+g.searchEdge("E","F"));
		
		System.out.println("\nConexos : "+g.connectComponent());*/
		System.out.println("Recorrido DFS : "+g.dfs("B"));
		
	}
}

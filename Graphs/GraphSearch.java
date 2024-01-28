package Graphs;
//BFS IMPLEMENTATION 
//Using Queue implementation as ArrayList

import java.util.ArrayList;


public class GraphSearch {
    int V; //No of vertices
    
    //Adjacency list
    ArrayList<Integer> adj[];  // In adj[] each index =>Vertex ,Each vertex has ArrayList which conatins related vertex in a particular vertex 
    

    GraphSearch(int noOfvertex){
        V=noOfvertex;
        adj=new ArrayList[noOfvertex];
        for(int i=0;i<noOfvertex;i++){
            adj[i]=new ArrayList<>();
        }
    }
     void edge(int x,int y){
        adj[x].add(y);//Adjacency List
     }

     void breadthFirstSearch(int sourcevertex){
        boolean[] visited=new boolean[V];
        ArrayList<Integer> a1=new ArrayList<Integer>();
        visited[sourcevertex]=true;
        a1.add(sourcevertex);
        while(!a1.isEmpty())
        {
           sourcevertex=a1.remove(0);
           System.out.print(sourcevertex+" ");

        //    Iterator i=adj[sourcevertex].iterator();
        //    while(i.hasNext()){
        //     int n=(int) i.next();
        //     if(!visited[n]){
        //         visited[n]=true;
        //         a1.add(n);
        //     }
        //    }
        
        for (Integer i : adj[sourcevertex]) {
            if(!visited[i]){
                visited[i]=true;
                a1.add(i);
            }
        }
        }
     }

    public static void main(String[] args) {

    
      GraphSearch g1=new GraphSearch(6);

      //Adajacency List
      g1.edge(0, 1);  
      g1.edge(0, 2); 
      g1.edge(0, 5); 

      g1.edge(1, 0);  
      g1.edge(1, 2);

      g1.edge(2, 0);  
      g1.edge(2, 1);  
      g1.edge(2, 3);  
      g1.edge(2, 4); 

      g1.edge(3, 2); 

      g1.edge(4, 2);  
      g1.edge(4, 5);  

      g1.edge(5, 0);  
      g1.edge(5, 4);  

      g1.breadthFirstSearch(0);
    }
    
}

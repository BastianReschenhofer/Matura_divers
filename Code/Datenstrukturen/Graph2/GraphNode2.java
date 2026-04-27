package Code.Datenstrukturen.Graph2;

import Code.Datenstrukturen.Graph.GraphNode;

import java.util.ArrayList;

public class GraphNode2<T> {

    private final T value;
    private boolean visited;

    private ArrayList<GraphNode2<T>> neighbors;
    private ArrayList<Integer> weights;

    private GraphNode2<T> parent;
    private int minweight;

    public GraphNode2(T val){
        neighbors = new ArrayList<>();
        weights = new ArrayList<>();
        this.visited = false;
        this.value = val;
        this.minweight = Integer.MAX_VALUE;
        this.parent = null;
    }

    public T getValue(){return this.value;}
    public boolean isVisited(){return this.visited;}
    public ArrayList<GraphNode2<T>> getNeighbors(){return this.neighbors;}
    public ArrayList<Integer> getWeights(){return this.weights;}
    public GraphNode2<T> getParent(){return this.parent;}
    public int getMinweight(){return this.minweight;}

    public void setVisited(boolean visited){this.visited = visited;}
    public void addNeighbor(GraphNode2<T> neighbor){this.neighbors.add(neighbor); this.weights.add(0);}
    public void addNeighbor(GraphNode2<T> neighbor, int weight){this.neighbors.add(neighbor); this.weights.add(weight);}
    public void setParent(GraphNode2<T> newParent){this.parent = newParent;}
    public void setMinweight(int val){this.minweight = val;}

}

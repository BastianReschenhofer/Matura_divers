package Code.Datenstrukturen.Graph3;

import java.util.ArrayList;

public class GraphNode3<T> {
    private final T value;
    private boolean visited;

    private ArrayList<GraphNode3<T>> neighbors;
    private ArrayList<Integer> weights;

    private GraphNode3<T> dad;
    private int minWeight;

    public GraphNode3 (T value){
        this.value = value;
        this.visited = false;
        neighbors = new ArrayList<>();
        weights = new ArrayList<>();
        dad = null;
        minWeight = Integer.MAX_VALUE;
    }

    public T getValue(){return this.value;}
    public boolean isVisited(){return this.visited;}
    public ArrayList<GraphNode3<T>> getNeighbors(){return this.neighbors;}
    public ArrayList<Integer> getWeights(){return this.weights;}
    public GraphNode3<T> getDad(){return this.dad;}
    public int getMinWeight(){return this.minWeight;}

    public void setVisited(boolean newState){this.visited = newState;}
    public void addNeighbor(GraphNode3<T> newNeighbor){neighbors.add(newNeighbor);}
    public void addNeighbor(GraphNode3<T> newNeighbor, int newWeight){neighbors.add(newNeighbor); weights.add(newWeight);}
    public void addWeight(int newWeight){weights.add(newWeight);}
    public void setDad(GraphNode3<T> newDad){this.dad = newDad;}
    public void setMinWeight(int newMinWeight){this.minWeight = newMinWeight;}
}

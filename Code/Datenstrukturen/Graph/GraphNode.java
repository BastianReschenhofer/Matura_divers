package Code.Datenstrukturen.Graph;

import java.util.ArrayList;
import java.util.List;

public class GraphNode<T> {
    private final T val;
    private boolean visited;

    private List<GraphNode<T>> neighbors;
    private List<Integer> weights;

    private GraphNode<T> parent;
    private int minWeight;

    public GraphNode(T val){
        neighbors = new ArrayList<>();
        weights = new ArrayList<>();
        this.visited = false;
        this.val = val;
    }

    public void setParent(GraphNode<T> newParent){
        parent = newParent;
    }

    public void setMinWeight(int weight){
        minWeight = weight;
    }

    public int getMinWeight(){
        return minWeight;
    }

    public GraphNode<T> getParent(){
        return parent;
    }

    public T getVal(){
        return this.val;
    }

    public void setVisited(boolean isVisited){
        this.visited = isVisited;
    }
    public boolean isVisited(){
        return this.visited;
    }

    public void addNeighbor(GraphNode<T> neighbor){
        neighbors.add(neighbor);
        weights.add(0);
    }
    public void addNeighbor(GraphNode<T> neighbor, int weight){
        neighbors.add(neighbor);
        weights.add(weight);
    }

    public void removeNeighbor(T val) {
        neighbors.removeIf(g -> g.getVal().equals(val));
    }

    public List<GraphNode<T>> getNeighbors(){
        return neighbors;
    }
    public List<Integer> getWeights(){
        return weights;
    }
}

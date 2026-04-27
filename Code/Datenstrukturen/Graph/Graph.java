package Code.Datenstrukturen.Graph;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Graph<T> {
    public static void main(String[] args){
        List<GraphNode<String>> graph = new LinkedList<>();

        GraphNode<String> a = new GraphNode<>("a");
        GraphNode<String> b = new GraphNode<>("b");
        GraphNode<String> c = new GraphNode<>("c");
        GraphNode<String> d = new GraphNode<>("d");
        GraphNode<String> e = new GraphNode<>("e");
        GraphNode<String> f = new GraphNode<>("f");
        GraphNode<String> g = new GraphNode<>("g");

        addEdge(a, b, 1);
        addEdge(b, c, 1);
        addEdge(b, d, 2);
        addEdge(d, e, 2);
        addEdge(c, e, 4);
        addEdge(b, e, 4);
        addEdge(a, g, 6);
        addEdge(a, f, 2);
        addEdge(d, f, 1);
        addEdge(f, e, 2);
        addEdge(e, g, 1);

        graph.add(a);
        graph.add(b);
        graph.add(c);
        graph.add(d);
        graph.add(e);
        graph.add(f);
        graph.add(g);

        System.out.println("============ DFS ===============");
        setAllUnvisited(graph);
        dfs(a);
        System.out.println("============ BFS ===============");
        setAllUnvisited(graph);
        bfs(a);
    }

    public static <T> void addEdge(GraphNode<T> a, GraphNode<T> b, int weight){
        a.addNeighbor(b, weight);
        b.addNeighbor(a, weight);
    }

    public static <T> void bfs(GraphNode<T> node){
        Queue<GraphNode<T>> queue = new LinkedList<>();
        node.setVisited(true);
        do{
            System.out.println(node.getVal());
            for(GraphNode<T> neighbor : node.getNeighbors()){
                if(!neighbor.isVisited()){
                    neighbor.setVisited(true);
                    queue.add(neighbor);
                }
            }
            node = queue.poll();
        }while(node != null);
    }

    public static <T> void dfs(GraphNode<T> node){
        node.setVisited(true);
        System.out.println(node.getVal());
        for(GraphNode<T> neighbor : node.getNeighbors()){
            if(!neighbor.isVisited()){
                dfs(neighbor);
            }
        }
    }

    private static <T> void setAllUnvisited(List<GraphNode<T>> graph){
        for(GraphNode<T> node : graph){
            node.setVisited(false);
            node.setMinWeight(Integer.MAX_VALUE);
            node.setParent(null);
        }
    }

    public static <T> void mst(GraphNode<T> node){
        GraphNode<T> p = node;
        List<GraphNode<T>> baum = new LinkedList<>();
        baum.add(p); p.setVisited(true);

        List<GraphNode<T>> saum = new LinkedList<>();
        for(GraphNode<T> neighbors : p.getNeighbors()){
            saum.add(neighbors);
            neighbors.setVisited(true);
        }

        while(!saum.isEmpty()){
            for(GraphNode<T> neighbor : p.getNeighbors()){
                if(!neighbor.isVisited()){
                    saum.add(neighbor);
                    neighbor.setVisited(true);
                }
            }

            int min = Integer.MAX_VALUE;
            GraphNode<T> dad = null;

            for(GraphNode<T> n : saum){
                for(GraphNode<T> b : baum){
                    int idx = b.getNeighbors().indexOf(n);
                    if(b.getWeights().get(idx) < min){
                        min = b.getWeights().get(idx);
                        dad = b;
                        p = n;
                    }
                }
            }

            //Kante aufnehem
            System.out.println(dad.getVal() + " --- " + min + " ---> " + p.getVal());

            baum.add(p);
        }
    }

    public static <T> void sp(GraphNode<T> p, GraphNode<T> q){
        List<GraphNode<T>> heap = new LinkedList<>();
        p.setMinWeight(0);

        while(p != q){
            p.setVisited(true);
            for(int i = 0; i < p.getNeighbors().size(); i++){
                GraphNode<T> son = p.getNeighbors().get(i);
                if(!son.isVisited()){
                    int distance = p.getMinWeight() + p.getWeights().get(i);
                    if(!heap.contains(son)){
                        son.setMinWeight(distance);
                        son.setParent(p);
                        heap.add(son);
                    }else if(distance < son.getMinWeight()){
                        son.setMinWeight(distance);
                        son.setParent(p);
                    }
                    heap.sort((a,b) -> a.getMinWeight() - b.getMinWeight());
                }
            }
            if(heap.isEmpty()) return;
            p = heap.removeFirst();
        }
    }
}

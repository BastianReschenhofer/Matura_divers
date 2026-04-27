package Code.Datenstrukturen.Graph2;

import Code.Datenstrukturen.Graph.GraphNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Graph2 <T>{

    public static void main(String[] args){
        List<GraphNode2<String>> graph = new LinkedList<>();

        GraphNode2<String> a = new GraphNode2<>("a");
        GraphNode2<String> b = new GraphNode2<>("b");
        GraphNode2<String> c = new GraphNode2<>("c");
        GraphNode2<String> d = new GraphNode2<>("d");
        GraphNode2<String> e = new GraphNode2<>("e");
        GraphNode2<String> f = new GraphNode2<>("f");
        GraphNode2<String> g = new GraphNode2<>("g");

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

    public static <T> void addEdge(GraphNode2<T> a, GraphNode2<T> b, int weight){
        a.addNeighbor(b, weight);
        b.addNeighbor(a, weight);
    }

    private static <T> void setAllUnvisited(List<GraphNode2<T>> graph){
        for(GraphNode2<T> node : graph){
            node.setVisited(false);
            node.setMinweight(Integer.MAX_VALUE);
            node.setParent(null);
        }
    }

    public static <T> void dfs(GraphNode2<T> node){
        dfsRec(node);
    }
    private static <T> void dfsRec(GraphNode2<T> node){
        node.setVisited(true);
        System.out.println(node.getValue());
        for(GraphNode2<T> neighbor : node.getNeighbors()){
            if(!neighbor.isVisited()) dfsRec(neighbor);
        }
    }

    public static <T> void bfs(GraphNode2<T> node){
        Queue<GraphNode2<T>> queue = new LinkedList<>();
        node.setVisited(true);
        do{
            System.out.println(node.getValue());
            for(GraphNode2<T> neighbor : node.getNeighbors()){
                if(!neighbor.isVisited()) queue.add(neighbor);
                node.setVisited(true);
            }
            node = queue.poll();
        }while(node != null);
    }

    public static <T> void mst(GraphNode2<T> node){
        GraphNode2<T> p = node;
        List<GraphNode2<T>> baum = new LinkedList<>();
        baum.add(p);
        p.setVisited(true);

        List<GraphNode2<T>> saum = new LinkedList<>();
        for(GraphNode2<T> neighbor : p.getNeighbors()){
            saum.add(neighbor);
            neighbor.setVisited(true);
        }

        while(!saum.isEmpty()){
            for(GraphNode2<T> neighbor : p.getNeighbors()){
                if(!neighbor.isVisited()){
                    neighbor.setVisited(true);
                    saum.add(neighbor);
                }
            }

            int min = Integer.MAX_VALUE;
            GraphNode2<T> dad = null;

            for(GraphNode2<T> s : saum){
                for(GraphNode2<T> b : baum){
                    int idx = b.getNeighbors().indexOf(s);
                    if(b.getWeights().indexOf(idx) < min){
                        min = b.getWeights().indexOf(idx);
                        dad = b;
                        p = s;
                    }
                }
            }

            //Kante aufnehem
            System.out.println(dad.getValue() + " --- " + min + " ---> " + p.getValue());

            baum.add(p);
        }
    }

    public static <T> void sp(GraphNode2<T> a, GraphNode2<T> b){
        List<GraphNode2<T>> heap = new LinkedList<>();
        a.setMinweight(0);

        while(a != b){
            a.setVisited(true);
            for(int i = 0; i < a.getNeighbors().size(); i++){
                GraphNode2<T> son = a.getNeighbors().get(i);
                if(!son.isVisited()){
                    int distance = a.getMinweight() + a.getWeights().get(i);
                    if(!heap.contains(son)){
                        son.setMinweight(distance);
                        son.setParent(a);
                        heap.add(son);
                    } else if(distance < son.getMinweight()){
                        son.setMinweight(distance);
                        son.setParent(a);
                    }
                    heap.sort((x,y) -> x.getMinweight() - y.getMinweight());
                }

            }
            if(heap.isEmpty()) return;
            a = heap.removeFirst();
        }

    }


}

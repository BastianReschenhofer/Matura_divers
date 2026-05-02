package Code.Datenstrukturen.Graph3;



import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Graph3<T extends Comparable<T>> {

    private List<GraphNode3<T>> graph;

    public Graph3(){
        graph = new LinkedList<>();
    }

    public void addEdge(GraphNode3<T> a, GraphNode3<T> b, int weight ){
        a.addNeighbor(b, weight);
        b.addNeighbor(a, weight);
    }

    public void setAllUnvisited(){
        for(GraphNode3<T> g : graph){
            g.setVisited(false);
            g.setMinWeight(Integer.MAX_VALUE);
        }
    }

    public void dfs(GraphNode3<T> node){
        node.setVisited(true);
        System.out.println(node.getValue());
        for(GraphNode3<T> g : node.getNeighbors()){
            if(!g.isVisited()) dfs(g);
        }

    }

    public void bfs(GraphNode3<T> node){
        setAllUnvisited();
        node.setVisited(true);
        Queue<GraphNode3<T>> queue = new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty()){
            node = queue.poll();
            System.out.println(node.getValue());
            for(GraphNode3<T> g : node.getNeighbors()){
                if(!g.isVisited()){
                    g.setVisited(true);
                    queue.add(g);
                }
            }

        }
    }

    public void mspt(GraphNode3<T> start){
        GraphNode3<T> p = start;
        LinkedList<GraphNode3<T>> baum = new LinkedList<>();
        p.setVisited(true);
        baum.add(p);

        LinkedList<GraphNode3<T>> saum = new LinkedList<>();
        for(GraphNode3<T> g : p.getNeighbors()){
            g.setVisited(true);
            saum.add(g);
        }

        while(!saum.isEmpty()){

            for(GraphNode3<T> g : p.getNeighbors()){
                if(!g.isVisited()){
                    g.setVisited(true);
                    saum.add(g);
                }
            }

            int min = Integer.MAX_VALUE;
            GraphNode3<T> dad = null;

            for(GraphNode3<T> s : saum){
                for(GraphNode3<T> b : baum){
                    int idx = b.getNeighbors().indexOf(s);
                    if(b.getWeights().get(idx) < min){
                        dad = b;
                        min = b.getWeights().get(idx);
                        p = s;
                    }
                }
            }


            //Kante aufnehmen
            System.out.println(dad.getValue() + "---" + min + "---" + p.getValue());

            baum.add(p);
            saum.remove(p);
        }
    }


    public void sp(GraphNode3<T> start, GraphNode3<T> end){
        LinkedList<GraphNode3<T>> heap = new LinkedList<>();
        start.setMinWeight(0);

        while(start != end){
            start.setVisited(true);
            for(int i = 0; i < start.getNeighbors().size(); i++){
                GraphNode3<T> son = start.getNeighbors().get(i);
                if(!son.isVisited()){
                    int distance = start.getMinWeight() + start.getWeights().get(i);
                    if(!heap.contains(son)){
                        son.setMinWeight(distance);
                        son.setDad(start);
                        heap.add(son);
                    }else if(distance < son.getMinWeight()){
                        son.setDad(start);
                        son.setMinWeight(distance);
                    }
                    heap.sort((x ,y) -> x.getMinWeight() - y.getMinWeight());
                }
            }
            if(heap.isEmpty()) return;
            start = heap.removeFirst();
        }
    }


}

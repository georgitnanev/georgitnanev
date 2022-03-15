import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

    class Vertex implements Comparable<Vertex>
    {
        public final String name;
        public Edge[] adjacencies;
        public double minDistance = Double.POSITIVE_INFINITY;
        public Vertex previous;
        public Vertex(String argName) { name = argName; }
        public String toString() { return name; }
        public int compareTo(Vertex other)
        {
            return Double.compare(minDistance, other.minDistance);
        }

    }

    class Edge
    {
        public final Vertex target;
        public final double weight;
        public Edge(Vertex argTarget, double argWeight)
        { target = argTarget; weight = argWeight; }
    }

    public class Zadacha1
    {
        public static void computePaths(Vertex source)
        {
            source.minDistance = 0.;
            PriorityQueue<Vertex> vertexQueue = new PriorityQueue<>();
            vertexQueue.add(source);

            while (!vertexQueue.isEmpty()) {
                Vertex u = vertexQueue.poll();

                for (Edge e : u.adjacencies)
                {
                    Vertex v = e.target;
                    double weight = e.weight;
                    double distanceThroughU = u.minDistance + weight;
                    if (distanceThroughU < v.minDistance) {
                        vertexQueue.remove(v);

                        v.minDistance = distanceThroughU ;
                        v.previous = u;
                        vertexQueue.add(v);
                    }
                }
            }
        }

        public static List<Vertex> getShortestPathTo(Vertex target)
        {
            List<Vertex> path = new ArrayList<>();
            for (Vertex vertex = target; vertex != null; vertex = vertex.previous)
                path.add(vertex);

            Collections.reverse(path);
            return path;
        }

        public static void main(String[] args)
        {
            Vertex A = new Vertex("A");
            Vertex B = new Vertex("B");
            Vertex C = new Vertex("C");
            Vertex D = new Vertex("D");
            Vertex E = new Vertex("E");
            Vertex F = new Vertex("F");
            Vertex G = new Vertex("G");
            Vertex H = new Vertex("H");
            Vertex I = new Vertex("I");
            Vertex J = new Vertex("J");
            Vertex K = new Vertex("K");
            Vertex L = new Vertex("L");

            A.adjacencies = new Edge[]{ new Edge(B, 20) };
            B.adjacencies = new Edge[]{ new Edge(J, 10) };
            C.adjacencies = new Edge[]{ new Edge(F, 10) };
            D.adjacencies = new Edge[]{ new Edge(I, 5) };
            E.adjacencies = new Edge[]{ new Edge(I, 45) };
            F.adjacencies = new Edge[]{ new Edge(D, 15) };
            G.adjacencies = new Edge[]{ new Edge(H, 25) };
            H.adjacencies = new Edge[]{ new Edge(A, 30) };
            I.adjacencies = new Edge[]{ new Edge(G, 20) };
            J.adjacencies = new Edge[]{ new Edge(C, 15) };
            K.adjacencies = new Edge[]{ new Edge(L, 10) };

            computePaths(A);
            System.out.println("Distance to " + D + ": " + D.minDistance);
            List<Vertex> path = getShortestPathTo(D);
            System.out.println("Path: " + path);
        }
    }


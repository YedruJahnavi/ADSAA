import java.util.*;
class BFS_AL
{
	static void bfs(List<List<Integer>> adj, int s){
		boolean[] visited = new boolean[adj.size()];
		Queue<Integer> q = new LinkedList<>();
		q.add(s);
		visited[s] = true;
		while (!q.isEmpty())
		{
			int curr = q.poll();
			System.out.print(curr + " ");
			for (int x : adj.get(curr))
			{
				if (!visited[x])
		        {
					q.add(x);
					visited[x] = true;
				}
			}
		}
	}
	static void addEdge(List<List<Integer>> adj, int u, int v)
	{
		adj.get(u).add(v);
		adj.get(v).add(u); // Undirected graph
	}
	public static void main(String[] args){
		int V = 5;
		List<List<Integer>> adj = new ArrayList<>(V);
		for (int i = 0; i < V; i++)
		{
			adj.add(new ArrayList<>());
		}
		addEdge(adj, 0, 1);
		addEdge(adj, 0, 2);
		addEdge(adj, 1, 3);
		addEdge(adj, 1, 4);
		addEdge(adj, 2, 4);
		System.out.println("BFS starting from 0:");
		bfs(adj, 4);
	}
}

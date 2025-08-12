class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        boolean visited[]=new boolean[n];
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        for(int []edge :edges){
            int u = edge[0];
            int v = edge[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        return dfs(source,destination,graph,visited);
    }
    boolean dfs (int current,int destination,ArrayList<ArrayList<Integer>> graph,boolean visited[]){
        if(current==destination){
            return true;
        }
        visited[current]=true;
        for(int neighbour:graph.get(current)){
            if(!visited[neighbour]){
                if(dfs(neighbour,destination,graph,visited)){
                    return true;
                }
            }
        }
        return false;
    }
}
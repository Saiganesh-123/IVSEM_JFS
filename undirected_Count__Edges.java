
class undirected_Count__Edges{
    public static void main(String args[]){
        int graph[][]={{0,1,0,1,0},{1,0,1,1,0},{0,1,0,0,1},{1,1,0,0,1},{0,0,1,1,0}};
        int one_ctr=0;
        for(int i=0;i<graph.length;i++){
            for(int j=0;j<graph[0].length;j++){
                if(graph[i][j]==1){
                    one_ctr++;
                }
            }
        }
        System.out.println("Total number of edges ="+one_ctr/2);
        System.out.println("Total number of vertices ="+graph.length);
    }
}

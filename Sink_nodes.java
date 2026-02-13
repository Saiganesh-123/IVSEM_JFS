public class Sink_nodes {
    public static void main(String []args){
    int grp[][]={{0,1,1,0,1},{0,0,0,1,1},{0,0,0,1,1},{0,0,0,0,0},{0,0,0,0,0}};
    int c=0;
    int s_c=0;
    for(int i=0;i<grp.length;i++){
        c=0;
        for(int j=0;j<grp.length;j++){
            if(grp[i][j]==0){
                c++;
            }
            if(c==grp.length){
                System.out.println("Sink Nodes="+(char)(65+i));//explictily converting in to char
                s_c++;
            }
        }
    }
    System.out.println(s_c);
    }
}

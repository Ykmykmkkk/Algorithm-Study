import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _1707 {
    public static int[] visited;
    public static ArrayList<Integer>[] ar;
    public static boolean isPortrait;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<a;i++){
            isPortrait = true;
            st = new StringTokenizer(br.readLine());
            int node = Integer.parseInt(st.nextToken());
            int edge = Integer.parseInt(st.nextToken());
            ar = new ArrayList[node+1];
            for(int b=0;b<node+1;b++){
                ar[b] = new ArrayList<>();
            }
            for(int b=0;b<edge;b++){
                st = new StringTokenizer(br.readLine());
                int first = Integer.parseInt(st.nextToken());
                int last = Integer.parseInt(st.nextToken());
                ar[first].add(last);
                ar[last].add(first);
            }
            visited = new int[node+1];
            for(int b=1;b<node+1;b++){
                if(visited[b]==0){
                    dfs(b,1);
                }
                if(!isPortrait)
                    break;
            }
            if(isPortrait){
                sb.append("YES\n");
            } else{
                sb.append("NO\n");
            }
        }
        System.out.print(sb);
    }
    public static void dfs(int i, int stamp){
        visited[i] = stamp;
        for(int next: ar[i]){
            if(visited[next]==0){ // 방문하지 않았다면
                dfs(next, -stamp);
            } else{
                if(visited[next]==stamp){
                    isPortrait = false;
                    return;
                }
            }
        }
    }
}

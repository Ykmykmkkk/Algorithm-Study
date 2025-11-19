import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class _2178 {
    public static int N;
    public static int M;
    public static int[][] maze;
    public static boolean[][] visit;
    public static int[] dx = new int[] {0,1,0,-1};
    public static int[] dy = new int[] {1,0,-1,0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        maze = new int[N][M];
        visit = new boolean[N][M];
        for(int i=0;i<N;i++){
            String line = br.readLine();
            for(int j=0;j<M;j++){
                maze[i][j]=line.charAt(j)-'0';
            }
        }
        BFS();
        System.out.println(maze[N-1][M-1]);
    }
    public static void BFS(){
        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{0,0});
        while(!queue.isEmpty()){
            int[] now = queue.poll();
            int x = now[0];
            int y = now[1];
            if(!visit[x][y]){
                visit[x][y]=true;
                for(int i=0;i<4;i++){
                    if(x+dx[i]>=0&&y+dy[i]>=0&&x+dx[i]<N&&y+dy[i]<M){
                        if(maze[x+dx[i]][y+dy[i]]==1){
                            maze[x+dx[i]][y+dy[i]] = maze[x][y] + 1;
                            queue.offer(new int[]{x+dx[i],y+dy[i]});
                        }
                    }
                }
            }
        }
    }
}

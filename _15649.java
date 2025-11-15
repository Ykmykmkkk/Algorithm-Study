import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class _15649 {
    public static ArrayList<Integer> ar;
    public static int N;
    public static int M;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        ar = new ArrayList<>();
        back(0);
    }
    public static void back(int depth){
        if(depth==M){
            StringBuilder sb = new StringBuilder();
            for(int a:ar){
                sb.append(a).append(' ');
            }
            System.out.println(sb);
        }
        else{
            for(int i=1;i<N+1;i++){
                if(ar.contains(i)){
                    continue;
                }
                ar.add(i);
                back(depth+1);
                ar.remove(depth);
            }
        }
    }
}

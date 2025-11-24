import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _11047 {
    public static int N;
    public static int K;
    public static int[] val;

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        val = new int[N];
        for(int i=0;i<N;i++){
            val[i]=sc.nextInt();
        }
        int cnt = 0;
        for(int i=N-1;i>=0;i--){
            if(K>=val[i]){
                cnt += K / val[i];
                K = K % val[i];
            }
        }
        System.out.println(cnt);
    }

}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _1920 {
    public static int N;
    public static int M;
    public static int[] ar;
    public static int[] ans;
    public static int[] cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        ar = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            ar[i]=Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());

        ans = new int[M];
        cnt = new int[M];

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<M;i++){
            ans[i]=Integer.parseInt(st.nextToken());
        }

        Arrays.sort(ar);

        for(int i=0;i<M;i++){
            int start = 0;
            int end = N-1;
            while(start<=end){
                int mid_index = (start + end) / 2 ;
                if(ar[mid_index]< ans[i]){
                    start = mid_index +  1;
                } else if(ar[mid_index]> ans[i]){
                    end = mid_index - 1;
                } else{
                    cnt[i] = 1;
                    break;
                }
            }
        }

        for(int i=0;i<M;i++){
            System.out.println(cnt[i]);
        }
    }
}


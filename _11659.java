import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// 구간 합 구하기
public class _11659 {
    // BufferedReader 사용시 throws IOException 넣기. 입력 받는 값이 많다면 Scanner 대신 BufferedReader 사용
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int suN = Integer.parseInt(st.nextToken());
        int quizN = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        long[] sum = new long[suN+1];
        for(int i=1;i<=suN;i++){
            sum[i] = sum[i-1]+Integer.parseInt(st.nextToken());
        }

        for(int i=0;i<quizN;i++){
            st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());
            System.out.println(sum[second]-sum[first-1]);
        }
    }
}

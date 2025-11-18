import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 색종이 붙히기
public class _17136 {
    public static int[][] ar = new int[10][10];
    public static int cnt;
    public static int[] paper = {0,5,5,5,5,5};
    public static int result = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<10;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<10;j++){
                ar[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        backtracking(0,0);
        if(result==Integer.MAX_VALUE) result = -1;
        System.out.println(result);
    }
    public static void backtracking(int xy, int cnt){
        if(xy==100){
            result = Math.min(cnt, result);
            return;
        }
        if(cnt>=result){
            return;
        }
        else{
            int x = xy/10;
            int y = xy%10;
            if(ar[x][y]==1){
                for(int i=5;i>0;i--){
                    if(paper[i]>0&&check(xy,i)){
                        paper[i]--;
                        fill(xy,i,0); // 색종이 붙여서 0으로 바꾸기
                        backtracking(xy+1,cnt+1);
                        paper[i]++;
                        fill(xy,i,1); // 색종이를 떼어서 다시 원래대로 1로 바꾸기
                    }
                }
            } else{
                backtracking(xy+1, cnt);
            }
        }
    }
    public static boolean check(int xy,int len){
        int x = xy/10;
        int y = xy%10;
        if(x+len-1>9||y+len-1>9) return false;
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                if(ar[x+i][y+j]==0) return false;
            }
        }
        return true;
    }
    public static void fill(int xy,int len, int val){
        int x = xy/10;
        int y = xy%10;
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                ar[x+i][y+j]=val;
            }
        }
    }
}

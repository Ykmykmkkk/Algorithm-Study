import java.io.IOException;
import java.util.Scanner;
// n queen
public class _9663 {
    public static int[] ar;
    public static int n;
    public static int cnt;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ar = new int[n];
        cnt = 0;
        nqueen(0);
        System.out.println(cnt);
    }

    public static void nqueen(int row){
        if(row==n){
            cnt++;
        }
        else{
            for(int i=0;i<n;i++){
                ar[row] = i;
                if(check(row)){
                    nqueen(row+1);
                }
            }

        }
    }
    public static boolean check(int row){
        for(int i=0;i<row;i++){
            if(ar[i]==ar[row]) return false;//직선 공격
            if(Math.abs(row-i)==Math.abs(ar[row]-ar[i])) return false;
        }
        return true;
    }

}

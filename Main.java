import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Inet4Address;
import java.nio.Buffer;
import java.util.*;

// 투 포인터 문제
public class Main {
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
                if(check(row)){

                    nqueen(row+1);
                }
            }

        }
    }
    public static boolean check(int row){
        for(int i=0;i<row;i++){
            if(ar[i]==)//직선 공격
        }
    }

}
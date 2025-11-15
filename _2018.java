import java.io.IOException;
import java.util.Scanner;

public class _2018 {
    // 투 포인터.    숫자의 범위를 보면 무조건 N번의 시간 복잡도로 해결해야 한다.
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] list = new int[n+1];
        int fp = 1;
        int lp = 1;
        int sum = 1;
        int cnt = 1;
        while(lp!=n){
            if(sum<n){
                lp++;
                sum +=lp;
            }
            else if(sum>n){
                sum -=fp;
                fp++;
            }
            else{
                lp++;
                sum +=lp;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}

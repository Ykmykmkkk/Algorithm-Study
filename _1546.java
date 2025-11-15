import java.util.Scanner;

public class _1546 {
    // 마지막에 double로 바꿔주기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int max = 0;
        int sum = 0;
        for(int i=0;i<num;i++){
            int n = sc.nextInt();
            if(n>max) max = n;
            sum += n;
        }
        System.out.println(sum*100.0/max/num);
    }
}

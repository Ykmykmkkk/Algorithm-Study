import java.util.Scanner;

public class _11720 {
    // 문자 숫자 변환 시 아스키 코드 유의하기.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String sNum = sc.next();
        char[] list = sNum.toCharArray();
        int sum = 0;
        for(int i=0;i<N;i++){
            sum += list[i] - '0';
        }
        System.out.println(sum);
    }
}

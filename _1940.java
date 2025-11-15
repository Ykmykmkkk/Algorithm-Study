import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class _1940 {
    // 투 포인터 문제
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = Integer.parseInt(br.readLine());
        int[] materials2 = new int[n];
        // 배열의 크기를 동적으로 변경하고 싶다면 ArrayList 사용. 그러나 일반 배열이 더 연산 속도가 빠름
        ArrayList<Integer> materials = new ArrayList<>(n);
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            int num = Integer.parseInt(st.nextToken());
            materials.add(num);
            materials2[i]=num;
        }
        materials.sort(Comparator.naturalOrder()); // Comparator 넣어주기
        Arrays.sort(materials2);
        int fp=0;
        int lp = n-1;
        int cnt =0;
        while(fp<lp){
            int temp = materials.get(fp)+ materials.get(lp);
            if(sum>temp){
                fp++;
            }
            else if(sum<temp){
                lp--;
            } else{
                cnt++;
                fp++;
                lp--;
            }
        }
        System.out.println(cnt);
    }
}

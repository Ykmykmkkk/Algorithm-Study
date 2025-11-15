import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//투 포인터 문제
public class _12891 {
    static int[] checkArr;
    static int[] myArr;
    static int checkSecret;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        char[] dna = br.readLine().toCharArray();
        st = new StringTokenizer(br.readLine());
        int cnt = 0;

        checkArr = new int[4];
        for(int i=0;i<4;i++){
            checkArr[i] = Integer.parseInt(st.nextToken());
            if(checkArr[i]==0) checkSecret++;
        }

        myArr = new int[4];
        for(int i=0;i<P;i++){
            add(dna[i]);
        }
        if(checkSecret == 4) cnt++;

        for(int i=P;i<S;i++){
            reduce(dna[i-P]);
            add(dna[i]);
            if(checkSecret == 4) cnt++;
        }
        System.out.println(cnt);
    }
    private static void add(char a){
        switch (a){
            case 'A':
                myArr[0] += 1;
                if(myArr[0]==checkArr[0]){
                    checkSecret += 1;
                }
                break;
            case 'C':
                myArr[1] += 1;
                if(myArr[1] == checkArr[1]){
                    checkSecret += 1;
                }
                break;
            case 'G':
                myArr[2] += 1;
                if(myArr[2] == checkArr[2]){
                    checkSecret += 1;
                }
                break;
            case 'T':
                myArr[3] += 1;
                if(myArr[3] == checkArr[3]){
                    checkSecret += 1;
                }
                break;
        }

    }
    private static void reduce(char a){
        switch (a){
            case 'A':
                if(myArr[0]==checkArr[0]){
                    checkSecret -= 1;
                }
                myArr[0] -= 1;
                break;
            case 'C':
                if(myArr[1] == checkArr[1]){
                    checkSecret -= 1;
                }
                myArr[1] -= 1;
                break;
            case 'G':
                if(myArr[2] == checkArr[2]){
                    checkSecret -= 1;
                }
                myArr[2] -= 1;
                break;
            case 'T':
                if(myArr[3] == checkArr[3]){
                    checkSecret -= 1;
                }
                myArr[3] -= 1;
                break;
        }

    }
}

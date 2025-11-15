import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class _1874 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] input = new int[N];
        boolean result = true;
        for(int i=0;i<N;i++){
            input[i]= sc.nextInt();
        }

        Stack<Integer> st = new Stack<>();
        int top = 0;
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<N;i++) {
            int num = input[i];
            if(top<num){
                while(top!=num){
                    st.push(++top);
                    sb.append("+\n");
                }
                st.pop();
                sb.append("-\n");
            }
            else{
                if(st.pop()==num){
                    sb.append("-\n");
                }
                else{
                    result = false;
                }
            }

        }
        if(result) System.out.println(sb);
        else System.out.println("NO");
    }

}

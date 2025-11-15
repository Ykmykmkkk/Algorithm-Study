import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class _11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> myQueue = new PriorityQueue<>(
                (o1, o2) -> {
                    int first_abs = Math.abs(o1);
                    int second_abs = Math.abs(o2);

                    if (first_abs == second_abs) {
                        return o1 - o2; // 원래 값 기준 오름차순
                    }
                    return first_abs - second_abs; // 절댓값 기준 오름차순
                }
        );
        for(int i = 0;i < N;i++){
            int input = Integer.parseInt(br.readLine());
            if(input!=0){
                myQueue.add(input);
            }
            else{
                if(myQueue.isEmpty()){
                    System.out.println("0");
                }
                else{
                    System.out.println(myQueue.poll());
                }
            }
        }

    }
}

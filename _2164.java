import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _2164 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> myQueue = new LinkedList<Integer>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            myQueue.add(i+1);
        }
        int last = 0;
        while(myQueue.size()>1){
            myQueue.poll();
            myQueue.add(myQueue.poll());
        }
        System.out.println(myQueue.peek());
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _quicksort {
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        arr = new int[N+1];
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        arr[N] = 399992382; // 더미 값 채우기
        quicksort(arr,0,N);
        for(int i=0;i<N;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void quicksort(int[] arr,int startIndex,int lastIndex){
        if(startIndex<lastIndex){
            int index = partition(arr,startIndex,lastIndex);
            quicksort(arr,startIndex,index-1);
            quicksort(arr,index+1,lastIndex);
        }
    }
    public static int partition(int[] arr,int startIndex,int lastIndex){
        int pivot = arr[startIndex];
        int leftpt = startIndex + 1;
        int rightpt = lastIndex;
        while(true)
        {
            while(arr[leftpt]<pivot) leftpt++;
            while(arr[rightpt]>pivot) rightpt--;
            if(leftpt<rightpt) {
                int temp = arr[leftpt];
                arr[leftpt] = arr[rightpt];
                arr[rightpt] = temp;
            } else break;
        }
        int temp = arr[startIndex];
        arr[startIndex] = arr[rightpt];
        arr[rightpt] = temp;
        return rightpt;
    }
}

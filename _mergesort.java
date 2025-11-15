import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _mergesort {
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        mergesort(arr,0,N-1);
        for(int i=0;i<N;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void mergesort(int[] arr,int startIndex,int lastIndex){
        if(startIndex<lastIndex){
            int midIndex = (startIndex + lastIndex)/2;
            mergesort(arr,startIndex,midIndex);
            mergesort(arr,midIndex+1,lastIndex);
            merge(arr,startIndex, midIndex, lastIndex);
        }
    }
    public static void merge(int[] arr,int startIndex, int midIndex, int lastIndex){
        int leftptr = startIndex;
        int rightptr = midIndex+1;
        int[] temp = new int[lastIndex-startIndex+1];
        int tempptr = 0;
        while(leftptr<=midIndex && rightptr <= lastIndex){
            if(arr[leftptr]<arr[rightptr]) temp[tempptr++] = arr[leftptr++];
            else temp[tempptr++] = arr[rightptr++];
        }
        while (leftptr <= midIndex) {
            temp[tempptr++] = arr[leftptr++];
        }

        // 남은 오른쪽 부분 처리
        while (rightptr <= lastIndex) {
            temp[tempptr++] = arr[rightptr++];
        }
        for(int i=0;i<temp.length;i++) {
            arr[startIndex+i] = temp[i];
        }
    }

}

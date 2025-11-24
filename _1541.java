import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();
        String[] minus;
        minus = st.split("-");
        int val = 0;
        for(int i=0;i<minus.length;i++){
            String[] plus = minus[i].split("\\+");
            int plusVal = 0;
            for(String a: plus){
                plusVal += Integer.parseInt(a);
            }
            if(i!=0){
                val -= plusVal;
            } else{
                val = plusVal;
            }
        }
        System.out.println(val);
    }
}

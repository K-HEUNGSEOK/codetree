import java.io.*;
import java.nio.Buffer;
import java.sql.SQLOutput;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
     
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for(int i = 0 ; i < n ; i ++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        int ans = 0 ;
        for(int i = 0 ; i < n ; i ++){
            int [] counting = new int[1001];
            for(int j = 0 ; j < n ; j ++){
                if (j == i) continue;

                for(int k = x[j]; k < y[j]; k ++){
                    counting[k] ++;
                }
            }
            int sum = 0;
            for (int i1 : counting) {
                if (i1 > 0){
                    sum ++;
                }
            }
            ans = Math.max(ans,sum);
        }
        System.out.println(ans);
    }
}

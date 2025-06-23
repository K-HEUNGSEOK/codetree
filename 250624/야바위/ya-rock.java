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
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        int[] box = new int[n + 1];
        int[] check = new int[n + 1];
        for(int i = 0 ; i < n; i ++){
            a[i] =sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }
        for(int i = 1 ; i <= n ; i ++){
            box[i] = 1;
            int ans = 0;
            for(int j = 0 ; j < n ; j ++){
                int temp = box[a[j]];
                box[a[j]] = box[b[j]];
                box[b[j]] = temp;
                if(box[c[j]] == 1){
                    ans ++;
                }
            }
            check[i] = ans;
        }
        int max = 0 ;
        for(int i = 1; i<= n ; i ++){
            if (max < check[i]){
                max = i;
            }
        }
        System.out.println(max);
    }
}

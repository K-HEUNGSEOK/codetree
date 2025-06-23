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
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i ++){
            arr[i] = sc.nextInt();
        }
        int ans = Integer.MAX_VALUE;
        for(int i = 0 ; i < n ; i ++){
            arr[i] *=2 ;
            for(int j = 0 ; j < n ; j ++){
                int total = 0;
                int prev = -1;
                for(int k = 0 ; k < n ; k ++){
                    if (k == j )continue;
                    if (prev != -1){
                        total += Math.abs(arr[k] - arr[prev]);
                    }
                    prev = k ;
                }
                ans = Math.min(ans,total);
            }
            arr[i] /= 2;
        }
        System.out.println(ans);
    }
}

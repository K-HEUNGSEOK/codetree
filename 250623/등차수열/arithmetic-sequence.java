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
        int[] arr = new int[n + 1];
        for(int i = 0 ; i < n ; i ++){
            arr[i] = sc.nextInt();
        }int ans = 0;
        for(int i = 1 ; i <= 100; i ++){
            for(int j = 0 ; j < n ; j ++){
                int first = arr[j] - i;
                for(int k = 0; k < n ;k ++){
                    if (k==j) continue;
                    if (1 <= arr[j] && arr[j] <= arr[k]){
                    int second = i - arr[k];
                    if (first == second){
                        ans++;
                    }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}

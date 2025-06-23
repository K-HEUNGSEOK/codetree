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
        for(int k = 1 ; k <= 100; k ++){
            int cnt = 0;
            for(int i = 0 ; i < n ; i ++){
                for(int j = i + 1; j < n ; j ++){
                    if (arr[i] - k == k - arr[j]){
                        cnt ++;
                    }
                }
                ans = Math.max(ans,cnt);
            }
        }
        System.out.println(ans);
    }
}

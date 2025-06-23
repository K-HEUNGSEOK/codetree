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
        int max = 0;
        int[] arr = new int[n+1];
        for(int i = 0 ; i < n ; i ++){
            arr[i] = sc.nextInt();
            max = Math.max(max,arr[i]);
        }
        int ans = 0;
        for(int k = 1 ; k <= max; k ++){
            int cnt = 0;
            for(int i = 0 ; i < n ; i ++){
                if (arr[i] > k){
                    cnt ++;
                    for(int j = i + 1; j < n ; j ++){
                        if (arr[j] <= k ){
                            i = j;
                            break;
                        }
                    }
                }
            }
            ans = Math.max(ans,cnt);
        }
        System.out.println(ans);
    }
}

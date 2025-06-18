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
        int k = sc.nextInt();
        int [] box = new int[101];
        for(int i = 0; i < n ; i ++){
            int can = sc.nextInt();
            int p = sc.nextInt();
            box[p] += can;
        }
        // int total = 0;
        // if (n < k){
        //     for (int i : box) {
        //         total += i;
        //     }
        //     System.out.println(total);
        //     System.exit(0);
        // }
        int ans = 0;
        for(int i = 1; i <= 200; i ++){
            int sum = 0;
            for(int j = i - k ; j <= i + k; j ++){
                if (j < 1 || j > 100) break;
                sum += box[j];
            }
            ans = Math.max(ans,sum);
        }
        System.out.println(ans);
    }
}

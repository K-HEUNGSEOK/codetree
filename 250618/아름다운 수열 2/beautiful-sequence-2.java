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
        int m = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        Arrays.sort(b);
        int ans = 0;
        for (int i = 0; i <= n - m; i++) {
            boolean key = true;
            int[] copy = new int[m];
            int cnt = 0;
            for (int j = i; j < m + i; j++) {
                copy[cnt++] = a[j];
            }
            Arrays.sort(copy);
            for(int j = 0 ; j < m ; j ++){
                if (copy[j] != b[j]){
                    key = false;
                    break;
                }
            }
            if (key){
                ans++;
            }
        }
        System.out.println(ans);
    }
}

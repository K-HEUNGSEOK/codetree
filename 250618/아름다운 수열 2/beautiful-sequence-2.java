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
        int ans = 0;
        for (int i = 0; i <= n - m; i++) {
            boolean key = true;
            for (int j = i; j < m + i; j++) {
                if (!check(a[j], b)){
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

    private static boolean check(int num, int[] b) {
        for (int target : b) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }
}

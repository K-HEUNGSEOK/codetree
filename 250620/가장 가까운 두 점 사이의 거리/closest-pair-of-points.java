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
        int [] x = new int[n];
        int [] y = new int[n];
        for(int i = 0 ; i < n ; i ++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        int ans = Integer.MAX_VALUE;
        for(int i = 0 ; i < n ; i  ++){
            int x1 = x[i];
            int y1 = y[i];
            int x2 = 0;
            int y2 = 0;
            for(int j = 0; j < n ; j ++){
                if (j == i) continue;
                x2 = x[j];
                y2 = y[j];
                int sum1 = (int) Math.pow((x1 - x2),2);
                int sum2 = (int) Math.pow((y1-y2),2);
                ans = Math.min(ans, sum1 + sum2);
            }
        }
        System.out.println(ans);
    }
}

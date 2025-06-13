import java.io.*;
import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
    
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n+1];
        for(int i = 1; i <= n ; i ++){
            arr[i] = sc.nextInt();
        }
        int result = Integer.MAX_VALUE;
        for(int i =1 ; i <= n; i ++){
            int ans = 0;
            for(int j = 1; j <= n ; j ++){
                if (i == j) continue;
                int distance = ((j - i) + n) % n;
                ans += arr[j] * distance;
            }
            result = Math.min(result,ans);
        }
        System.out.println(result);
        }

    }
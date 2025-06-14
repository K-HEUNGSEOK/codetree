import java.io.*;
import java.sql.SQLOutput;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
    
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i ++){
            arr[i] = sc.nextInt();
        }
        int ans = Integer.MAX_VALUE;
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j <n ; j ++){
                int total = 0;
                for(int k = 0 ; k < n ; k ++){
                    if (k == i || k == j) continue;
                    total += arr[k];
                }
                ans = Math.min(ans, Math.abs(total - target));
            }
        }
        System.out.println(ans);
    }
}
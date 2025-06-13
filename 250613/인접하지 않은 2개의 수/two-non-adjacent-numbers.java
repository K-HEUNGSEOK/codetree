import java.io.*;
import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
   
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int ans = 0;
        for(int i =0 ; i < n ; i ++){
            int total = 0;
            for(int j = 0 ; j < n ; j ++){
                if (i == j || i -1 == j || i + 1 == j) continue;
                total += arr[i] + arr[j];
                ans =Math.max(ans,total);
                total = 0;
            }
        }
        System.out.println(ans);
    }
}
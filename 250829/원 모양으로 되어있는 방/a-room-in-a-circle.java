import javax.print.DocFlavor;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.nio.Buffer;
import java.sql.SQLOutput;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
     
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        for(int i = 1; i <= n ; i ++){
            arr[i] = sc.nextInt();
        }
        int ans = Integer.MAX_VALUE;
        for(int i = 1; i <= n ; i ++){
            int cnt = 0;
            int total = 0;
            for(int j = i; j < i+n ; j ++){
                int dist = j;
                if (j > n){
                    dist = j % n;
                }
                total += arr[dist] * cnt;
                cnt ++;
            }
            ans = Math.min(ans, total);
        }
        System.out.println(ans);
    }
}
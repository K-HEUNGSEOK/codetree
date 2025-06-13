import java.io.*;
import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
      
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for(int i = 0 ; i < n ; i ++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        int result= 0 ;
        for(int i = 1 ; i < n -1; i ++){
            int ans = 0;
            for(int j = 1; j < n -1; j ++){
                if (i == j) continue;
               ans += getNumber(x[0], y[0], x[j], y[j]);
            }
            ans += getNumber(x[n-2],y[n-2], x[n-1],y[n-1]);
            result = Math.max(result,ans);
        }
        System.out.println(result);
    }
    static int getNumber(int x1, int y1, int x2, int y2){
        return Math.abs(x1 - x2) + Math.abs(y1 + y2);
    }
}
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
        int ans = Integer.MAX_VALUE;
        for(int i = 1; i < n -1; i ++){
            int total = 0;
            int current = 0;
            for(int j = 1 ; j < n ; j++){
                if (i==j) continue;
                total += getNumber(x[current],y[current],x[j],y[j]);
                current = j;
            }
            ans = Math.min(ans,total);
        }
        System.out.println(ans);
    }
    static int getNumber(int x1, int y1, int x2, int y2){
        return Math.abs(x1 - x2) + Math.abs(y1 - y2);
    }
}
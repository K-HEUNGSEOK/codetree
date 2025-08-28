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
        int[][] arr = new int[n][n];
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < n ; j ++){
                arr[i][j] = sc.nextInt();
            }
        }
        int ans = 0;

        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < n ; j ++){
                int cnt = 0;
                for(int k = j; k < j + 3; k ++){
                    if (isRange(i,k,n) && arr[i][k] == 1){
                        cnt ++;
                    }
                }
                ans = Math.max(ans,cnt);
            }
        }

        System.out.print(ans);
    }
    static boolean isRange(int x, int y, int n){
        return 0 <= x && x < n && 0 <= y && y < n;
    }
}
import java.io.*;
import java.sql.SQLOutput;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
     
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i < n ; i ++){
            for(int j = 0; j < n ; j ++){
                arr[i][j] = sc.nextInt();
            }
        }
        int ans = 0;
        for(int i = 0; i < n ; i ++){
            for(int j = 0 ; j < n -2; j ++){
                for(int k = 0 ; k < n ; k ++){
                    for(int l = 0 ; l < n - 2;  l ++){
                        if (i == k && Math.abs(j - l) <= 2) continue;
                        int totalA = arr[i][j] + arr[i][j+1] + arr[i][j+2] ;
                        int totalB = arr[k][l] + arr[k][l+1] + arr[k][l+2] ;
                        ans = Math.max(ans,totalB + totalA);
                    }
                }
            }
        }
        System.out.println(ans);
    }
}